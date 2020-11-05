package Lesson3;

public class BubbleSort {
    static void BubbleSort(int array[]) {
        for (int i = 0; i < array.length - 1; ++i) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 7, 2, 6, 3, 2, 5};
        BubbleSort(arr);
        for (int x: arr){
            System.out.println(x +  " ");
        }
    }
}
