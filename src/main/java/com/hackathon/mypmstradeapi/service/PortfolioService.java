package com.hackathon.mypmstradeapi.service;

import com.hackathon.mypmstradeapi.dto.PortfolioDto;

import java.util.List;

public interface PortfolioService {
    List<PortfolioDto> getAllPortfolios();
}
