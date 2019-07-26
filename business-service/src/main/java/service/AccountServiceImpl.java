package service;

import entity.Account;
import entity.Province;
import org.springframework.beans.factory.annotation.Autowired;
import repository.AccountRepository;

import java.util.Optional;

public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Iterable<Account> findAll(){
        return accountRepository.findAll();
    }

    @Override
    public Account findAccountByUsername(String username) {
        return accountRepository.findByUserName(username);
    }

    @Override
    public Account findAccountByEmail(String email){
        return accountRepository.findByEmail(email);
    }

    @Override
    public void save(Account account){
        accountRepository.save(account);
    }

    @Override
    public Optional<Account> findById(Long id) {
        return accountRepository.findById(id);
    }

    @Override
    public Iterable<Account> findAllByProvince(Province province) {
        return accountRepository.findAllByProvince(province);
    }
}
