package com.loo.controller;

import com.codegym.entity.OrderDetail;
import com.looo.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderDetailController {
    @Autowired
    private OrderDetailService orderDetailService;

    @GetMapping("/orderDetail")
    public ResponseEntity<Iterable<OrderDetail>> getOrderDetailList(){
        Iterable<OrderDetail> orderDetails = orderDetailService.findAll();

        return new ResponseEntity<>(orderDetails, HttpStatus.OK);
    }
}

