package com.lexkane.banksystem.dao;

import com.lexkane.banksystem.domain.security.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleDao extends CrudRepository<Role, Long> {
    Role findByName(String role_user);
}
