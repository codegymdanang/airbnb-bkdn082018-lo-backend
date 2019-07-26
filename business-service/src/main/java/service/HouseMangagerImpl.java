package service;

import entity.House;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import repository.HouseRepository;

import java.util.Optional;

public class HouseMangagerImpl implements HouseMangager {
    @Autowired
    HouseRepository houseRepository;

    @Override
    public Iterable<House> findAll(){
        return  houseRepository.findAll();
    }
    @Override
    public Page<House> getAllHouse(Pageable pageable) {
        return houseRepository.findAll(pageable);
    }

    @Override
    public void save(House house) {
        houseRepository.save(house);
    }

    @Override
    public void remove(Long id) {
        houseRepository.deleteById(id);
    }


    @Override
    public Optional<House> findByid(Long id) {
        return houseRepository.findById(id);
    }
}
