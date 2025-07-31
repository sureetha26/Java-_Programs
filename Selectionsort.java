package sorting_techniques;

public class Selectionsort {
    public static void selectionsort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }

    public static double calculateAvg(int[] arr) {
        int sum = 0, n = arr.length;
        for (int value : arr) {
            sum += value;
        }
        return (double) sum / n;
    }

    public static int countGreatThanAvg(int[] arr, double avg) {
        int count = 0;
        for (int v : arr) {
            if (v > avg) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };
        selectionsort(arr);
        System.out.println("Sorted array using Selection sort: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        double avg = calculateAvg(arr);
        int cnt = countGreatThanAvg(arr, avg);
        System.out.println("\nAverage of elements : " + avg + "\n Number of elements greater than average : " + cnt);
    }
}
