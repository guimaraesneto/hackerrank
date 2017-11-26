
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] numbers = new long[5];
        long maximumSize = 0, minimumSize = 0 , sum = 0;
        numbers[0] = maximumSize = minimumSize = sum = in.nextLong();
        for (int i = 1; i < 5; i++) {
                numbers[i] = in.nextLong();
            if(numbers[i] > maximumSize) maximumSize = numbers[i];
            if(numbers[i] < minimumSize) minimumSize = numbers[i];
            sum += numbers[i];
        }
        System.out.println( (sum - maximumSize) + " " + (sum - minimumSize)); 
    }
}