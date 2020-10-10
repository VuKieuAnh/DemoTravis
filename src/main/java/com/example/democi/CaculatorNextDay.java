package com.example.democi;

public class CaculatorNextDay {
    public static String nextDayCalculator(int inputDay, int inputMonth, int inputYear){
        if (inputDay == 31){
            inputDay = 1;
            inputMonth = inputMonth ++;
        }
        else {
            inputDay++;
        }
        return inputDay + "-" + inputMonth + "-" + inputYear;
    }
}