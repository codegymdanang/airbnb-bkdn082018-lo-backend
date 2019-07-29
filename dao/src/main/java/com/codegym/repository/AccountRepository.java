package com.codegym.repository;

import com.codegym.entity.Account;
import com.codegym.entity.Province;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AccountRepository extends PagingAndSortingRepository<Account,Long> {
    Account findByUserName(String username);

    Account findByEmail(String email);

    Iterable<Account> findAllByProvince(Province province);
}
