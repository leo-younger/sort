package com.sort;

import static com.sort.BubbleSort.bubbleSort;


public class BubbleSortTest {
    public static void main(String[] args)
        {
            //创建数组
            int[] bubbleSortArr = SortTestUtils.createRandomArray(30,100);
            //打印排序前数组
            SortTestUtils.printArray(bubbleSortArr);
            //对数组进行排序
            SortTestUtils.testSort(bubbleSortArr, (ints)-> bubbleSort(ints));
            //打印排序后的数组
            SortTestUtils.printArray(bubbleSortArr);
        }
}
