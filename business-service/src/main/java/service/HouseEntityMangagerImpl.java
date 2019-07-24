package service;

import entity.HouseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import repository.HouseEntityRepository;

import java.util.Optional;

public class HouseEntityMangagerImpl implements HouseEntityMangager {
    @Autowired
    HouseEntityRepository houseEntityRepository;

    @Override
    public Page<HouseEntity> getAllHouse(Pageable pageable) {
        return houseEntityRepository.findAll(pageable);
    }

    @Override
    public void save(HouseEntity houseEntity) {
        houseEntityRepository.save(houseEntity);
    }

    @Override
    public void remove(Long id) {
        houseEntityRepository.deleteById(id);
    }

    @Override
    public Optional<HouseEntity> findByid(Long id) {
        return houseEntityRepository.findById(id);
    }
}
