# hackerrank
This repository is intended to popstar all the content that I am solving the site HakerRank. All content will be posted to folders and subfolders just like the indexes on the site.
algorithms > warmup
- Warmup Challenges

=================================
       1 - Solve Me First
=================================

Welcome to HackerRank! The purpose of this challenge is to familiarize you with reading input from stdin (the standard input stream) and writing output to stdout (the standard output stream) using our environment.
Review the code provided in the editor below, then complete the solveMeFirst function so that it returns the sum of two integers read from stdin. Take some time to understand this code so you're prepared to write it yourself in future challenges.
Select a language below, and start coding!
Input Format
Code that reads input from stdin is provided for you in the editor. There are  lines of input, and each line contains a single integer.
Output Format
Code that prints the sum calculated and returned by solveMeFirst is provided for you in the editor.

=================================
     2 - Simple Array Sum
=================================

Given an array of N integers, can you find the sum of its elements?
Input Format
The first line contains an integer, N, denoting the size of the array. 
The second line contains N space-separated integers representing the array's elements.
Output Format
Print the sum of the array's elements as a single integer.
Sample Input
6
1 2 3 4 10 11
Sample Output
31
Explanation
We print the sum of the array's elements, which is: 1+2+3+4+10+11=31

=================================
    3 - Compare the Triplets
=================================

Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale from 1 to 100 for three categories: problem clarity, originality, and difficulty.
We define the rating for Alice's challenge to be the triplet A = (a0, a1, a2) , and the rating for Bob's challenge to be the triplet B = (b0, b1, b2).
Your task is to find their comparison points by comparing a0 with b0, a1 with b1 and a2  with .
If ai > bi, then Alice is awarded 1 point.
If ai < bi, then Bob is awarded 1 point.
If ai = bi, then neither person receives a point.
Comparison points is the total points a person earned.
Given A and B, can you compare the two challenges and print their respective comparison points?
Input Format
The first line contains 3 space-separated integers, a0, a1 and a2, describing the respective values in triplet A. 
The second line contains  space-separated integers, b0, b1 and b2, describing the respective values in triplet B.
Constraints
1 <= ai <= 100
1 <= bi <= 100
Output Format
Print two space-separated integers denoting the respective comparison points earned by Alice and Bob.
Sample Input
5 6 7
3 6 10
Sample Output
1 1
Explanation
In this example:
A = (a0, a1, a2) = (5, 6, 7)
B = (b0, b1, b2) = (3, 6, 10)
Now, let's compare each individual score:
a0 > b0, so Alice receives 1 point.
a1 = b1, so nobody receives a point.
a2 < b2, so Bob receives 1 point.
Alice's comparison score is , and Bob's comparison score is 1. Thus, we print 1 1 (Alice's comparison score followed by Bob's comparison score) on a single line.

=================================
    4 - A Very Big Sum
=================================

You are given an array of integers of size N. You need to print the sum of the elements in the array, keeping in mind that some of those integers may be quite large.
Input Format
The first line of the input consists of an integer N. The next line contains N space-separated integers contained in the array.
Output Format
Print a single value equal to the sum of the elements in the array.
Constraints
1 <= N <= 10
0 <= A[i] <= 10ˆ10
Sample Input
5
1000000001 1000000002 1000000003 1000000004 1000000005
Output
5000000015
Note:
The range of the 32-bit integer is (-2ˆ31) to (2ˆ31 - 1) or [-2147483648, 2147483647].
When we add several integer values, the resulting sum might exceed the above range. You might need to use long long int in C/C++ or long data type in Java to store such sums.

=================================
5 - Diagonal Difference
=================================

Given a square matrix of size N x N, calculate the absolute difference between the sums of its diagonals.
Input Format
The first line contains a single integer, N. The next N lines denote the matrix's rows, with each line containing N space-separated integers describing the columns.
Constraints
-100<= Elements in the matrix <= 100
Output Format
Print the absolute difference between the two sums of the matrix's diagonals as a single integer.
Sample Input
3
11 2 4
4 5 6
10 8 -12
Sample Output
15
Explanation
The primary diagonal is:
11
     5
       -12
Sum across the primary diagonal: 11 + 5 - 12 = 4
The secondary diagonal is:
        4
     5
10
Sum across the secondary diagonal: 4 + 5 + 10 = 19
Difference: |4 - 19| = 15
Note: |x| is absolute value function

=================================
6 - Plus Minus
=================================

Given an array of integers, calculate which fraction of its elements are positive, which fraction of its elements are negative, and which fraction of its elements are zeroes, respectively. Print the decimal value of each fraction on a new line.
Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to 10ˆ4 are acceptable.
Input Format
The first line contains an integer, N, denoting the size of the array. 
The second line contains N space-separated integers describing an array of numbers (a0,a1,a2...,an-1).
Output Format
You must print the following 3 lines:
1. A decimal representing of the fraction of positive numbers in the array compared to its size.
2. A decimal representing of the fraction of negative numbers in the array compared to its size.
3. A decimal representing of the fraction of zeroes in the array compared to its size.
Sample Input
6
-4 3 -9 0 4 1         
Sample Output
0.500000
0.333333
0.166667
Explanation
There are 3 positive numbers, 3 negative numbers, and 1 zero in the array. 
The respective fractions of positive numbers, negative numbers and zeroes are 3/6 = 0.500000, 2/6 = 0.33333 anda 1/6 = 0.166667, respectively.

=================================
7 - Staircase
=================================
Staircase
Consider a staircase of size n = 4:
#
##
###
####
Observe that its base and height are both equal to n, and the image is drawn using # symbols and spaces. The last line is not preceded by any spaces.
Write a program that prints a staircase of size n.
Input Format
A single integer, n, denoting the size of the staircase.
Output Format
Print a staircase of size n using # symbols and spaces.
Note: The last line must have 0 spaces in it.
Sample Input
6
Sample Output
#
##
###
####
#####
######
Explanation
The staircase is right-aligned, composed of # symbols and spaces, and has a height and width of n = 6.


=================================
8 - Mini-Max Sum
=================================

Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.
Input Format
A single line of five space-separated integers.
Constraints
Each integer is in the inclusive range [1,10ˆ9].
Output Format
Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than 32 bit integer.)
Sample Input
1 2 3 4 5
Sample Output
10 14
Explanation
Our initial numbers are 1, 2, 3, 4, and 5. We can calculate the following sums using four of the five integers:
1 If we sum everything except 1, our sum is 2+3+4+5=14.
2 If we sum everything except 2, our sum is 1+3+4+5=13.
3 If we sum everything except 3, our sum is 1+2+4+5=12.
4 If we sum everything except 4, our sum is 1+2+3+5=11.
5 If we sum everything except 5, our sum is 1+2+3+4=10.
As you can see, the minimal sum is 2+3+4+5=14 and the maximal sum is 1+2+3+4=10. Thus, we print these minimal and maximal sums as two space-separated integers on a new line.
Hints: Beware of integer overflow! Use 64-bit Integer.

=================================
9 Birthday Cake Candles
=================================
Colleen is turning n years old! Therefore, she has n candles of various heights on her cake, and candle i has height height_i. Because the taller candles tower over the shorter ones, Colleen can only blow out the tallest candles.
Given the height_i for each individual candle, find and print the number of candles she can successfully blow out.
Input Format
The first line contains a single integer, n, denoting the number of candles on the cake.
The second line contains n space-separated integers, where each integer i describes the height of candle i.
Constraints
1 <= n < 10ˆ5
1 <= height_i <=10ˆ7
Output Format
Print the number of candles Colleen blows out on a new line.
Sample Input 0
4
3 2 1 3
Sample Output 0
2
Explanation 0
We have one candle of height 1, one candle of height 2, and two candles of height 3. Colleen only blows out the tallest candles, meaning the candles where height = 3. Because there are 2 such candles, we print 2 on a new line.

=================================
10 Time Conversion
=================================
Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
Note: Midnight is 12:00:00 AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00 PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
Input Format
A single string containing a time in 12-hour clock format (i.e.: hh:mm:ss AM or hh:mm:ss PM), where 01 <= hh <12 and 00 <= mm, ss <= 59.
Output Format
Convert and print the given time in 24-hour format, where 00 <= hh <= 23.
Sample Input
07:05:45PM
Sample Output
19:05:45
