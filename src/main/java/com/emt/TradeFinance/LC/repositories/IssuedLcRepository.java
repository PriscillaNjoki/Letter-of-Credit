package com.emt.TradeFinance.LC.repositories;

import com.emt.TradeFinance.LC.entities.IssuedLcs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssuedLcRepository extends JpaRepository<IssuedLcs,Long> {
}

