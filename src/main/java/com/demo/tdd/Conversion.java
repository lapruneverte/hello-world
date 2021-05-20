package com.demo.tdd;
public class Conversion {

    public String solution(int n) {
        return factorize(n);
    }

    public String factorize(int n) {
        StringBuilder list = new StringBuilder();

        if (n == 0) return "";
        
        int differenceFromClosestSpecialCase = getDifferenceFromClosestHighestSpecialCase(n);
        int closestSpecialCase = n - differenceFromClosestSpecialCase;
        
        list.append(toRoman(closestSpecialCase));

        list.append(factorize(differenceFromClosestSpecialCase));
        
        return list.toString();
    }

    public String toRoman(int number) {
        if (number == 1) return "I";

        if (number == 4) return "IV";
        if (number == 5) return "V";

        if (number == 9) return "IX";
        if (number == 10) return "X";

        if (number == 40) return "XL";
        if (number == 50) return "L";

        if (number == 90) return "XC";
        if (number == 100) return "C";

        if (number == 400) return "CD";
        if (number == 500) return "D";

        if (number == 900) return "CM";
        if (number == 1000) return "M";

        return "";
    }

    public int getDifferenceFromClosestHighestSpecialCase(int n) {
        if (n >= 1000) return n - 1000;
        if (n >= 900) return n - 900;

        if (n >= 500) return n - 500;
        if (n >= 400) return n - 400;

        if (n >= 100) return n - 100;
        if (n >= 90) return n - 90;

        if (n >= 50) return n - 50;
        if (n >= 40) return n - 40;

        if (n >= 10) return n - 10;
        if (n >= 9) return n - 9;

        if (n >= 5) return n - 5;
        if (n >= 4) return n - 4;
        if (n >= 1) return n - 1;

        return n;
    }
}
