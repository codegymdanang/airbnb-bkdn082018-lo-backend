package service;

import entity.HouseEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface HouseEntityMangager {
    Page<HouseEntity> getAllHouse(Pageable pageable);
    void save(HouseEntity houseEntity);
    void remove(Long id);
    Optional<HouseEntity> findByid(Long id);

}
