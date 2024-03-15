package com.emt.TradeFinance.LC.repositories;

import com.emt.TradeFinance.LC.entities.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts,Long> {
}
