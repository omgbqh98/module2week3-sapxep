public class Main {
    static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int currentValue = arr[i];
            int j;

            for ( j = i - 1; j >= 0 && arr[j] > currentValue; j--) {
                arr[j+1] = arr[j];
            }
            arr[j + 1] = currentValue;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 71, 8};
        System.out.println("trc khi sap xep");
        for (Integer integer : arr) {
            System.out.println(integer);
        }
        System.out.println("sau khi sap xep");
        insertSort(arr);
        for (Integer integer : arr) {
            System.out.print(integer+", ");
        }
    }
}
