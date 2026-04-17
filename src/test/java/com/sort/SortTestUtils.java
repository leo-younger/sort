package com.sort;

import java.util.Random;
import java.util.function.Consumer;

import static java.lang.System.currentTimeMillis;

public class SortTestUtils {
    public static int[] createRandomArray(int length,int bound){
    int[] testArr = new int[length];
    Random random = new Random();
    for (int i = 0; i < testArr.length; i++) {
        testArr[i] = random.nextInt(bound);

    }
    return testArr;
    }

    public static void printArray(int[] arr){
    for (int i : arr) {
        System.out.print(i+" ");

    }
    System.out.println();
    }
    public static void testSort(int[] arr, Consumer<int[]> consumer){
    long start = currentTimeMillis();
    consumer.accept(arr);
    long end = currentTimeMillis();
    System.out.println("耗时："+(end - start)+"ms");
    }
}
