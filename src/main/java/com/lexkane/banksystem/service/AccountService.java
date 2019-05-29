package com.lexkane.banksystem.service;

import com.lexkane.banksystem.domain.PrimaryAccount;
import com.lexkane.banksystem.domain.SavingsAccount;

import java.security.Principal;

public interface AccountService {
    PrimaryAccount createPrimaryAccount();
    SavingsAccount createSavingsAccount();

    public void deposit(String accountType, double amount, Principal principal);
}
