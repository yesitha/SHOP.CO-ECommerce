package com.shopco.repository;

import com.shopco.entity.Demo;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@EnableJpaRepositories
@Repository
public interface DemoRepository extends JpaRepository<Demo, UUID> {

}
