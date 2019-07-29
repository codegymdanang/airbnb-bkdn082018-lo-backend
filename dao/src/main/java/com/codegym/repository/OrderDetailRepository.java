package com.codegym.repository;

import com.codegym.entity.Account;
import com.codegym.entity.House;
import com.codegym.entity.OrderDetail;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface OrderDetailRepository extends PagingAndSortingRepository<OrderDetail,Long> {
    Iterable<OrderDetail> findAllByAccount(Account account);
    Iterable<OrderDetail> findAllByHouse(House house);

}
