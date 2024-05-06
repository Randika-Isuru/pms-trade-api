package com.hackathon.mypmstradeapi.controller;

import com.hackathon.mypmstradeapi.dto.PortfolioDto;
import com.hackathon.mypmstradeapi.service.PortfolioService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Represents a portfolio controller in the application.
 * This will provide functionality for managing portfolio information.
 *
 * @author Randika Isuru Vijayanga
 * @version 1.0
 */
@CrossOrigin("*")
@AllArgsConstructor
@RequestMapping("/api/portfolios")
@RestController
public class PortfolioController {
    private final PortfolioService portfolioService;
    @GetMapping
    public ResponseEntity<List<PortfolioDto>> getAllPortfolios(){
        List<PortfolioDto> employees = portfolioService.getAllPortfolios();
        return ResponseEntity.ok(employees);
    }
    @GetMapping("/getPortfolioValue")
    public ResponseEntity getPortfolioValue(@RequestParam(name = "portfolioNumber", required = false) String portfolioNumber){
        return ResponseEntity.ok(1);
    }

}
