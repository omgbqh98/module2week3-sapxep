import java.util.Scanner;

public class BubbleSortByStep {
    static void bubbleSort(int arr[]) {
        boolean needNextPass = true;
        for (int k = 1; k < arr.length && needNextPass;k++) {
            needNextPass = false;
            for (int i = 0; i < arr.length - k; i++) {
                if (arr[i] > arr[i + 1]) {
                    System.out.println("Swap " + arr[i] + "with " + arr[i + 1]);
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                    needNextPass = true;
                }
            }
//            if (needNextPass == false) {
//                System.out.println("Array may be sorted and next pass not needed");
//                break;
//            }

        }
        System.out.println("List after the  sort: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j] + "\t");

        }System.out.println();

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input size: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("input " + arr.length + " values: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(" list");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", "+ "\n");
        }
        bubbleSort(arr);
    }
}
