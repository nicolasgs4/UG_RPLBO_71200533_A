package com.ug6.soal1;

import java.util.Arrays;
import java.util.ArrayList;

public class Codes
{
    public static ArrayList<String> ANDROIDCODES;
    public static ArrayList<String> COMPANYCODES;
    public static String generatePhoneCode(final String companyCode) {
        final int min = 1;
        final int max = 20;
        final double random = Math.random() * (max - min + 1) + min;
        final int randomCode = (int)random;
        return companyCode + randomCode + "X" ;
    }
    public static String generatePhoneCode(final String companyCode, final String androidCode) {
        final int min = 1;
        final int max = 20;
        final double random = Math.random() * (max - min + 1) + min;
        final int randomCode = (int)random;
        return companyCode + androidCode.charAt(0) + androidCode.charAt(androidCode.length() - 1) + randomCode;
    }
    static {
        Codes.COMPANYCODES = new ArrayList<String>(Arrays.asList("XM", "SG", "AP", "RM", "OP", "VV"));
        Codes.ANDROIDCODES = new ArrayList<String>(Arrays.asList("Lollipop", "Marshmallow", "Nougat", "Oreo", "Pie", "10 Q", "Red Velvet Cake", "Snow Cone", "Tiramisu"));
    }
}