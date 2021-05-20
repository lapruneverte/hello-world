package com.demo.tdd;

public class NumberConverser {
    
    public static String getRomanNumeral(int arabicNumber) {
        if (arabicNumber > 0) {
            return getRomanNumeralInputValidated(arabicNumber);
        }
        return "Input number must be a natural number";
    }
    
    private static String getRomanNumeralInputValidated(int arabicNumber) {
        String result = "";
        if (arabicNumber < 10) {
            result = getBelowTen(arabicNumber);
        } else {
            if (arabicNumber < 100) {
                result = getBelowHundred(arabicNumber);
            } else {
                if (arabicNumber < 1000) {
                    result = getBelowThousand(arabicNumber);
                } else {
                    int thousandsDigit = arabicNumber / 1000;
                    switch (thousandsDigit) {
                        case 1:
                            result = "M";
                            break;
                        case 2:
                            result = "MM";
                            break;
                        case 3:
                            result = "MMM";
                            break;
                        default:
                            return "Input number must be below 3999";
                    }
                    result = result + getBelowThousand(arabicNumber % 1000);
                }
            }
        }
        return result;
    }

    private static String getBelowThousand(int arabicNumber) {
        String result = "";
        int hundredsDigit = arabicNumber / 100;
        switch (hundredsDigit) {
            case 1:
                result = "C";
                break;
            case 2:
                result = "CC";
                break;
            case 3:
                result = "CCC";
                break;
            case 4:
                result = "CD";
                break;
            case 5:
                result = "D";
                break;
            case 6:
                result = "DC";
                break;
            case 7:
                result = "DCC";
                break;
            case 8:
                result = "DCCC";
                break;
            case 9:
                result = "CM";
                break;
            default:
                result = "";
                break;
        }
        result = result + getBelowHundred(arabicNumber % 100);
        return result;
    }
    
    private static String getBelowHundred(int arabicNumber) {
        String result = "";
        int tensDigit = arabicNumber / 10;
        switch (tensDigit) {
            case 1:
                result = "X";
                break;
            case 2:
                result = "XX";
                break;
            case 3:
                result = "XXX";
                break;
            case 4:
                result = "XL";
                break;
            case 5:
                result = "L";
                break;
            case 6:
                result = "LX";
                break;
            case 7:
                result = "LXX";
                break;
            case 8:
                result = "LXXX";
                break;
            case 9:
                result = "XC";
                break;
            default:
                result = "";
                break;
        }
        result = result + getBelowTen(arabicNumber % 10);
        return result;
    }

    private static String getBelowTen(int arabicNumber) {
        String result = "";
        switch (arabicNumber) {
            case 1:
                result = "I";
                break;
            case 2:
                result = "II";
                break;
            case 3:
                result = "III";
                break;
            case 4:
                result = "IV";
                break;
            case 5:
                result = "V";
                break;
            case 6:
                result = "VI";
                break;
            case 7:
                result = "VII";
                break;
            case 8:
                result = "VIII";
                break;
            case 9:
                result = "IX";
                break;
            default:
                result = "";
        }
        return result;
    }
    
}
