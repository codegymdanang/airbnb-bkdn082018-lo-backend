package service;

import entity.Province;
import org.springframework.beans.factory.annotation.Autowired;
import repository.ProvinceRepository;

import java.util.List;

public class VillageServiceImpl implements ProvinceService {

    @Autowired
    private ProvinceRepository provinceRepository;
    @Override
    public List<Province> findAll() {
        return provinceRepository.findAll();
    }
}
