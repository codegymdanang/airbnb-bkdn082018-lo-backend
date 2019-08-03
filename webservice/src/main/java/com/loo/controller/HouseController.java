package com.loo.controller;

import com.codegym.entity.House;
import com.looo.service.HouseService;
import com.looo.service.HouseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class HouseController {

    @Autowired
    private HouseService houseService;

    public HouseController(HouseService houseService) {
        this.houseService = houseService;
    }

    @GetMapping("/houses")
    public List<House> getAllHouses() {
        List<House> houses = houseService.getAllHouse();
        return houses;
    }

    @GetMapping("/houses/{id}")
    public Optional<House> getHouse(@PathVariable("id") long id) {
        Optional<House> house = houseService.findByid(id);
        return house;
    }

    @PostMapping("/houses/create")
    public House createHouse(@RequestBody House house) {
        houseService.save(house);
        return house;
    }

    @PutMapping("/houses/{id}")
    public ResponseEntity<House> updateHouse(@RequestBody House house) {

        Optional<House> houseData = houseService.findByid(house.getId());
        if (houseData.isPresent()) {
            House _house = houseData.get();
            _house.setName(house.getName());
            _house.setDescription(house.getDescription());
            _house.setBathRoomQuantity(house.getBathRoomQuantity());
            _house.setBedRoomQuantity(house.getBedRoomQuantity());
            _house.setImage(house.getImage());
            _house.setPrice(house.getPrice());
            houseService.save(_house);
            return new ResponseEntity<>(_house, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/houses/{id}")
    public void deleteHouse(@PathVariable("id") long id) {
        houseService.remove(id);
    }
}
