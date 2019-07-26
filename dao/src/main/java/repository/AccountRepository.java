package repository;

import entity.Account;
import entity.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AccountRepository extends PagingAndSortingRepository<Account,Long> {
    Account findByUserName(String username);

    Account findByEmail(String email);

    Iterable<Account> findAllByProvince(Province province);
}
