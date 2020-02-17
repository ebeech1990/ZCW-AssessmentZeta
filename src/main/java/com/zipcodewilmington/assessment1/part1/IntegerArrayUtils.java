package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        Integer sum = 0;
        int i = 0;
        while (i< intArray.length) {
            sum += intArray[i];
           i++;
        }
        return sum;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {

        Integer product = 1;
        int i = 0;
        while (i< intArray.length) {
            product *= intArray[i];
            i++;
        }
        return product;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
        Integer sum = 0;
        Double avg = 0.0;
        int i = 0;
        while (i< intArray.length) {
            sum += intArray[i];
            i++;
        }
        avg = (double)sum/intArray.length;
        return avg;
    }
}
