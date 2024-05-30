package com.proj.AverageCalculator.service;

import com.proj.AverageCalculator.model.Window;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
@RequiredArgsConstructor
public class CalculatorService {

    private final Service service;
    private final AvgService avgService;

    public Window primes() {
        String input = service.primes();
        String[] arr = (input.substring(1,input.length()-2)).split(",");
        Window window = avgService.getAvg(toInt(arr));
        return window;
    }

    public Window even() {
        String input = service.primes();
        System.out.println(input +" "+ input.charAt(11));
        String[] arr = (input.substring(11,input.length()-2)).split(",");
        Window window = avgService.getAvg(toInt(arr));
        return window;
    }

    public Window fibonacci() {
        String input = service.primes();
        String[] arr = (input.substring(1,input.length()-2)).split(",");
        Window window = avgService.getAvg(toInt(arr));
        return window;
    }

    public Window random() {
        String input = service.primes();
        String[] arr = (input.substring(1,input.length()-2)).split(",");
        Window window = avgService.getAvg(toInt(arr));
        return window;
    }

    public ArrayList<Integer> toInt(String[] inp)
    {
        ArrayList<Integer> output = new ArrayList<>();
        for (int i = 0; i < inp.length; i++) {
            output.add(Integer.parseInt(inp[i]));
        }
        return output;
    }
}
