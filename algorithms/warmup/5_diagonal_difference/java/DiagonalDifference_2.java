package br.com.warmuo;

import java.io.*;
import java.text.DecimalFormat;
import java.util.*;


public class Solution {
	
    public static void main(String[] args) {
    		Scanner in = new Scanner(System.in); 
		int n ;
		int result[] = new int[2];
		n = Integer.parseInt(in.nextLine());
		for(int i = 0 ; i < n; i++){
			String str[] = in.nextLine().split(" ");
			result[0] += Integer.parseInt(str[i]);
			result[1] += Integer.parseInt(str[n-1-i]);
		}
		int rs = Math.abs(result[0] -  result[1]);		
		System.out.println(rs);
    }
}