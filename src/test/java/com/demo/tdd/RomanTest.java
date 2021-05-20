package com.demo.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanTest {
    
    @Test
    public void getDifferentRomanNumeralsTest() {
        assertEquals("I", NumberConverser.getRomanNumeral(1));
        assertEquals("V", NumberConverser.getRomanNumeral(5));
        assertEquals("X", NumberConverser.getRomanNumeral(10));
        assertEquals("L", NumberConverser.getRomanNumeral(50));
        assertEquals("C", NumberConverser.getRomanNumeral(100));
        assertEquals("D", NumberConverser.getRomanNumeral(500));
        assertEquals("M", NumberConverser.getRomanNumeral(1000));
    }

    @Test
    public void getNumbersBelowTen() {
        assertEquals("II", NumberConverser.getRomanNumeral(2));
        assertEquals("III", NumberConverser.getRomanNumeral(3));
        assertEquals("IV", NumberConverser.getRomanNumeral(4));
        assertEquals("VI", NumberConverser.getRomanNumeral(6));
        assertEquals("VII", NumberConverser.getRomanNumeral(7));
        assertEquals("VIII", NumberConverser.getRomanNumeral(8));
        assertEquals("IX", NumberConverser.getRomanNumeral(9));
    }

    @Test
    public void getNumbersOverTenAndBelowHundred() {
        assertEquals("XI", NumberConverser.getRomanNumeral(11));
        assertEquals("XII", NumberConverser.getRomanNumeral(12));
        assertEquals("XIII", NumberConverser.getRomanNumeral(13));
        assertEquals("XIV", NumberConverser.getRomanNumeral(14));
        assertEquals("XV", NumberConverser.getRomanNumeral(15));
        assertEquals("XVI", NumberConverser.getRomanNumeral(16));
        assertEquals("XVII", NumberConverser.getRomanNumeral(17));
        assertEquals("XVIII", NumberConverser.getRomanNumeral(18));
        assertEquals("XIX", NumberConverser.getRomanNumeral(19));
        assertEquals("XX", NumberConverser.getRomanNumeral(20));
        assertEquals("XXI", NumberConverser.getRomanNumeral(21));
        assertEquals("XXX", NumberConverser.getRomanNumeral(30));
        assertEquals("XXXIX", NumberConverser.getRomanNumeral(39));
        assertEquals("XL", NumberConverser.getRomanNumeral(40));
        assertEquals("LVII", NumberConverser.getRomanNumeral(57));
        assertEquals("LX", NumberConverser.getRomanNumeral(60));
        assertEquals("LXX", NumberConverser.getRomanNumeral(70));
        assertEquals("LXXII", NumberConverser.getRomanNumeral(72));
        assertEquals("LXXX", NumberConverser.getRomanNumeral(80));
        assertEquals("XC", NumberConverser.getRomanNumeral(90));
    }

    @Test
    public void getNumbersHundred() {
        assertEquals("CXX", NumberConverser.getRomanNumeral(120));
        assertEquals("CC", NumberConverser.getRomanNumeral(200));
        assertEquals("CCXXXIX", NumberConverser.getRomanNumeral(239));
        assertEquals("CCCL", NumberConverser.getRomanNumeral(350));
        assertEquals("CDXXIII", NumberConverser.getRomanNumeral(423));
        assertEquals("DLXXXIX", NumberConverser.getRomanNumeral(589));
        assertEquals("DCXL", NumberConverser.getRomanNumeral(640));
        assertEquals("DCCXV", NumberConverser.getRomanNumeral(715));
        assertEquals("DCCCXVII", NumberConverser.getRomanNumeral(817));
        assertEquals("CMLV", NumberConverser.getRomanNumeral(955));
    }

    @Test
    public void getNumbersThousand() {
        assertEquals("MV", NumberConverser.getRomanNumeral(1005));
        assertEquals("MCCLX", NumberConverser.getRomanNumeral(1260));
        assertEquals("MMCMLXXVI", NumberConverser.getRomanNumeral(2976));
        assertEquals("MMMCCLX", NumberConverser.getRomanNumeral(3260));
        assertEquals("MMMCMXCIX", NumberConverser.getRomanNumeral(3999));
    }

    @Test
    public void getInvalidRomanNumeralsTest() {
        assertEquals("Input number must be a natural number", NumberConverser.getRomanNumeral(0));
        assertEquals("Input number must be a natural number", NumberConverser.getRomanNumeral(-1));
        assertEquals("Input number must be below 3999", NumberConverser.getRomanNumeral(4000));
    }
}
