package web.service;

import web.model.Role;

import java.util.HashSet;
import java.util.List;

public interface RoleService {
    void addRole(Role role);
    List<Role> roleList();
    Role getRoleById(int id);
    void updateRole(Role role);
    void removeRole(int id);
    Role findByRoleName(String name);
    HashSet<Role> getSetOfRoles(String[] roleSet);
}
