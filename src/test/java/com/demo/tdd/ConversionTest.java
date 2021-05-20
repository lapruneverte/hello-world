package com.demo.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversionTest {
    
    private Conversion conversion = new Conversion();

    @Test
    public void getDifferentRomanNumeralsTest() {
        assertEquals("I", conversion.solution(1));
        assertEquals("V", conversion.solution(5));
        assertEquals("X", conversion.solution(10));
        assertEquals("L", conversion.solution(50));
        assertEquals("C", conversion.solution(100));
        assertEquals("D", conversion.solution(500));
        assertEquals("M", conversion.solution(1000));
    }

    @Test
    public void getNumbersBelowTen() {
        assertEquals("II", conversion.solution(2));
        assertEquals("III", conversion.solution(3));
        assertEquals("IV", conversion.solution(4));
        assertEquals("VI", conversion.solution(6));
        assertEquals("VII", conversion.solution(7));
        assertEquals("VIII", conversion.solution(8));
        assertEquals("IX", conversion.solution(9));
    }

    @Test
    public void getNumbersOverTenAndBelowHundred() {
        assertEquals("XI", conversion.solution(11));
        assertEquals("XII", conversion.solution(12));
        assertEquals("XIII", conversion.solution(13));
        assertEquals("XIV", conversion.solution(14));
        assertEquals("XV", conversion.solution(15));
        assertEquals("XVI", conversion.solution(16));
        assertEquals("XVII", conversion.solution(17));
        assertEquals("XVIII", conversion.solution(18));
        assertEquals("XIX", conversion.solution(19));
        assertEquals("XX", conversion.solution(20));
        assertEquals("XXI", conversion.solution(21));
        assertEquals("XXX", conversion.solution(30));
        assertEquals("XXXIX", conversion.solution(39));
        assertEquals("XL", conversion.solution(40));
        assertEquals("LVII", conversion.solution(57));
        assertEquals("LX", conversion.solution(60));
        assertEquals("LXX", conversion.solution(70));
        assertEquals("LXXII", conversion.solution(72));
        assertEquals("LXXX", conversion.solution(80));
        assertEquals("XC", conversion.solution(90));
    }

    @Test
    public void getNumbersHundred() {
        assertEquals("CXX", conversion.solution(120));
        assertEquals("CC", conversion.solution(200));
        assertEquals("CCXXXIX", conversion.solution(239));
        assertEquals("CCCL", conversion.solution(350));
        assertEquals("CDXXIII", conversion.solution(423));
        assertEquals("DLXXXIX", conversion.solution(589));
        assertEquals("DCXL", conversion.solution(640));
        assertEquals("DCCXV", conversion.solution(715));
        assertEquals("DCCCXVII", conversion.solution(817));
        assertEquals("CMLV", conversion.solution(955));
    }

    @Test
    public void getNumbersThousand() {
        assertEquals("MV", conversion.solution(1005));
        assertEquals("MCCLX", conversion.solution(1260));
        assertEquals("MMCMLXXVI", conversion.solution(2976));
        assertEquals("MMMCCLX", conversion.solution(3260));
        assertEquals("MMMCMXCIX", conversion.solution(3999));
    }

    @Test
    public void getInvalidRomanNumeralsTest() {
/*        assertEquals("Input number must be a natural number", conversion.solution(0));
        assertEquals("Input number must be a natural number", conversion.solution(-1));
        assertEquals("Input number must be below 3999", conversion.solution(4000));*/
    }
}
