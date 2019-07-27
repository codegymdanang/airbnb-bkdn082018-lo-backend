package com.codegym.entity;


import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String content;
    @OneToMany(mappedBy = "house",
            cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH}, fetch = FetchType.EAGER)
    @Fetch(value = FetchMode.SUBSELECT)
//    @OneToMany(targetEntity = House.class)
    private List<House> houseList;

    public Status() {
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public List<House> getHouseList() {
        return houseList;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setHouseList(List<House> houseList) {
        this.houseList = houseList;
    }
}
