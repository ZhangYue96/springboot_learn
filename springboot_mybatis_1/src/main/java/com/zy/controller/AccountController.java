package com.zy.controller;

import com.zy.pojo.Account;
import com.zy.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@Slf4j
public class AccountController {
    public static final Logger log = LoggerFactory.getLogger(AccountController.class);

    @Autowired
    AccountService accountService;

    @ResponseBody
    @RequestMapping("/test")
    public List<Account> test(){
        log.debug("test is running");
        return accountService.findAll();
    }
}
