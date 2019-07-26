package controller;

import entity.House;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.HouseMangager;

import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class HouseController {

    @Autowired
    private HouseMangager houseMangager;

    @GetMapping("/houses")
    public Iterable<House> getAllHouses() {

        Iterable<House> houses = houseMangager.findAll();
        return houses;
    }

    @PostMapping("/houses/create")
    public House createHouse(@RequestBody House house) {
        houseMangager.save(house);
        return house;
    }


@PutMapping("/houses/{id}")
public ResponseEntity<House> updateHouse(@PathVariable("id") long id, @RequestBody House house) {


    Optional<House> houseData = houseMangager.findByid(id);

    if (houseData.isPresent()) {
        House _house = houseData.get();
        _house.setName(house.getName());
        _house.setDescription(house.getDescription());
        _house.setBathRoomQuantity(house.getBathRoomQuantity());
        _house.setBedRoomQuantity(house.getBedRoomQuantity());
        _house.setImage(house.getImage());
        _house.setPrice(house.getPrice());
        houseMangager.save(_house);
        return new ResponseEntity<>(_house,HttpStatus.OK);
    } else {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
}
