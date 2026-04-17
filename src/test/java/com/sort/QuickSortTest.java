package com.sort;

import static com.sort.QuickSort.quickSort;


public class QuickSortTest {
    public static void main(String[] args)
        {
        //创建数组
        int[] quickSortArr = SortTestUtils.createRandomArray(30,100);
        //打印排序前数组
        SortTestUtils.printArray(quickSortArr);
        //对数组进行排序
        SortTestUtils.testSort(quickSortArr,(ints)->quickSort(ints,0,ints.length-1));
        //打印排序后的数组
        SortTestUtils.printArray(quickSortArr);
        }
}
