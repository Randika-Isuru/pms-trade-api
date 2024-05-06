package com.hackathon.mypmstradeapi.entity;

import jakarta.persistence.*;
import lombok.*;

/**
 * Represents a Portfolio in the application.
 * This enum will provide functionality for managing portfolio information.
 *
 * @author Randika Isuru Vijayanga
 * @version 1.0
 */

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "portfolio")
public class PortfolioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "portfolio_number")
    private String portfolioNumber;
    @Column(name = "invest_strategy")
    private String investStrategy;
    @Column(name = "current_performance")
    private double currentPerformance;
    @Column(name = "customer_id")
    private String customerId;
    @Column(name = "customer_name")
    private String customerName;
    @Column(name = "portfolio_value")
    private int portfolioValue;
}
