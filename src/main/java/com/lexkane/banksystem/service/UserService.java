package com.lexkane.banksystem.service;

import com.lexkane.banksystem.domain.User;
import com.lexkane.banksystem.domain.security.UserRole;

import java.util.Set;

public interface UserService {
    User findByUsername(String username);

    User findByEmail(String email);

    boolean checkUserExists(String username, String email);

    boolean checkUsernameExists(String username);

    boolean checkEmailExists(String email);

    void save (User user);

    public User createUser(User user, Set<UserRole> userRoles);
}
