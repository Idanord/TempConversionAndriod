package com.example.will.tempconvertionandriod2;

/**
 * Created by Will on 1/31/2018.
 */

public class UnitConverter {

    public static double celsius2Farenheit(double f){
        return (f-32)* 5/9;
    }

    public static double farenheite2Celsius(double c){
        return 32+c*9/5;
    }
}//end of class
