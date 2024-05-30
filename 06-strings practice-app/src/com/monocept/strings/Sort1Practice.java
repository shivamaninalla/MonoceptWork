package com.monocept.strings;

public class Sort1Practice {

    public static void countingSort(int[] array) {
        int max = findMax(array);

        // Create a counting array to store the count of each number
        int[] countArray = new int[max + 1];

        // Count occurrences of each number
        for (int value : array) {
            countArray[value]++;
        }

        // Modify countArray to store actual position of the elements in sorted order
        for (int i = 1; i <= max; i++) {
            countArray[i] += countArray[i - 1];
        }

        // Create a temporary array to store sorted elements
        int[] tempArray = new int[array.length];

        // Place the elements in sorted order in the temporary array
        for (int value : array) {
            tempArray[countArray[value] - 1] = value;
            countArray[value]--;
        }

        // Copy the sorted elements back to the original array
        for (int i = 0; i < array.length; i++) {
            array[i] = tempArray[i];
        }
    }

    private static int findMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = { 9000, 2, 511, 3, 9, 1,77};
        countingSort(array);
        System.out.println("Sorted array:");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
