package com.github.johnmedlockdev.arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MyArraysTest {

    MyArrays myArrays = new MyArrays();


    Integer[] test = {3, 21, 2};

    int[] sortedTest = {5, 39, 50, 100, 101, 102};
    int[] unSortedTest = {100, 101, 50, 5, 39, 102};

    List<Integer> iSortedTest = new ArrayList<Integer>();
    List<Integer> iUnSortedTest = new ArrayList<Integer>();

    @BeforeEach
    void setup() {
        for(int value : unSortedTest){
            iUnSortedTest.add(value);
        }
        for(int value : sortedTest){
            iSortedTest.add(value);
        }
    }

    @Test
    @DisplayName("Testing LinearSearch with contained values")
    void myLinearSearch() {
        int expected = 3;
        int actual = myArrays.myLinearSearch(test, 3);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Testing LinearSearch without contained values")
    void myLinearSearchFail() {
        assertNull(myArrays.myLinearSearch(test, 33));
    }

    @Test
    @DisplayName("Testing success of binary search")
    void myBinarySearch() {
        assertEquals(101, myArrays.myBinarySearch(sortedTest, 101));
    }

    @Test
    @DisplayName("Testing fail condition of binary search")
    void myBinarySearchFail() {
        assertEquals(-1, myArrays.myBinarySearch(sortedTest, 2341));
    }

    @Test
    @DisplayName("BubbleSort Tests")
    void myBubbleSort() {
        assertArrayEquals(sortedTest, myArrays.myBubbleSort(unSortedTest));
    }

    @Test
    @DisplayName("Base condition test")
    void recursionBase() {
        assertEquals(1, myArrays.recursion(1));
    }

    @Test
    @DisplayName("input less than 1")
    void recursionFail() {
        assertEquals(1, myArrays.recursion(-1));
    }

    @Test
    @DisplayName("Test 9 factorial")
    void recursionFactorial() {
        assertEquals(362880, myArrays.recursion(9));
    }


    @Test
    @DisplayName("Checking if arraylist are the same")
    void arrayListSort() {
        assertArrayEquals(iSortedTest.toArray(), myArrays.arrayListSort(iUnSortedTest).toArray());
    }

    @Test
    void myHashmaps() {
        HashMap<Integer,String> hash = new HashMap<Integer, String>();
        hash.put(1,"John");
        hash.put(2,"Rick");
        assertEquals(hash, myArrays.myHashmaps(hash));
    }
    @Test
    void myHashmapsKey() {
        HashMap<Integer,String> hash = new HashMap<Integer, String>();
        hash.put(1,"John");
        hash.put(2,"Rick");
        assertEquals(hash.get(2), myArrays.myHashmaps(hash).get(2));
    }
}