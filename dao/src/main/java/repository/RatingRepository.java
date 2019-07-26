package repository;

import entity.Account;
import entity.Rating;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface RatingRepository extends PagingAndSortingRepository<Rating,Long> {
    List<Rating> findAllByAccount(Account account);
    List<Rating> findAllByRatingStar(Long star);

}
