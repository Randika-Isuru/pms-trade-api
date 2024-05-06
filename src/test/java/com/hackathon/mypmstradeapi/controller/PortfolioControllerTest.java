package com.hackathon.mypmstradeapi.controller;

import com.hackathon.mypmstradeapi.dto.PortfolioDto;
import com.hackathon.mypmstradeapi.entity.Strategy;
import com.hackathon.mypmstradeapi.service.PortfolioService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(PortfolioController.class)
@AutoConfigureMockMvc
class PortfolioControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @MockBean
    PortfolioService portfolioService;

    @Test
    public void testGetAllPortfolios() throws Exception{
        mockMvc.perform(get("/api/portfolios")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

}