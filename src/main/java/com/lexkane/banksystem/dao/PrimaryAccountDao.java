package com.lexkane.banksystem.dao;

import com.lexkane.banksystem.domain.PrimaryAccount;
import org.springframework.data.repository.CrudRepository;

public interface PrimaryAccountDao extends CrudRepository<PrimaryAccount, Long> {
    PrimaryAccount findByAccountNumber(int accountNumber);
}
