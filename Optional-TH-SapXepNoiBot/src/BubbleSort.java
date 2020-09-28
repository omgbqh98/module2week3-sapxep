import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

public class BubbleSort {
    static void bubbleSort(int[] arr) {
        boolean sort = true;
        for (int i = 1; i < arr.length; i++) {
            sort = false;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    sort = true;
                }
            }
        }
        if (sort == false) {
            System.out.println("da sap xep");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input size");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("nhap value");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
