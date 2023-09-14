package javaPractise;

import java.util.Scanner;

class practiseBinarySearch2 {
   static int totalBubbleSortSwaps(int[] array, int M) {
       int size = array.length;
       int var = 0;
       int totalSwaps = 0;
       //Write your code here
       // Perform bubble sort for M iterations
        for (int iteration = 1; iteration <= M; iteration++) {
            int swapsInIteration = 0;

            for (int i = 0; i < size - 1; i++) {
                if (array[i] < array[i + 1]) {
                    // Swap elements if they are in descending order
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapsInIteration++;
                }
            }

            if (swapsInIteration == 0) {
                // If no swaps were made in this iteration, break
                break;
            }

            totalSwaps += swapsInIteration;
        }

        return totalSwaps;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input M, array size, and elements of the array
        int M = scanner.nextInt();
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Calculate the total number of swaps after M iterations
        int swaps = totalBubbleSortSwaps(array, M);

        // Print the total number of swaps
        System.out.println(swaps);
    }
}

