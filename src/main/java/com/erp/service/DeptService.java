package com.erp.service;

import com.erp.pojo.Dept;
import com.erp.util.EasyUiResultUtil;

import java.util.List;

public interface DeptService {
    /**
     *
     * @param pageNum 页码
     * @param pageSize
     * @return
     */
    EasyUiResultUtil<Dept> page(int pageNum, int pageSize);
    void remove(Integer[] ids);
    void update(Dept dept);
    Dept findById(int id);
    void add(Dept dept);

    /**
     * 查询所有部门id:name 做数据回显
     * @return
     */
    List<Dept> findAll();
}
