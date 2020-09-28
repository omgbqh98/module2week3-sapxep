package cacThaoTacSapXep;

import java.util.Scanner;

public class selectSort {
    static public void sort(int k[]) {
        int min ;
        for (int i = 0; i < k.length; i++) {
            for (int j = i + 1; j < k.length; j++) {
                if (k[i] > k[j]) {
                    min = k[j];
                    k[j] = k[i];
                    k[i] = min;
//
                }
            }
        }
    }

    static public void bubbleSort(int list[]) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length-k; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    needNextPass = true;
                }
            }
            for (int j = 0; j < list.length; j++) {
                System.out.println(list[j]);
            }
            System.out.println();
        }
    }

    static void  insertionSort(int []list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int j;
            for ( j = i - 1; j > currentElement; j--) {
                list[j + 1] = list[j];
            }
            list[j+1] = currentElement;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input size: ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("enter ");
        for (int i = 0; i <size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("hien thi");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        bubbleSort(arr);

    }
}


