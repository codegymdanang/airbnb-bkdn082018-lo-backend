package com.looo.service;

import com.codegym.entity.Account;
import com.codegym.entity.Province;

import java.util.Optional;

public interface AccountService {
    Iterable<Account> findAll();

    Account findAccountByUsername(String username);

    Account findAccountByEmail(String email);

    void save(Account account);

    Optional<Account> findById(Long id);

     Iterable<Account> findAllByProvince(Province province);
}
