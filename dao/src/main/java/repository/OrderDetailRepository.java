package repository;

import entity.Account;
import entity.House;
import entity.OrderDetail;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface OrderDetailRepository extends PagingAndSortingRepository<OrderDetail,Long> {
    Iterable<OrderDetail> findAllByAccount(Account account);
    Iterable<OrderDetail> findAllByHouse(House house);

}
