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

    public House() {
    }

    public House(String name, String description, Integer bathRoomQuantity, Integer bedRoomQuantity, Double price) {
        this.name = name;
        this.description = description;
        this.bathRoomQuantity = bathRoomQuantity;
        this.bedRoomQuantity = bedRoomQuantity;
        this.price = price;
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
}

