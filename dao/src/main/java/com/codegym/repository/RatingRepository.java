package com.codegym.repository;

import com.codegym.entity.Rating;
import com.codegym.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface RatingRepository extends PagingAndSortingRepository<Rating,Long> {
    List<Rating> findAllByUser(User account);
    List<Rating> findAllByRatingStar(Long star);

}
