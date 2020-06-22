package com.github.johnmedlockdev.arrays;


import java.util.*;

public class MyArrays {

    public <T> T myLinearSearch(T[] array, T t) {
        int len = array.length;
        for (T value : array)
            if (value == t) {
                return t;
            }
        return null;
    }

    public int myBinarySearch(int[] array, int x) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = left + (right - 1) / 2;

            if (array[middle] == x) {
                return x;
            }

            if (array[middle] < x) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }

        }
        return -1;
    }

    public int[] myBubbleSort(int arr[]) {
        int arrLength = arr.length;
        for (int i = 0; i < arrLength - 1; i++) {
            for (int j = 0; j < arrLength - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;

    }

    public int recursion(int number) {
        if (number <= 1) {
            return 1;
        } else {
            return number * recursion(number - 1);
        }
    }

    public List<Integer> arrayListSort(List<Integer> arr) {
        Collections.sort(arr);

        return arr;
    }
    public HashMap<Integer, String> myHashmaps(HashMap<Integer,String> hashMap){
        HashMap<Integer,String> result = new HashMap<Integer, String>();
        for(Map.Entry<Integer,String> h : hashMap.entrySet()){
            result.put(h.getKey(), h.getValue());
        }

        return result;
    }
}
