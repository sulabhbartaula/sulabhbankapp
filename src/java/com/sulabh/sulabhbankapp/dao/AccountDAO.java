package com.sulabh.sulabhbankapp.dao;

import com.sulabh.sulabhbankapp.model.Account;
import org.springframework.stereotype.Repository;

@Repository(value="AccountDAO")
public interface AccountDAO {
    public boolean saveAccount(Account account);
    
}
