package com.wildcodeschool;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static int add(String numbers) {

        if (numbers.equals("")) {
            return 0;
        }
        String[] nums = numbers.split(",");
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += Integer.parseInt(nums[i]);
        }

        return total;
    }
}
