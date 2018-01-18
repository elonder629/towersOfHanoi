package com.company;

/**
 * Created by el693 (who is super cool and awesome) on 1/18/18.
 */
class TowersOfHanoi {
    public int step = 0;
    TowersOfHanoi(int disks){
        moveTowers(disks-1,1,3,2);
    }
    private void moveTowers(int disk, int source, int dest, int spare){

        if (disk == 0) {
            step++;
            System.out.println(step + ": Move disk 1 to tower " + dest);
        }
        else {
            moveTowers(disk-1, source, spare, dest);
            step++;
            System.out.println(step +": Move disk " + (disk + 1) + " to tower " + dest);
            moveTowers(disk-1, spare, dest, source);
        }

    }
}
