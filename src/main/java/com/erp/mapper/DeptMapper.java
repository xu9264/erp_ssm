package com.erp.mapper;

import com.erp.pojo.Dept;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeptMapper {
    /**
     * 获取总数
     * @return
     */
    int count();
    /**
     * 分页查询
     * @param startNum 起始位置
     * @param pageSize 每页条数
     * @return
     */
    List<Dept> page(@Param("startNum") int startNum, @Param("pageSize") int pageSize);

    void remove(@Param("ids") Integer[] ids);
    void update(@Param("dept") Dept dept);
    Dept findById(@Param("id") int id);
    void add(@Param("dept") Dept dept);

    List<Dept> findAll();
}
