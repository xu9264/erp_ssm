package com.erp.service;

import com.erp.pojo.Emp;
import com.erp.util.EasyUiResultUtil;
import com.erp.util.TreeResultUtil;
import com.erp.vo.EmpVo;

import java.util.List;

public interface EmpService {
    void remove(int[] ids);

    void update (Emp emp,int[] roleIds);

    EmpVo findById(int id);

    void  add(Emp emp,int[] roleIds);

    EasyUiResultUtil<EmpVo> page(EmpVo wheres,
                                 int pageNum,
                                 int pageSize);



     Emp login(String username, String password);

    List<TreeResultUtil> getPerms(String username);
}
