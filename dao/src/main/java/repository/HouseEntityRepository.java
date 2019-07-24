package repository;

import entity.HouseEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface HouseEntityRepository extends PagingAndSortingRepository<HouseEntity,Long> {

}
