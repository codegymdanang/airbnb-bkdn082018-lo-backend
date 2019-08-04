package com.codegym.entity;

import javax.persistence.*;

@Entity
@Table(name = "house")
public class House {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String image;
    private String description;
    private Integer bathRoomQuantity;
    private Integer bedRoomQuantity;
    private Double price;
    @OneToOne(cascade = CascadeType.ALL)
    private Province province;
    @OneToOne(cascade = CascadeType.ALL)
    private District district;
    @OneToOne(cascade = CascadeType.ALL)
    private Village village;

    public House() {
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

    public Integer getBathRoomQuantity() {
        return bathRoomQuantity;
    }

    public Integer getBedRoomQuantity() {
        return bedRoomQuantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setBathRoomQuantity(Integer bathRoomQuantity) {
        this.bathRoomQuantity = bathRoomQuantity;
    }

    public void setBedRoomQuantity(Integer bedRoomQuantity) {
        this.bedRoomQuantity = bedRoomQuantity;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public Village getVillage() {
        return village;
    }

    public void setVillage(Village village) {
        this.village = village;
    }
}

