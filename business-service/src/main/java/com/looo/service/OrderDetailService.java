package com.looo.service;

import com.codegym.entity.House;
import com.codegym.entity.OrderDetail;
import com.codegym.entity.User;

import java.util.Optional;

public interface OrderDetailService {
    Iterable<OrderDetail> findAll();
    void save(OrderDetail orderDetail);
    void remove(Long id);
    Optional<OrderDetail> findById(Long id);
    Iterable<OrderDetail> findAllByAccount(User account);
    Iterable<OrderDetail> findAllByHouse(House house);

}