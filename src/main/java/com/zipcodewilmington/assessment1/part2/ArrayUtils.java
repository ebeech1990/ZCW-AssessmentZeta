package com.zipcodewilmington.assessment1.part2;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        Integer count = 0;
        for(int i = 0; i < objectArray.length; i++) {
            if(objectArray[i] == objectToCount) {
                count++;
            }
        }
        return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        int arrLen = objectArray.length;
        Integer numOfOccur = getNumberOfOccurrences(objectArray, objectToRemove);
        Integer[] newArray = new Integer[arrLen-numOfOccur];

        int current = 0;

        for(int i = 0; i < objectArray.length-1; i++){
            if(objectArray[i] == objectToRemove){

            }
            else{
                newArray[current] = (Integer) objectArray[i];
                current++;
            }
        }

        return newArray;

    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        Object currentMostFreq = objectArray[0];

        for(int i = 0; i < objectArray.length-1; i++){
            if(i == objectArray.length-1) {
                break;
            }
            if(getNumberOfOccurrences(objectArray, objectArray[i]) > getNumberOfOccurrences(objectArray, objectArray[i+1])){
                currentMostFreq = objectArray[i];
            }
        }
        return currentMostFreq;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        Object currentLeastFreq = objectArray[0];
        Integer minValue = objectArray.length-1;
//{1,1,2,3,3,3,4,4,4,4};
        for(int i = 0; i < objectArray.length-1; i++){
            if(i == objectArray.length-1) {
                break;
            }

            if((getNumberOfOccurrences(objectArray, objectArray[i]) < minValue)){
                currentLeastFreq = objectArray[i];
                minValue = (getNumberOfOccurrences(objectArray, objectArray[i]));
            }
        }
        return currentLeastFreq;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        Integer[] newArr = new Integer[(objectArray.length) + (objectArrayToAdd.length)];
        int pos = 0;
            for(Object o : objectArray) {
                newArr[pos] = (Integer) o;
                pos++;
            }
        for(Object o : objectArrayToAdd) {
            newArr[pos] = (Integer) o;
            pos++;
        }
        return newArr;
    }
}
