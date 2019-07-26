package service;

import entity.Account;
import entity.House;
import entity.OrderDetail;

import java.util.Optional;

public interface OrderDetailService {
    Iterable<OrderDetail> findAll();
    void save(OrderDetail orderDetail);
    void remove(Long id);
    Optional<OrderDetail> findById(Long id);
    Iterable<OrderDetail> findAllByAccount(Account account);
    Iterable<OrderDetail> findAllByHouse(House house);

}
