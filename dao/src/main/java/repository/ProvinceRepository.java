package repository;


import entity.Province;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProvinceRepository extends JpaRepository<Province,Long> {
    List<Province> findAllByName(String name);
}
