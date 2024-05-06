package com.hackathon.mypmstradeapi.service.impl;

import com.hackathon.mypmstradeapi.dto.PortfolioDto;
import com.hackathon.mypmstradeapi.entity.PortfolioEntity;
import com.hackathon.mypmstradeapi.mapper.PortfolioMapper;
import com.hackathon.mypmstradeapi.repository.PortfolioRepository;
import com.hackathon.mypmstradeapi.service.PortfolioService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PortfolioServiceImpl implements PortfolioService {

    private final PortfolioRepository portfolioRepository;
    @Override
    public List<PortfolioDto> getAllPortfolios() {
        List<PortfolioEntity> portfolios = portfolioRepository.findAll();
        return portfolios.stream().map(PortfolioMapper::mapToPortfolioDto).collect(Collectors.toList());
    }
}
