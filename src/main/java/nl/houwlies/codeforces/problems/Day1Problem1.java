package nl.houwlies.codeforces.problems;

public class Day1Problem1 {

    // implement into main:

//    Main main = new Main();
//    Scanner scan = new Scanner(System.in);
//
//    int one = scan.nextInt();
//    int[] array = new int[one];
//
//        for (int i = 0; i < one; i++) {
//        array[i] = scan.nextInt();
//    }
//
//        main.day1Problem1(array);
//
//        scan.close();

    public void reverseArray(int[] inputArray) {

        int length = inputArray.length;
        int[] reversedArray = new int[length];

        for (int i = 0; i < inputArray.length; i++) {
            reversedArray[i] = inputArray[length - 1];
            System.out.printf(reversedArray[i] + " ");
            length -= 1;
        }
    }

}