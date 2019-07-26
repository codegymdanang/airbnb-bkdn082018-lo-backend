package repository;


import entity.Province;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProvinceRepository extends JpaRepository<Province,Long> {
}
