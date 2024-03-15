package com.emt.TradeFinance.LC.repositories;

import com.emt.TradeFinance.LC.entities.Accounts;
import com.emt.TradeFinance.LC.entities.Charges;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChargesRepository extends JpaRepository<Charges,Long> {
}
