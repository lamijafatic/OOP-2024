package org.example.lab6;

import java.util.Arrays;
import java.util.Scanner;

public class lab6 {

    public class Main {
        public static void main(String[] args) {
            int[] values = {6, 5, 8, 6, 11};
            int[] array = {-3, 2, 3, 4, 7, 8, 12};
            System.out.println("smallest: " + smallest(values));
            System.out.println("Index of smallest: " + indexOfSmallest(values));
            System.out.println(indexOfTheSmallestStartingFrom(values, 1));
            System.out.println(indexOfTheSmallestStartingFrom(values, 2));
            System.out.println(indexOfTheSmallestStartingFrom(values, 4));
            System.out.println(Arrays.toString(values));
            swap(values, 1, 0);
            System.out.println(Arrays.toString(values));
            swap(values, 0, 3);
            System.out.println(Arrays.toString(values));

            Scanner reader = new Scanner(System.in);

            System.out.println("Values of the array: " + Arrays.toString(array));
            System.out.println("Enter searched number: ");
            String searchedValue = reader.nextLine();


            boolean result = BinarySearch.search(array, Integer.parseInt(searchedValue));


            if (result) {
                System.out.println("The value is in the array.");
            } else {
                System.out.println("The value is not in the array.");
            }
            printElegantly(array);

            NightSky nightSky = new NightSky(0.1, 40, 10);
            nightSky.print();
            System.out.println("Number of stars: " + nightSky.starsInLastPrint());
            System.out.println();
        }


        public static int smallest(int[] array) {

            int min = array[0];


            for (int i = 1; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }

            return min;
        }

        public static int indexOfSmallest(int[] array) {
            // Initialize the index and smallest value
            int minIndex = 0;
            int minValue = array[0];

            // Iterate through the array to find the index of the smallest value
            for (int i = 1; i < array.length; i++) {
                if (array[i] < minValue) {
                    minValue = array[i];
                    minIndex = i;
                }
            }

            return minIndex;
        }

        public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
            // Initialize the minimum index and value starting from the given index
            int minIndex = index;
            int minValue = array[index];

            // Iterate through the rest of the array starting from the specified index
            for (int i = index + 1; i < array.length; i++) {
                if (array[i] < minValue) {
                    minValue = array[i];
                    minIndex = i;
                }
            }

            return minIndex;
        }

        public static void swap(int[] array, int index1, int index2) {

            int temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        }

        public class BinarySearch {

            public static boolean search(int[] array, int searchedValue) {
                int left = 0;
                int right = array.length - 1;


                while (left <= right) {
                    int mid = left + (right - left) / 2;


                    if (array[mid] == searchedValue) {
                        return true;
                    }


                    if (array[mid] < searchedValue) {
                        left = mid + 1;
                    }

                    else {
                        right = mid - 1;
                    }
                }

                return false;
            }

        }


        public static void printElegantly(int[] array) {

            for (int i = 0; i < array.length; i++) {

                System.out.print(array[i]);


                if (i < array.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }

}
