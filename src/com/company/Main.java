package com.company;
import java.util.Random;
import java.util.Scanner;
import java.util.HashMap;
public class Main {

    public static void main(String[] args) {

    Scanner input = new Scanner  (System.in);
    System.out.println("How many sides does your dice have?");
    int sides = input.nextInt();
    System.out.println("How many times do you want to throw the dice");
    int Throws = input.nextInt();
    int tally = (int) (Math.random() * Throws);
    HashMap<Integer, Integer> amount = new HashMap<Integer, Integer>();
    amount.put(tally,);




    }
}
