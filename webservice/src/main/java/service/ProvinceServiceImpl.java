package service;

import entity.Province;
import org.springframework.beans.factory.annotation.Autowired;
import repository.ProvinceRepository;
import service.ProvinceService;

import java.util.List;

public class ProvinceServiceImpl implements ProvinceService {
    @Autowired
    ProvinceRepository provinceRepository;
    @Override
    public List<Province> findAll() {
        return provinceRepository.findAll();
    }

    @Override
    public Province findById(Long id) {
        return provinceRepository.findById(id).get();
    }

    @Override
    public List<Province> findAllByName(String name) {
        return provinceRepository.findAllByName(name);
    }
}
