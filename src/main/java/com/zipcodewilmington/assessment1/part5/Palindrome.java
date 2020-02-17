package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    //abba

    public static int isPalindromic(String a) {
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)!=a.charAt(a.length()-1-i))
                return 0;
        }
        return 1;

    }

    public Integer countPalindromes(String input){

        String a;
        int countSubs=input.length();
        for(int i=0;i<input.length();i++)
        {
            for(int j=i+2;j<=input.length();j++)
            {
                a=input.substring(i,j);
                countSubs+=isPalindromic(a);
            }
        }
        return countSubs;

    }
}
