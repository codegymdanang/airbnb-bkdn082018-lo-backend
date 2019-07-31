package com.looo.service;

import com.codegym.entity.House;
import com.codegym.entity.OrderDetail;
import com.codegym.entity.User;
import com.codegym.repository.OrderDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class OrderDetailServiceImpl implements OrderDetailService {

    @Autowired
    OrderDetailRepository orderDetailRepository;

    @Override
    public Iterable<OrderDetail> findAll() {
        return orderDetailRepository.findAll();
    }

    @Override
    public void save(OrderDetail orderDetail){
     orderDetailRepository.save(orderDetail);
    }

    @Override
    public void remove(Long id) {
        orderDetailRepository.deleteById(id);
    }

    @Override
    public Optional<OrderDetail> findById(Long id) {
        return orderDetailRepository.findById(id);
    }

    @Override
    public Iterable<OrderDetail> findAllByAccount(User user) {
        return orderDetailRepository.findAllByUser(user);
    }

    @Override
    public Iterable<OrderDetail> findAllByHouse(House house) {
        return orderDetailRepository.findAllByHouse(house);
    }
}
