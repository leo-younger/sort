package com.sort;

import static com.sort.MergeSort.mergeSort;

public class MergeSortTest {
    public static void main(String[] args)
        {
        //创建数组
        int[] mergeSortArr = SortTestUtils.createRandomArray(30,100);
        //打印排序前数组
        SortTestUtils.printArray(mergeSortArr);
        //对数组进行排序
        SortTestUtils.testSort(mergeSortArr,(ints)->mergeSort(ints));
        //打印排序后的数组
        SortTestUtils.printArray(mergeSortArr);
        }
}
