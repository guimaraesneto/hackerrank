import java.io.*;
import java.util.*;

public class Solution {

	private static int diagonalDifference(int[][] ar) {
		int result1 = 0;
		int result2 = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {				
				if ((i == j)) {
					result1 += ar[i][j];
				}
			}
		}
		int col = ar.length - 1;
		for (int i = 0; i < ar.length; i++) {
			result2 += ar[i][col];
			col--;
		}
		result1 = result1-result2;
        if(result1 < 0){
            result1 = result1*(-1);    
        }
		return result1;
	}
	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    		Scanner in = new Scanner(System.in);
    		int n = in.nextInt();
    		int ar[][] = new int[n][n];
    		for (int i = 0; i < ar.length; i++) {
    			for (int j = 0; j < ar.length; j++) {
    				ar[i][j] = in.nextInt();
			}
		}
    		int result = diagonalDifference(ar);
    		System.out.println(result);
    }
}