/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sulabh.sulabhbankapp.service;

import com.sulabh.sulabhbankapp.dao.AccountDAO;
import com.sulabh.sulabhbankapp.dao.AccountDAOImpl;
import com.sulabh.sulabhbankapp.model.Account;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDAO accountDAO;

    @Override
    @Transactional
    public boolean saveAccount(Account account) {
        return accountDAO.saveAccount(account);
    }
    
}
