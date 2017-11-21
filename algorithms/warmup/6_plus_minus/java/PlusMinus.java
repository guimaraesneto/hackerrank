
import java.io.*;
import java.text.DecimalFormat;
import java.util.*;


public class Solution {
	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    		Scanner in = new Scanner(System.in);
    		int n = in.nextInt();
    		int ar[] = new int[n];
    		for (int i = 0; i < ar.length; i++) {
    				ar[i] = in.nextInt();
		}
    		plusMinus(ar);
    }

	private static void plusMinus(int[] ar) {
		// TODO Auto-generated method stub
		float[] result =  new float[3];
		DecimalFormat df = new DecimalFormat("0.000000");
		for (int i = 0; i < ar.length; i++) {
			if(ar[i] > 0 ) {
				result[0] ++;
			}else if(ar[i] < 0 ) {
				result[1] ++;
			}else {
				result[2] ++;
			}
		}
		for (int i = 0; i < result.length; i++) {
			System.out.println(df.format((result[i]/ar.length)));
		}
	}
}