package com.example.democi;

public class CaculatorNextDay {

    public static final int FISTOFMONTH = 1;

    public static String nextDayCalculator(int inputDay, int inputMonth, int inputYear){
        if (inputDay == getLastDayOfMonth(inputMonth, inputYear)){
            inputDay = FISTOFMONTH;
            inputMonth = ++inputMonth;
        }
        else {
            inputDay++;
        }
        return inputDay + "-" + inputMonth + "-" + inputYear;
    }

    //input: inputMonth (int) + inputYear (int)
    //output: lastDayOfMonth (int)
    //name: getLastDayOfMonth

    private static int getLastDayOfMonth(int inputMonth, int inputYear){
        switch (inputMonth){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                return isLeapYear(inputYear)? 29:28;
        }
        return 30;
    }

    private static boolean isLeapYear (int inputYear){
        if(inputYear % 4 == 0){
            if (inputYear % 100 == 0){
                if (inputYear % 400 == 0){
                    return true;
                }
                else return false;
            }
            else return true;
        }
        else return false;
    }
}