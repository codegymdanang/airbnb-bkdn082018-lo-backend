package com.codegym.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orderDetail")
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date checkInDate;

    private Date checkOutDate;

    private Long amountOfMoney;


    @ManyToOne(targetEntity = House.class)
    @JoinColumn(name = "id_house")
    private House house;

    @ManyToOne(targetEntity = Account.class)
    @JoinColumn(name = "id_account")
    private Account account;

    public OrderDetail() {
    }

    public Long getId() {
        return id;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public Long getAmountOfMoney() {
        return amountOfMoney;
    }

    public House getHouse() {
        return house;
    }

    public Account getAccount() {
        return account;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public void setAmountOfMoney(Long amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
