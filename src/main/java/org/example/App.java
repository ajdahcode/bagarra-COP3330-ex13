/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 alden bagarra
 */

package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scnN = new Scanner(System.in);
        System.out.print( "Enter the principal: " );
        double principal = scnN.nextDouble();
        System.out.print( "Enter the rate of interest: " );
        double rateOI = scnN.nextDouble();
        System.out.print( "Enter the number of years: " );
        double year = scnN.nextDouble();
        System.out.print("What is the number of times the interest is compounded per year? ");
        double inter = scnN.nextDouble();
        double invest = (principal)*(Math.pow(1+((rateOI/100)/inter), (inter*year)));
        double temp = Math.ceil(invest*100);
        invest = temp/100;
        System.out.print( "$"+ (int)principal +" invested at "+ rateOI +
                "% for "+ (int)year +" years compounded "+ (int)inter +
                " times per year is $"+ invest +"." );
    }
}