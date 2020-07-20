package com.wildcodeschool;

import java.util.ArrayList;
import java.util.List;

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

        String delimiter = ",";

        if (numbers.equals("")) {
            return 0;
        }
        if (numbers.startsWith("//")) {
            delimiter = numbers.substring(2, 3);
            numbers = numbers.substring(4);
        }

        String[] nums = numbers
                .split("[" + delimiter + ",\n]");
        int total = 0;
        List<Integer> negatives = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int value = Integer.parseInt(nums[i]);
            if (value < 0) {
                negatives.add(value);
            }
            total += value;
        }
        if (negatives.size() > 0) {

            throw new IllegalArgumentException("negatives not allowed: " + negatives.toString());
        }

        return total;
    }
}
