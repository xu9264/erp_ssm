package com.erp.mapper;

import org.apache.ibatis.annotations.Param;

public interface EmpRoleMapper {
    void  remove(@Param("ids") int[] ids);
    void  add(@Param("empId") Integer empId ,@Param("roleIds") int[] roleIds );

}
