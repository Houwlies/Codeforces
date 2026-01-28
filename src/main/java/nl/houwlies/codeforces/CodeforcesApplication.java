package nl.houwlies.codeforces;

import nl.houwlies.codeforces.problems.Day1Problem1;

import java.util.Scanner;

public class CodeforcesApplication {

	public static void main(String[] args) {

    Day1Problem1 day1Problem1 = new Day1Problem1();
    Scanner scan = new Scanner(System.in);

    int one = scan.nextInt();
    int[] array = new int[one];

        for (int i = 0; i < one; i++) {
        array[i] = scan.nextInt();
    }

        day1Problem1.reverseArray(array);

        scan.close();
	}

}
