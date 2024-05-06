package com.hackathon.mypmstradeapi.service;

import com.hackathon.mypmstradeapi.dto.PortfolioDto;
import com.hackathon.mypmstradeapi.entity.PortfolioEntity;
import com.hackathon.mypmstradeapi.entity.Strategy;
import com.hackathon.mypmstradeapi.mapper.PortfolioMapper;
import com.hackathon.mypmstradeapi.repository.PortfolioRepository;
import com.hackathon.mypmstradeapi.service.impl.PortfolioServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PortfolioServiceTest {

    @InjectMocks
    PortfolioServiceImpl portfolioService;

    @Mock
    PortfolioRepository portfolioRepository;

    private PortfolioEntity portfolioOne;
    private PortfolioEntity portfolioTwo;

    private PortfolioEntity portfolioThree;

    private List<PortfolioEntity> portfolioList = new ArrayList<>();

    @BeforeEach
    public void setUp(){
        portfolioOne = PortfolioMapper.mapToPortfolio(PortfolioDto.builder()
                .id(1L)
                .currentPerformance(10)
                .customerId("C001")
                .customerName("Randika")
                .portfolioNumber("P001")
                .portfolioValue(10)
                .investStrategy(Strategy.SAFE)
                .build());
        portfolioTwo = PortfolioMapper.mapToPortfolio(PortfolioDto.builder()
                .id(2L)
                .currentPerformance(20)
                .customerId("C002")
                .customerName("Isuru")
                .portfolioNumber("P002")
                .portfolioValue(20)
                .investStrategy(Strategy.RISKY)
                .build());
        portfolioThree = PortfolioMapper.mapToPortfolio(PortfolioDto.builder()
                .id(3L)
                .currentPerformance(20)
                .customerId("C003")
                .customerName("Vijayanga")
                .portfolioNumber("P003")
                .portfolioValue(30)
                .investStrategy(Strategy.MODERATE)
                .build());

        portfolioList.add(portfolioOne);
        portfolioList.add(portfolioTwo);
        portfolioList.add(portfolioThree);
    }

    @Test
    public void testGetAllPortfolios() throws Exception {
        long id = 0;
        when(portfolioRepository.findAll()).thenReturn(portfolioList);
        List<PortfolioDto> portfolioDtoList = portfolioService.getAllPortfolios();
        assertEquals(1L, id);
    }

}