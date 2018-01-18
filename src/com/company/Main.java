package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Here we go time to destroy the world with some cool disks, enter a number of disks to be solved");
        int x = input.nextInt();
        TowersOfHanoi towers = new TowersOfHanoi(x);

    }


}
