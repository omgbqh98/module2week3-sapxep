import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class SelectSort {
    static void selectSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int min = list[i];
            int currentMinIndex = i;
            for (int j = i+1; j < list.length; j++) {
                if (min > list[j]) {
                    min=list[j];
                    currentMinIndex=j;
                }
            }
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = min;
            }
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input size");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("input value");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        selectSort(arr);
        System.out.println("sau khi sap xep");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
