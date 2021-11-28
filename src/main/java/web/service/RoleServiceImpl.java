package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.RoleDao;
import web.model.Role;

import java.util.HashSet;
import java.util.List;

@Service
@Transactional
public class RoleServiceImpl implements RoleService{

    private RoleDao roleDao;

    @Autowired
    public void setRoleDao(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public void addRole(Role role) {
        roleDao.addRole(role);
    }

    @Override
    public List<Role> roleList() {
        return roleDao.roleList();
    }

    @Override
    public Role getRoleById(int id) {
        return roleDao.getRoleById(id);
    }

    @Override
    public void updateRole(Role role) {
        roleDao.updateRole(role);
    }

    @Override
    public void removeRole(int id) {
        roleDao.removeRole(id);
    }

    @Override
    public Role findByRoleName(String name) {
        return roleDao.findByRoleName(name);
    }

    @Override
    public HashSet<Role> getSetOfRoles(String[] roleSet){
        return roleDao.getSetOfRoles(roleSet);
    }
}

