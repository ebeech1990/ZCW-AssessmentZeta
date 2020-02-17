package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
        List<Integer> odds = new ArrayList<>();
        for(Integer num : ints){
            if(num%2==0) {
                odds.remove(num);
            }
            else{
                odds.add(num);
            }
        }
        Integer[] result = odds.toArray(new Integer[odds.size()]);
        return result;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {

        List<Integer> evens = new ArrayList<>();
        for(Integer num : ints){
            if(num%2!=0) {
                evens.remove(num);
            }
            else{
                evens.add(num);
            }
        }
        Integer[] result = evens.toArray(new Integer[evens.size()]);
        return result;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {

        List<Integer> indv3 = new ArrayList<>();
        for(Integer num : ints){
            if(num%3==0) {
                indv3.remove(num);
            }
            else{
                indv3.add(num);
            }
        }
        Integer[] result = indv3.toArray(new Integer[indv3.size()]);
        return result;
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {

        List<Integer> multiplesOfN = new ArrayList<>();
        for(Integer num : ints){
            if(num%multiple==0) {
                multiplesOfN.remove(num);
            }
            else{
                multiplesOfN.add(num);
            }
        }
        Integer[] result = multiplesOfN.toArray(new Integer[multiplesOfN.size()]);
        return result;
    }
}
