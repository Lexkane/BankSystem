package com.lexkane.banksystem.service.Impl;

import com.lexkane.banksystem.dao.UserDAO;
import com.lexkane.banksystem.domain.User;
import com.lexkane.banksystem.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserSecurityService implements UserDetailsService {

    private static final Logger LOG = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserDAO userDAO;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDAO.findByUsername(username);
        if (null==user){
            LOG.info("Not found");
            throw new UsernameNotFoundException("Username "+ username + "not found.");
        }
        return user;
    }
}
