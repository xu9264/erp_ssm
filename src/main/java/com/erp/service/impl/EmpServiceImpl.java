package com.erp.service.impl;

import com.erp.mapper.EmpMapper;
import com.erp.mapper.EmpRoleMapper;
import com.erp.mapper.PermissionMapper;
import com.erp.pojo.Emp;
import com.erp.service.EmpService;
import com.erp.util.EasyUiResultUtil;
import com.erp.util.TreeResultUtil;
import com.erp.vo.EmpVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl  implements EmpService {

    @Autowired(required = false)
    @Qualifier("empMapper")
    private EmpMapper empMapper;

    @Autowired
    private EmpRoleMapper empRoleMapper;
    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public void remove(int[] ids) {
        empMapper.remove(ids);
        empRoleMapper.remove(ids);
    }

    @Override
    public void update(Emp emp, int[] roleIds) {
        empMapper.update(emp);
        empRoleMapper.remove(new int[]{emp.getId()});
        empRoleMapper.add(emp.getId(),roleIds);
    }

    @Override
    public EmpVo findById(int id) {
        return empMapper.findById(id);
    }

    @Override
    public void add(Emp emp, int[] roleIds) {
    String tel=emp.getTel();
    String idCardNo=emp.getIdCardNo();
    System.out.println(tel.length());
        System.out.println(idCardNo.length());
    String password=tel.substring(tel.length()-4)+idCardNo.substring(idCardNo.length()-4);
    String birthDate=idCardNo.substring(6,14);
    StringBuilder stringBuilder=new StringBuilder(birthDate);
    stringBuilder.insert(6,"/").insert(4,"/");
    emp.setPassword(password);
    emp.setBirthDate(stringBuilder.toString());


    empMapper.add(emp);
    int empId=empMapper.getKey();
    empRoleMapper.add(empId,roleIds);
    }

    @Override
    public EasyUiResultUtil<EmpVo> page(EmpVo wheres, int pageNum, int pageSize) {
        List<EmpVo> page=empMapper.page(wheres,(pageNum-1)*pageSize,pageSize);
        int count=empMapper.count(wheres);
        System.out.println("条条条件"+wheres.toString());
        System.out.println("分分分页"+page);
        return new EasyUiResultUtil<EmpVo>(count,page);

    }

    @Override
    public Emp login(String username, String password) {
        return empMapper.login(username,password);
    }

    @Override
    public List<TreeResultUtil> getPerms(String username) {
        return permissionMapper.getPerms(username);
    }
}
