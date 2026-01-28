package nl.houwlies.codeforces.problems;

public class Watermelon {

    public void watermelonCutter3000(int weight) {
        String awnser = "";
        int amountOfPeople = 2;

        if (weight < 1 || weight > 100) {
            throw new IllegalArgumentException("Weight: " + weight + " is not valid, this method only supports integers from range 1 - 100");
        }


        if (weight % amountOfPeople == 0) {
            awnser = "YES";
        } else {
            awnser = "NO";
        }

        System.out.printf(awnser);
    }

}
