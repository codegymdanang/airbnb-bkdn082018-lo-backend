package service;

import entity.House;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface HouseMangager {
    Iterable<House> findAll();
    Page<House> getAllHouse(Pageable pageable);
    void save(House house);
    void remove(Long id);
    Optional<House> findByid(Long id);

}
