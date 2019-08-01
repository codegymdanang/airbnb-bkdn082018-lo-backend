package com.codegym.repository;

import com.codegym.entity.House;
import com.codegym.entity.OrderDetail;
import com.codegym.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface OrderDetailRepository extends PagingAndSortingRepository<OrderDetail,Long> {
    Iterable<OrderDetail> findAllByUser(User user);
    Iterable<OrderDetail> findAllByHouse(House house);

}
