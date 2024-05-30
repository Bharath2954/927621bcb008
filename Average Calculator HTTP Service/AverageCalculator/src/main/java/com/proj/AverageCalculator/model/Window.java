package com.proj.AverageCalculator.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Window {

    private ArrayList<Integer> numbers;
    private ArrayList<Integer> windowPrevState;
    private ArrayList<Integer> windowCurrState;
    private double average;
}
