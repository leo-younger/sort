package com.sort;

import java.util.Random;

import static java.lang.System.currentTimeMillis;

public class SelectSortTest {
    public static void main(String[] args)
        {
        int[] selectSortArr = new int[30];
        Random random = new Random();
        for (int i = 0; i < selectSortArr.length; i++) {
            selectSortArr[i] = random.nextInt(100);

        }
        for (int k : selectSortArr) {
            System.out.print(k + " ");
        }
        System.out.println();

        long start = currentTimeMillis();
        SelectSort.selectSort(selectSortArr);
        long end = currentTimeMillis();
        System.out.println(end - start);

        for (int j : selectSortArr) {
            System.out.print(j + " ");
        }
        }
}
