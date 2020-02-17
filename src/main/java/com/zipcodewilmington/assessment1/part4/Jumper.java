package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        int numOfJumps = 0;
        int additionalJumps = 0;
        if(k%j==0) {
            numOfJumps = k/j;
        }
        else{
            additionalJumps = k%j;
            numOfJumps = (k/j) + additionalJumps;
        }
        return numOfJumps;
    }

}
