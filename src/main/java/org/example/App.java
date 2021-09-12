package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner noun = new Scanner(System.in);
        System.out.println("Enter a noun: ");
        String n = noun.nextLine();

        Scanner verb = new Scanner(System.in);
        System.out.println("Enter a verb: ");
        String v = verb.nextLine();

        Scanner adjective = new Scanner(System.in);
        System.out.println("Enter an adjective: ");
        String adj = adjective.nextLine();

        Scanner adverb = new Scanner(System.in);
        System.out.println("Enter an adverb: ");
        String adv = adverb.nextLine();

        System.out.println("Do you " + v + " your " + adj + " " + n + " " + adv + "? How neat!");

    }
}
