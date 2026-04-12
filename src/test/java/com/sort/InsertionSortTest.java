package com.sort;

import java.util.Random;

import static com.sort.InsertionSort.insertionSort;

import static java.lang.System.currentTimeMillis;

public class InsertionSortTest {
    public static void main(String[] args)
        {
        int[] InsertionSortArr = new int[30];
        Random random = new Random();
        for (int i = 0; i < InsertionSortArr.length; i++) {
            InsertionSortArr[i] = random.nextInt(100);

        }
        for (int k : InsertionSortArr) {
            System.out.print(k + " ");
        }
        System.out.println();

        long start = currentTimeMillis();
        insertionSort();
        long end = currentTimeMillis();
        System.out.println(end - start);

        for (int j : InsertionSortArr) {
            System.out.print(j + " ");
        }
        }
}
