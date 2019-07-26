package controller;

import entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.AccountService;


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
