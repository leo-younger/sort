package com.sort;

import java.util.Random;

import static com.sort.BubbleSort.bubbleSort;
import static java.lang.System.currentTimeMillis;

public class BubbleSortTest {
    public static void main(String[] args)
        {
            //创建随机数组
        int[] bubbleSortArr = new int[30];
        Random random = new Random();
        for (int i = 0; i < bubbleSortArr.length; i++) {
            bubbleSortArr[i] = random.nextInt(100);

        }
        //打印排序前数组
        for (int k : bubbleSortArr) {
            System.out.print(k + " ");
        }
        System.out.println();

        //调用函数并输出运行时间
        long start = currentTimeMillis();
        bubbleSort(bubbleSortArr);
        long end = currentTimeMillis();
        System.out.println(end - start);

        //打印排序后的数组
        for (int j : bubbleSortArr) {
            System.out.print(j + " ");
        }
        }
}
