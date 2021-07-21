import java.util.Arrays;

public class Challenges {
    /** Create a function which returns the number of true values there are in an array.*/
    public static int countTrueFalse(boolean[] lOB) {
        //create an int to hold the count
        //for every true value add 1 to the int
        //return int
        int tally = 0;
        for(boolean right: lOB){
            if(right == true){
                tally += 1;
            }
        }
        return tally;
    }

    /** Create a function that takes an array and returns the absolute difference between the biggest and smallest numbers.*/
    public static int differenceMinMax(int[] range){
        //find the max and min values in the array
        //subtract the min value from the max: max-min = range
        //return range
        Arrays.sort(range);
        return range[range.length -1] - range[0];
    }

    /**
     * Stutter
     * Write a function that stutters a word as if someone is struggling to read it.
     * The first two letters are repeated twice with an ellipsis ... and space after each,
     * and then the word is pronounced with a question mark ?
     */
    public static String stutter(String str){
        //use a string.length and take the 1st 2 letters
        //add a . . . after and repeat once more
        //then return the word with a ? after
        return (str.substring(0,2) + "... " + str.substring(0,2) + "... " + str + "?");
    }

    /** Write a function that takes an array of numbers and returns the second largest number.*/
    public static int secondLargestNumber(int[] nums){
        // write your code here
        // you will need to change the return statement
        Arrays.sort(nums);
        return nums[nums.length -2];
    }

    /**
     FizzBuzz
     Create a function that takes a number as an argument and returns "Fizz", "Buzz" or "FizzBuzz".
     If the number is a multiple of 3 the output should be "Fizz".
     If the number given is a multiple of 5, the output should be "Buzz".
     If the number given is a multiple of both 3 and 5, the output should be "FizzBuzz".
     If the number is not a multiple of either 3 or 5, the number should be output on its own as shown in the examples below.
     The output should always be a string even if it is not a multiple of 3 or 5.
     **/
    public static String fizzBuzz(int num){
        // write your code here
        // you will need to change the return statement
        return " ";
    }

    /**
     * Skip Counting
     * Write a program that gets three integers from the user.
     * Count from the first number to the second number in increments of the third number.
     */
    public static int[] skipCount(int countFrom, int countTo, int countBy){
        // write your code here
        // you will need to change the return statement
        return new int[0];
    }

    /** The "Reverser"
     * takes a string as input and returns that string in reverse order, with the opposite case.*/
    public static String reverser(String reverseMe){
        // write your code here
        // you will need to change the return statement
        return "";
    }

    /**
     * Reverse An Array
     * Write a function that reverses the order of an array
     */
    public static int[] reverseArray(int[] arr){
        // write your code here
        // you will need to change the return statement
        return new int[0];
    }

    /**
     * Write a function that finds the word "bomb" in the given string (not case sensitive).
     * Return "DUCK!" if found, otherwise,"Relax, there's no bomb.".
     */
    public static String duckTheBomb(String checkMe){
        // write your code here
        // you will need to change the return statement
        return "";
    }

    /** Sort in Ascending Order
     * Create a method that takes an array of integers and returns a new array, sorted in ascending order (smallest to biggest).
     * If the function's argument is null, an empty array or undefined, return an empty array
     */
    public static int[] sortNumsAscending(int[] nums){
        // write your code here
        // you will need to change the return statement
        return new int[0];
    }

    /**
     * Remove Duplicates
     * Create a method that takes an array of strings,removes all duplicate items
     * and returns a new array in the same sequential order as the old array (minus duplicates).
     */
    public static String[] removeDups(String[] str){
        // write your code here
        // you will need to change the return statement
        return new String[0];
    }
}