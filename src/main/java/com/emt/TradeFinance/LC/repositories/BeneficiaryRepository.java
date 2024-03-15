package com.emt.TradeFinance.LC.repositories;

import com.emt.TradeFinance.LC.entities.Accounts;
import com.emt.TradeFinance.LC.entities.Beneficiary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeneficiaryRepository extends JpaRepository<Beneficiary,Long> {
}
