package com.codegym.entity;

import javax.persistence.*;

@Entity
@Table(name = "village")
public class Village {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @ManyToOne(targetEntity = District.class)
    @JoinColumn(name = "id_district")
    private District district;

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
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

    public Village(){}

    public Village(Long id, String name){
        this.id = id;
        this.name = name;
    }
}
