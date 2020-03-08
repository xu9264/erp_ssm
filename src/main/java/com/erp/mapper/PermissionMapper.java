package com.erp.mapper;

import com.erp.util.TreeResultUtil;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PermissionMapper {
    List<TreeResultUtil> list();

    List<Integer> findPermissionIdsByRoleId(@Param("roleId") int roleId);

    void deleteRolePermByroleId(@Param("roleId") Integer roleId);

    void addRolePerm(@Param("roleId") Integer roleId,@Param("permIds") int[] permIds);

    List<TreeResultUtil> getPerms(@Param("username") String username);
}
