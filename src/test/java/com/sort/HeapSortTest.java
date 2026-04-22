package com.sort;

import static com.sort.BubbleSort.bubbleSort;
import static com.sort.HeapSort.heapSort;

public class HeapSortTest {
    public static void main(String[] args)
        {
        //创建数组
        int[] heapSortArr = SortTestUtils.createRandomArray(30,100);
        //打印排序前数组
        SortTestUtils.printArray(heapSortArr);
        //对数组进行排序
        SortTestUtils.testSort(heapSortArr, ints-> heapSort(ints));
        //打印排序后的数组
        SortTestUtils.printArray(heapSortArr);
        }
}
