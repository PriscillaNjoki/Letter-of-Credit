package com.emt.TradeFinance.LC.sevices;

import com.emt.TradeFinance.LC.entities.Accounts;
import com.emt.TradeFinance.LC.repositories.AccountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountsService {

    @Autowired
    private AccountsRepository accountsRepository;

    public List<Accounts> getAllAccounts() {
        return accountsRepository.findAll();
    }

    public Accounts getAccountById(Long id) {
        return accountsRepository.findById(id).orElse(null);
    }

    public Accounts saveAccount(Accounts account) {
        return accountsRepository.save(account);
    }

    public void deleteAccount(Long id) {
        accountsRepository.deleteById(id);
    }
}