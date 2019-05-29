package com.lexkane.banksystem.dao;

import com.lexkane.banksystem.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserDAO extends CrudRepository<User, Long> {
    User findByUsername(String username);
    User findByEmail(String email);
    List<User> findAll();
}
