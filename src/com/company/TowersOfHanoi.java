package com.company;

/**
 * Created by el693 on 1/18/18.
 */
public class TowersOfHanoi {
    public TowersOfHanoi(int disks){
        moveTowers(disks-1,1,3,2);
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
