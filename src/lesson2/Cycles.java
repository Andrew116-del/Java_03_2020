package lesson2;

public class Cycles {

    public static void printNTimes(int value, int n) {
        //1. while (condition){action}
        int start = 0;
        while (start < n ) {
            System.out.print(value + " ");
            start++;
        }

    }

    public static void main(String[] args) {
        printNTimes(1, 5);
    }
}
