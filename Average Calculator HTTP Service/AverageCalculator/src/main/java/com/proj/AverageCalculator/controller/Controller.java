package com.proj.AverageCalculator.controller;

import com.proj.AverageCalculator.model.Window;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.proj.AverageCalculator.service.*;

@RestController
@RequestMapping("/numbers")
@RequiredArgsConstructor
public class Controller {

    private final CalculatorService service;

    @GetMapping("/p")
    public Window primes()
    {
        return service.primes();
    }

    @GetMapping("/e")
    public Window even()
    {
        return service.even();
    }

    @GetMapping("/f")
    public Window fibonacci()
    {
        return service.fibonacci();
    }

    @GetMapping("/r")
    public Window random()
    {
        return service.random();
    }
}
