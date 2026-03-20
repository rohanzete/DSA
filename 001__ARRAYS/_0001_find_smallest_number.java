// 🔹 1. Find the Smallest Number in an Array

// Given an integer array of size N, find and return the smallest element present in the array.

// Array contains at least 1 element

// Elements can be positive, negative, or zero


import java.util.*;

public class _0001_find_smallest_number {

    public static int smallest(int arr[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }

        }
        return smallest;
    }

    public static void main(String[] args) {

        int arr[] = { 3, 7, 4, 1, 8 };
        System.out.println(smallest(arr));

    }
}