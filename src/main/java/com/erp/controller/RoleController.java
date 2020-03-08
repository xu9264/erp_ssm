package com.erp.controller;


import com.erp.pojo.Role;

import com.erp.service.RoleService;
import com.erp.util.EasyUiResultUtil;
import com.erp.util.TreeResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Controller
@RestController//@Controller和@ResponseBody的合体
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private RoleService roleService;



    @RequestMapping("/page")
    @ResponseBody//返回json对象
    public EasyUiResultUtil<Role> page(@RequestParam(defaultValue = "1") int pageNum,
                                       @RequestParam(defaultValue = "2") int pageSize){
        return roleService.page(pageNum,pageSize);
    }
    @RequestMapping("updatePerm")
    public  boolean updatePerm(Integer roleId,int[] permIds){
        roleService.updatePerm(roleId,permIds);

        return true;
    }
    @RequestMapping("findPermissionIdsByRoleId")
    public List<Integer> findPermissionIdsByRoleId(int roleId){
        return  roleService.findPermissionIdsByRoleId(roleId);
    }

    @RequestMapping("permissionList")
    public  List<TreeResultUtil> premissionList(){
        return roleService.permissionList();
    }

    @RequestMapping("findAll")
    public List<Role> findAll(){
        return roleService.findAll();
    }
    @RequestMapping("remove")
    public  boolean remove(Integer[] ids){
        roleService.remove(ids);
        return true;
    }
    @RequestMapping("update")
    public boolean update(Role role){

        roleService.update(role);
        return true;
    }
    @RequestMapping("findById")
    public Role findById(int id){
        return roleService.findById(id);
    }
    @RequestMapping("add")
    public  boolean  add(Role role){
        roleService.add(role);
  return  true;
    }
}
