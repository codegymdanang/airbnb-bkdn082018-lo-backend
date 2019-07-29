package com.loo.controller;

import com.codegym.entity.Account;
import com.looo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/account")
    public ResponseEntity<Iterable<Account>> getAccountList(){
        Iterable<Account> accounts = accountService.findAll();

        return new ResponseEntity<>(accounts, HttpStatus.OK);
    }
}
