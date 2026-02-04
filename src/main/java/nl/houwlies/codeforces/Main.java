package nl.houwlies.codeforces;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.next();

        char[] arr = input.toCharArray();

        int previous = 0;
        int current = 0;

        // i need a sorting algoritm.

        //

        char[] operators = new char[];
        int[] numbers = new int[];
        for (char c : arr) {
            current = c;
            Character.getNumericValue(c);
            if (Character.getNumericValue(c) != -1) {
                numbers.add(c);
            }
            if (current > previous) {

            }
        }


        System.out.println(selectionSort(numbers));
        selectionSort(numbers);

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numbers.length; i++) {
            result.append(n);
            if (operators.length < i) {
                result.append(operators[i]);
            }
        }

    }

     int[] selectionSort(int[] numbers) {
        int temp;

        for (int i = 0; i < numbers.length - 1; i++) {
            int minIndex = i;
            for (int y = i + 1; y < numbers.length; y++) {
                if (numbers[y] < numbers[minIndex]) {
                    minIndex = y;
                }
            }
            temp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = temp;
        }
        return numbers;
    }

}








