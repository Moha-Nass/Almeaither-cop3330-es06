package org.example;

import java.util.Scanner;

/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 *   Copyright 2021 Mohammed_Almeaither
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Exercise 6 - Retirement Calculator");
        System.out.print("What is your age?");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        System.out.print("At what age would you like to retire?");
        int retirement = in.nextInt();
        int left = retirement - age;
        int now = 2021;
        int future = now + left;
        System.out.println("You have " + left + " years left until you can retire.");
        System.out.println("it's "+now + ", so you can retire in "+ future);
    }
}
