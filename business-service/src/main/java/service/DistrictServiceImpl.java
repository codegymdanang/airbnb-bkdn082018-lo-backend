package service;

import entity.District;
import org.springframework.beans.factory.annotation.Autowired;
import repository.DistrictRepository;

import java.util.List;

public class DistrictServiceImpl implements DistrictService {

    @Autowired
    private DistrictRepository districtRepository;
    @Override
    public List<District> findAll() {
        return districtRepository.findAll();
    }

    @Override
    public District findDistrictByProvince_id(Long id) {
        if (id == null){
            try {
                throw new Error("Id is null");
            } catch (Error e) {
                e.printStackTrace();
            }
        }
        return districtRepository.findByProvince_Id(id);
    }

    @Override
    public List<District> findAllDistrictByProvince_name(String name) {
        return districtRepository.findAllByProvince_Name(name);
    }
}
