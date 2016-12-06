package com.task.second;

/**
 * Created by andriyoliynyk on 12/6/16.
 */
public class SecondTask {

    public static void main(String[]args) {
        System.out.println("String :"+args[0]+" is a palindrome :" + isPalindrome(args[0]));

    }

    public static boolean isPalindrome(String str){
        String reverse = new StringBuffer(str).reverse().toString();

        if (reverse.equals(str))
            return true;
        return false;
    }
}
