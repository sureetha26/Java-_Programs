package sorting_techniques;

public class Insertionsort {
    void sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 12, 11, 37, 28, 10 };
        Insertionsort ob = new Insertionsort();

        System.out.println("\nBefore Insertion sort:");
        printArray(arr);

        ob.sort(arr);

        System.out.println("\nAfter Insertion sort:");
        printArray(arr);
    }
}
