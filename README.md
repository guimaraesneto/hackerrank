# hackerrank
This repository is intended to popstar all the content that I am solving the site HakerRank. All content will be posted to folders and subfolders just like the indexes on the site.


algorithms > warmup

- Warmup Challenges

=================================
       1 - Solve Me First

Welcome to HackerRank! The purpose of this challenge is to familiarize you with reading input from stdin (the standard input stream) and writing output to stdout (the standard output stream) using our environment.

Review the code provided in the editor below, then complete the solveMeFirst function so that it returns the sum of two integers read from stdin. Take some time to understand this code so you're prepared to write it yourself in future challenges.

Select a language below, and start coding!

Input Format

Code that reads input from stdin is provided for you in the editor. There are  lines of input, and each line contains a single integer.

Output Format

Code that prints the sum calculated and returned by solveMeFirst is provided for you in the editor.

=================================
     2 - Simple Array Sum


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
