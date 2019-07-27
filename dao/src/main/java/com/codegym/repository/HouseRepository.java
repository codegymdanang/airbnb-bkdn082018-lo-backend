package com.codegym.repository;

import com.codegym.entity.House;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface HouseRepository extends PagingAndSortingRepository<House,Long> {
}
