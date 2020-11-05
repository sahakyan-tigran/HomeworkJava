package Lesson3;
import java.lang.Math;

public class Polindrom {
    public static void main(String[] args) {
        int n = 1881, x;
        x = n;
        int countOfKeys = 0;
        while (x != 0) {
            ++countOfKeys;
            x /= 10;
        }
        int[] arr = new int[countOfKeys];
        int reverseNumber = 0;
        x = n;
        int index = 0;
        while (x != 0) {
            arr[index] = x % 10;
            x /= 10;
            ++index;
        }
        for (int i = 0; i < countOfKeys; ++i) {
            reverseNumber += arr[i] * Math.pow(10, countOfKeys - i - 1);
        }
        if (n == reverseNumber) {
            System.out.println("Yes,the given number is polindrom");
        } else {
            System.out.println("No,the given number is not polindrom");
        }
    }
}


