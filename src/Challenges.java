import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

public class Challenges {
    /** Create a function which returns the number of true values there are in an array.*/
    public static int countTrueFalse(boolean[] arr) {
        int yea = 0;
        for(boolean count : arr){
            if (count){
                yea++;
            }
        }
        return yea;
    }

    /** Create a function that takes an array and returns the absolute difference between the biggest and smallest numbers.*/
    public static int differenceMinMax(int[] nums){
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length-1];

        return Math.abs(max-min);
    }

    /**
     * Stutter
     * Write a function that stutters a word as if someone is struggling to read it.
     * The first two letters are repeated twice with an ellipsis ... and space after each,
     * and then the word is pronounced with a question mark ?
     */
    public static String stutter(String str){
        String  stut = str.substring(0,2) + "... ";
        return stut + stut + str + "?";
    }

    /** Write a function that takes an array of numbers and returns the second largest number.*/
    public static int secondLargestNumber(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length-2];
    }

    /**
     FizzBuzz
     Create a function that takes a number as an argument and returns "Fizz", "Buzz" or "FizzBuzz".
     If the number is a multiple of 3 the output should be "Fizz".
     If the number given is a multiple of 5, the output should be "Buzz".
     If the number given is a multiple of both 3 and 5, the output should be "FizzBuzz".
     If the number is not a multiple of either 3 or 5
     The output should always be a string even if it is not a multiple of 3 or 5.
     **/
    public static String fizzBuzz(int num){
        if(num%3==0 && num % 5 ==0){
            return "FizzBuzz";
        }else{
            if(num%3 == 0){
                return "Fizz";
            }
            if(num%5 ==0){
                return "Buzz";
            }
        }
        return String.valueOf(num);
    }

    /**
     * Skip Counting
     * Write a program that gets three integers from the user.
     * Count from the first number to the second number in increments of the third number.
     * Return the counts in a string separated by two ellipses (just like the example)
     * Handle bad user input (numbers that cannot be counted in that pattern) by returning "Try again with better numbers!"
     * Example:
     * Count from: 4
     * Count to  : 13
     * Count by  : 3
     *
     * 4.. 7.. 10.. 13
     *
     */
    public static String skipCount(int countFrom, int countTo, int countBy){
        if(countTo < countFrom){
            return "Try again with better numbers!";
        }
        StringBuilder answer= new StringBuilder();
        for (int i=countFrom; i<=countTo; i += countBy){
            answer.append(i);
            answer.append(".. ");
        }
        answer.setLength(answer.length()-3);
        return answer.toString();
    }

    /** The "Reverser"
     * takes a string as input and returns that string in reverse order, with the opposite case.*/
    public static String reverser(String reverseMe){
        StringBuilder reversed = new StringBuilder();
        // reverse case
        for (char ch : reverseMe.toCharArray()){
            if(Character.isUpperCase(ch)){
                reversed.append(Character.toLowerCase(ch));
            }else{
                reversed.append(Character.toUpperCase(ch));
            }
        }
        // reverse string
        return reversed.reverse().toString();
    }

    /**
     * Reverse An Array
     * Write a function that reverses the order of an array
     */
    public static int[] reverseArray(int[] arr){
        int[] ans = new int[arr.length];
        int iterator = 0;
        for(int i = arr.length-1; i >= 0; i--){
            ans[iterator] = arr[i];
            iterator++;
        }
        return ans;
    }

    /**
     * Write a function that finds the word "bomb" in the given string (not case sensitive).
     * Return "DUCK!" if found, otherwise,"Relax, there's no bomb.".
     */
    public static String duckTheBomb(String checkMe){
        if(checkMe.toUpperCase().contains("BOMB")){
            return "DUCK!";
        }
        return "Relax, there's no bomb.";
    }

    /** Sort in Ascending Order
     * Create a method that takes an array of integers and returns a new array, sorted in ascending order (smallest to biggest).
     * If the function's argument is null, an empty array or undefined, return an empty array
     */
    public static int[] sortNumsAscending(int[] nums){
        Arrays.sort(nums);
        return nums;
    }

    /**
     * Remove Duplicates
     * Create a method that takes an array of strings,removes all duplicate items
     * and returns a new array in the same sequential order as the old array (minus duplicates).
     */
    public static String[] removeDups(String[] str){
        ArrayList<String> cleanedList = new ArrayList<>();
        for(String each : str){
            if(!cleanedList.contains(each)){
                cleanedList.add(each);
            }
        }
        String[] ans = cleanedList.toArray(new String[0]);
        return ans;
    }
}
