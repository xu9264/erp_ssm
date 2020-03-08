package com.erp.service;

import com.erp.pojo.Role;
import com.erp.util.EasyUiResultUtil;
import com.erp.util.TreeResultUtil;

import java.util.List;

public interface RoleService {
    List<TreeResultUtil> permissionList();
    /**
     *
     * @param pageNum 页码
     * @param pageSize
     * @return
     */
    EasyUiResultUtil<Role> page(int pageNum, int pageSize);
    void remove(Integer[] ids);
    void update(Role role);
    Role findById(int id);
    void add(Role role);

    List<Role> findAll();

    /**
     * 根据角色id查询拥有的所有权限id
     * @param roleId
     * @return
     */
    List<Integer> findPermissionIdsByRoleId(int roleId);

    void updatePerm(Integer roleId, int[] permIds);
}
