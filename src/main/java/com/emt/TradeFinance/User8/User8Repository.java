package com.emt.TradeFinance.User8;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface User8Repository extends JpaRepository<User8, Long> {
    Optional<User8> findByFullName(String name);
}
