package com.example.democi;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaculatorNextDayTest {
    @Test
    @DisplayName("case 1/1/2018")
    void testDay1Month1Year2018(){

        //AAA
        //arange
        int dayTest = 1;
        int monthTest = 1;
        int yearTest = 2018;
        String expected = "2-1-2018";

        //action
        String result = CaculatorNextDay.nextDayCalculator(dayTest, monthTest, yearTest);
        //assert
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("case 31/1/2018")
    void testDay31Month1Year2018(){
        int dayTest = 31;
        int monthTest = 1;
        int yearTest = 2018;
        String result = CaculatorNextDay.nextDayCalculator(dayTest, monthTest, yearTest);
        String expected = "1-2-2018";
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("case 30/04/2018")
    void testDay30Month4Year2018(){
        int dayTest = 30;
        int monthTest = 4;
        int yearTest = 2018;
        String expected = "1-5-2018";
        String result = CaculatorNextDay.nextDayCalculator(dayTest, monthTest, yearTest);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("case 28/02/2018")
    void testDay28Month2Year2018(){
        int dayTest = 28;
        int monthTest = 2;
        int yearTest = 2018;
        String expected = "1-3-2018";
        String result = CaculatorNextDay.nextDayCalculator(dayTest, monthTest, yearTest);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("case 29/02/2020")
    void testDay29Month2Year2020(){
        int dayTest = 29;
        int monthTest = 2;
        int yearTest = 2020;
        String expected = "1-3-2020";
        String result = CaculatorNextDay.nextDayCalculator(dayTest, monthTest, yearTest);
        assertEquals(expected, result);
    }

}