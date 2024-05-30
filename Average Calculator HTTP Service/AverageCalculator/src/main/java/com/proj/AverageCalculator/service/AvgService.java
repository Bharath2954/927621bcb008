package com.proj.AverageCalculator.service;

import com.proj.AverageCalculator.model.Window;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
@RequiredArgsConstructor
public class AvgService {
    private final static Window window = new Window();

    public Window getAvg(ArrayList<Integer> arr) {
        window.setNumbers(arr);
        window.setWindowPrevState(window.getWindowCurrState());
        window.setWindowCurrState(setCurr(new ArrayList<>(window.getWindowPrevState()), arr));
        window.setAverage(avg(window.getWindowCurrState()));
        return window;
    }

    public ArrayList<Integer> setCurr(ArrayList<Integer> window, ArrayList<Integer> arr) {

        for(int i:arr)
        {
            if(window.contains(i))
            {
                continue;
            }
            else
            {
                if(window.size()==10)
                {
                    window.removeFirst();
                }
                window.add(i);
            }
        }
        return window;
    }

    public double avg(ArrayList<Integer> window) {
        double sum = 0;
        for(int i:window)
        {
            sum+=i;
        }
        return sum/window.size();
    }
}
