package com.loo.controller;

import com.codegym.entity.Account;
import com.codegym.repository.AccountDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

public class MainRESTController {

    @Autowired
    private AccountDAO accountDAO;

    @RequestMapping("/")
    @ResponseBody
    public String welcome() {
        return "Welcome to RestTemplate Example.";
    }

    @RequestMapping(value = "/accounts", method = RequestMethod.GET)
    @ResponseBody
    public List<Account> getaccounts() {
        return accountDAO.findAll();
    }


    @RequestMapping(value = "/account/{index}", //
            method = RequestMethod.GET)
    @ResponseBody
    public Optional<Account> getaccount(@PathVariable("index") Long index) {
        return accountDAO.findById(index);
    }

    @RequestMapping(value = "/account", //
            method = RequestMethod.POST//
            )
    @ResponseBody
    public Account addaccount(@RequestBody Account emp) {

        System.out.println("(Service Side) Creating account: " + emp.getUserName());

        return accountDAO.save(emp);
    }

    @RequestMapping(value = "/account",method = RequestMethod.PUT)
    @ResponseBody
    public Account updateaccount(@RequestBody Account emp) {

        System.out.println("(Service Side) Editing account: " + emp.getUserName());

        return accountDAO.save(emp);
    }

    // URL:
    // http://localhost:8080/SomeContextPath/account/{index}
    @RequestMapping(value = "/account/{index}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteaccount(@PathVariable("index") Account index) {

        System.out.println("(Service Side) Deleting account: " + index);

        accountDAO.delete(index);
    }

}
