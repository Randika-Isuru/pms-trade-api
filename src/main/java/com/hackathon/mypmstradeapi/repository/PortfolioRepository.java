package com.hackathon.mypmstradeapi.repository;

import com.hackathon.mypmstradeapi.entity.PortfolioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PortfolioRepository extends JpaRepository<PortfolioEntity, Long> {
}
