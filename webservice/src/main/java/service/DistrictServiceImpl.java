package service;

import entity.District;
import org.springframework.beans.factory.annotation.Autowired;
import repository.DistrictRepository;
import service.DistrictService;

import java.util.List;

public class DistrictServiceImpl implements DistrictService {
    @Autowired
    DistrictRepository districtRepository;
    @Override
    public List<District> findAll() {
        return districtRepository.findAll();
    }

    @Override
    public District findById(Long id) {
        return districtRepository.findById(id).get();
    }

    @Override
    public List<District> findAllByName(String name) {
        return districtRepository.findAllByName(name);
    }
}
