import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        //task 1
        int[] data1 = {2, 2};
        //task 2
        int[] data2 = new int[1000];
        for (int i = 0; i < data2.length; i++) {
            data2[i] = i + 1;
        }
        //task3
        int[] data3 = new int[20];
        for (int i = 0, j = -19; i < data3.length; i++, j += 2) {
            data3[i] = j;
        }
        //task4
        int[] data4 = {1, 5, 4, 8, 25, 10, 5, 14, 17, 105, 20};
        for (int i = 0; i < data4.length; i++) {
            if (data4[i] % 5 == 0) {
                System.out.println(data4[i]);
            }
        }
        //task5
        double[] data5 = {1.7, 2.5, 28.5, 43.4, 4.6, 127.2568};
        for (int j = 0; j < data5.length; j++) {
            if (data5[j] >= 24.12 && data5[j] <= 467.23) {
                System.out.println(data5[j]);
            }
        }
        //task6
        int[] data6 = {1, 5, 4, 8, 25, 10, 5, 14, 17, 105, 20};
        int count = 0;
        for (int i = 0; i < data6.length; i++) {
            if (data6[i] % 2 == 0) {
                ++count;
            }
        }
        System.out.println(count);
        //task7
        int n = 7;
        for (int i = 1; i < 11; ++i) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
        //2i astichan
        int[] data = {1, 4, 9, 16, 32, 158};
        for (int i = 0; i < data.length; i++) {
            boolean flag = true;
            for (int j = data[i]; j >= 2; j /= 2) {
                if (j % 2 != 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(data[i]);
            }
        }

    }
}

