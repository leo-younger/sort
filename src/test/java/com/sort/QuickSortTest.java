package com.sort;

import java.util.Random;

import static com.sort.QuickSort.quickSort;
import static java.lang.System.currentTimeMillis;

public class QuickSortTest {
    public static void main(String[] args)
        {
        int[] quickSortArr = new int[30];
        Random random = new Random();
        for (int i = 0; i < quickSortArr.length; i++) {
            quickSortArr[i] = random.nextInt(100);

        }
        for (int k : quickSortArr) {
            System.out.print(k + " ");
        }
        System.out.println();

        long start = currentTimeMillis();
        quickSort(quickSortArr, 0, quickSortArr.length - 1);
        long end = currentTimeMillis();
        System.out.println(end - start);

        for (int j : quickSortArr) {
            System.out.print(j + " ");
        }


        }
}
