package com.emt.TradeFinance.LC.repositories;

import com.emt.TradeFinance.LC.entities.Accounts;
import com.emt.TradeFinance.LC.entities.LetterOfCredit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LetterOfCreditRepository extends JpaRepository<LetterOfCredit,Long> {
    Optional<LetterOfCredit> findByLetterOfCreditNumber(String letterOfCreditNumber);
}

