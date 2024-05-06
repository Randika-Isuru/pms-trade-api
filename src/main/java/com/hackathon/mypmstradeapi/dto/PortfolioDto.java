package com.hackathon.mypmstradeapi.dto;

import com.hackathon.mypmstradeapi.entity.Strategy;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PortfolioDto {
    private Long id;
    private String portfolioNumber;
    private Strategy investStrategy;
    private double currentPerformance;
    private String customerId;
    private String customerName;
    private int portfolioValue;
}
