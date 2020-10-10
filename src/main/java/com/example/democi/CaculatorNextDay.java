package com.example.democi;

public class CaculatorNextDay {
    public static String nextDayCalculator(int inputDay, int inputMonth, int inputYear){
        inputDay++;
        return inputDay + "-" + inputMonth + "-" + inputYear;
    }
}
