package br.com.warmuo;

import java.io.*;
import java.text.DecimalFormat;
import java.util.*;


public class Solution {
    
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int i = 0;
            while (i < n) {
                    if (i != (n-1)) {
                        for (int j = 0; j < ((n-i)-1); j++) System.out.print(" ");
            }       
                    for (int j = 0; j <= i; j++) System.out.print("#");
            i++;
            System.out.println();
        }
    }
}