package web.dao;

import web.model.Role;
import web.model.User;

import java.util.HashSet;
import java.util.List;

public interface RoleDao {
    void addRole(Role role);
    List<Role> roleList();
    Role getRoleById(int id);
    void updateRole(Role role);
    void removeRole(int id);
    Role findByRoleName(String name);
    HashSet<Role> getSetOfRoles(String[] nameRoles);
}
