package com.erp.service.impl;

import com.erp.mapper.PermissionMapper;
import com.erp.mapper.RoleMapper;
import com.erp.pojo.Role;
import com.erp.service.RoleService;

import com.erp.util.EasyUiResultUtil;
import com.erp.util.TreeResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private PermissionMapper permissionMapper;
    @Override
    public List<TreeResultUtil> permissionList() {
    return  permissionMapper.list();

    }

    @Override
    public EasyUiResultUtil<Role> page(int pageNum, int pageSize) {
        //return RoleMapper.page((pageNum-1)*pageSize,pageSize);
        return new EasyUiResultUtil<Role>(roleMapper.count(),roleMapper.page((pageNum-1)*pageSize,pageSize));
    }

    @Override
    public void remove(Integer[] ids) {
        roleMapper.remove(ids);
    }

    @Override
    public void update(Role role) {
        roleMapper.update(role);
    }

    @Override
    public Role findById(int id) {
        return roleMapper.findById(id);
    }

    @Override
    public void add(Role role) {
        roleMapper.add(role);

    }

    @Override
    public List<Role> findAll() {
        return roleMapper.findAll();
    }

    @Override
    public List<Integer> findPermissionIdsByRoleId(int roleId) {
        return permissionMapper.findPermissionIdsByRoleId(roleId);
    }

    @Override
    public void updatePerm(Integer roleId, int[] permIds) {
        //先删除再增加
        permissionMapper.deleteRolePermByroleId(roleId);
        permissionMapper.addRolePerm(roleId,permIds);
    }
}
