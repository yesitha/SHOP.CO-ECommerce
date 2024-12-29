package com.shopco.paymentservice.repository;

import com.shopco.paymentservice.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
@EnableJpaRepositories
public interface TransactionRepository extends JpaRepository<Transaction, UUID>{

}
