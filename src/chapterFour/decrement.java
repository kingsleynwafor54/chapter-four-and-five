package chapterFour;

public class decrement {

    public void evenNumbers() {
        for (int number = 0; number <= 100; number += 2) {
            System.out.print(number + " ");

        }
    }

    public void oddNumbers() {
        for (int number = 1; number <= 100; number += 2) {
            System.out.print(number + " ");
        }
    }


    public static void main(String[] args) {

        decrement value = new decrement();
        value.evenNumbers();
        value.oddNumbers();
    }


}

