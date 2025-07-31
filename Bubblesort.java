package sorting_techniques;

public class Bubblesort {

    void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    int findSecondLargest(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        Bubblesort ob = new Bubblesort();
        int a[] = { 64, 34, 25, 12 };
        ob.bubbleSort(a);
        System.out.print("Sorted array: ");
        for (int num : a) {
            System.out.print(num + " ");
        }
        System.out.println();

        int secondLargest = ob.findSecondLargest(a);
        System.out.println("Second largest element: " + secondLargest);
    }
}
