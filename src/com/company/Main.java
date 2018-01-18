package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Here we go time to destroy the world with some cool disks, enter a number of disks to be solved");
        int x = input.nextInt();
        moveTowers(x-1, 1, 3, 2);

    }
    public static void moveTowers(int disk, int source, int dest, int spare){
        if (disk == 0)
            System.out.println("Move disk 1 to tower " + dest);
        else{
            moveTowers(disk-1, source, spare, dest);
            System.out.println("Move disk " + (disk + 1) + " to tower " + dest);
            moveTowers(disk-1, spare, dest, source);
        }

    }

}
