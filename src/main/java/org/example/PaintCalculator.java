package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Kisida
 */

import java.util.Scanner;
public class PaintCalculator
{
    public static void main( String[] args )
    {
        final int gallon = 350;
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Input length: ");
        int length = input.nextInt();  // Read user input
        System.out.print("Input width: ");
        int width  = input.nextInt();  // Read user input
        int area = width * length;
        int gallonsNeeded = area / gallon;
        int remainder= area % gallon;
        if (remainder  > 0 ) {
            gallonsNeeded = gallonsNeeded + 1;
        }
        String output1 = String.format("You will need to purchase %d gallons of paint to cover %d square feet", gallonsNeeded,area);
        System.out.println(output1);
        input.close();
    }
}
