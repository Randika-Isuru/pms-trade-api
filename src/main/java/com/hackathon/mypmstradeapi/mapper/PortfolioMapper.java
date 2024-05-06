package com.hackathon.mypmstradeapi.mapper;

import com.hackathon.mypmstradeapi.dto.PortfolioDto;
import com.hackathon.mypmstradeapi.entity.PortfolioEntity;
import com.hackathon.mypmstradeapi.entity.Strategy;

public class PortfolioMapper {
    public static PortfolioDto mapToPortfolioDto(PortfolioEntity portfolioEntity){
        return new PortfolioDto(
                portfolioEntity.getId(),
                portfolioEntity.getPortfolioNumber(),
                Strategy.valueOf(portfolioEntity.getInvestStrategy()),
                portfolioEntity.getCurrentPerformance(),
                portfolioEntity.getCustomerId(),
                portfolioEntity.getCustomerName(),
                portfolioEntity.getPortfolioValue()
        );
    }

    public static PortfolioEntity mapToPortfolio(PortfolioDto portfolioDto){
        return new PortfolioEntity(
                portfolioDto.getId(),
                portfolioDto.getPortfolioNumber(),
                portfolioDto.getInvestStrategy().name(),
                portfolioDto.getCurrentPerformance(),
                portfolioDto.getCustomerId(),
                portfolioDto.getCustomerName(),
                portfolioDto.getPortfolioValue()
        );
    }
}
