
package com.sulabh.sulabhbankapp.controller;

import com.sulabh.sulabhbankapp.model.Account;
import com.sulabh.sulabhbankapp.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class AccountController {
    
    @Autowired
    private AccountService accountService;
    
    @RequestMapping(method=RequestMethod.GET)
    public String showHomePage(){
        System.out.println("Hello");
        return "index";
    }
    
    @RequestMapping("/new")
    public String createAccount(Model model){
        model.addAttribute("account",new Account());
        return "account-form";
    }
    
    @RequestMapping(value="/saveAccount",method=RequestMethod.POST)
    public String saveAccount(Account account,Model model){
        boolean flag = accountService.saveAccount(account);
        System.out.println(flag);
        return "showAccount";
    }
    
    @RequestMapping(value="*")
    public String pagenotfound(){
        return "pagenotfound";
    }
    
}
