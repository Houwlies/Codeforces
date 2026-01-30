package nl.houwlies.codeforces;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int amountOfWords = scan.nextInt();

        while (amountOfWords > 0) {
            String word = scan.next();
            if (word.length() > 10) {
                System.out.printf("%s%s%s\n",
                        word.charAt(0),
                        (word.length()-2),
                        word.charAt(word.length()-1));
            } else {
                System.out.println(word);
            }
            amountOfWords --;
        }
    }
}
