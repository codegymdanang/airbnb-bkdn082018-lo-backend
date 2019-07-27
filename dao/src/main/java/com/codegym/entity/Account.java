package com.codegym.entity;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "account")

public class Account {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
    String address;

    String phoneNumber;

    String password;

    String userName;

    String email;

    String role;

    @ManyToOne(targetEntity = Province.class)
    @JoinColumn(name = "id_province")
    private Province province;


    @OneToMany(targetEntity = OrderDetail.class,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH}, fetch = FetchType.EAGER)
    @Fetch(value = FetchMode.SUBSELECT)
    private List<OrderDetail> orderDetailList;
    public Account() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public List<OrderDetail> getOrderDetailList() {
        return orderDetailList;
    }

    public void setOrderDetailList(List<OrderDetail> orderDetailList) {
        this.orderDetailList = orderDetailList;
    }

    public Account(String address, String phoneNumber, String password, String userName, String email, String role, Province province, List<OrderDetail> orderDetailList) {
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.userName = userName;
        this.email = email;
        this.role = role;
        this.province = province;
        this.orderDetailList = orderDetailList;
    }
}
