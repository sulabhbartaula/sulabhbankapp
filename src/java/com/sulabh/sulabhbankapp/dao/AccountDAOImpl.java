package com.sulabh.sulabhbankapp.dao;

import com.sulabh.sulabhbankapp.entity.AccountEntity;
import com.sulabh.sulabhbankapp.model.Account;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

@Repository
public class AccountDAOImpl implements AccountDAO {
   

    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public boolean saveAccount(Account account) {
        boolean saveFlag = true;
        System.out.println(account);
                    AccountEntity accountEntity = new AccountEntity();
                    accountEntity.setAccountNo(account.getAccountNo());
                    accountEntity.setAccountHolderName(account.getAccountHolderName());
                    accountEntity.setBalance(account.getBalance());
                    
                    try {
			Session currentSession = sessionFactory.getCurrentSession();
			//currentSession.save(accountEntity);
			currentSession.saveOrUpdate(accountEntity);
		} catch (Exception ex) {
			// TODO: handle exception
			ex.printStackTrace();
			saveFlag = false;
		}
		return saveFlag;
			
    }
    
}
