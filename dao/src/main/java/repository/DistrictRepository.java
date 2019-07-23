package repository;


import entity.District;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DistrictRepository extends JpaRepository<District,Long> {
    District findByProvince_Id(Long id);
    List<District> findAllByProvince_Name(String provinceName);
}
