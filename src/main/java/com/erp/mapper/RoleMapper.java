package com.erp.mapper;

import com.erp.pojo.Role;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleMapper {
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
    List<Role> page(@Param("startNum") int startNum, @Param("pageSize") int pageSize);

    void remove(@Param("ids") Integer[] ids);
    void update(@Param("role") Role role);
    Role findById(@Param("id") int id);
    void add(@Param("role") Role role);

    List<Role> findAll();
}
