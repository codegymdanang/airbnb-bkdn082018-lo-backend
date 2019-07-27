package com.codegym.entity;


import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "province")
public class Province {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

//    @OneToMany(targetEntity = District.class)
    @OneToMany(targetEntity = District.class,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH}, fetch = FetchType.EAGER)
    @Fetch(value = FetchMode.SUBSELECT)
    private List<District> districtList;
//
////    @OneToMany(targetEntity = Village.class)
//    @OneToMany(targetEntity = Village.class,
//            cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH}, fetch = FetchType.EAGER)
//    @Fetch(value = FetchMode.SUBSELECT)
//    private List<Village> villageList;
//
//    public List<Village> getVillageList() {
//        return villageList;
//    }
//
//    public void setVillageList(List<Village> villageList) {
//        this.villageList = villageList;
//    }

    public List<District> getDistrictList() {
        return districtList;
    }

    public void setDistrictList(List<District> districtList) {
        this.districtList = districtList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Province(){}

    public Province(Long id, String name){
        this.id = id;
        this.name = name;
    }
}
