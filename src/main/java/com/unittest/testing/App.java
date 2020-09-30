package com.unittest.testing;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input =new Scanner(System.in);
        System.out.print("input Celcius :");
        double celcius =input.nextDouble();
        
        fahrenheit f = new fahrenheit();
        
        
        while (!f.isBound(celcius)) {
        	System.out.println("input Again !!");
        	System.out.print("input Celcius :");
        	celcius = input.nextDouble();
        }
        f.input(celcius);
        System.out.println(f.toString());
         
    }

}
