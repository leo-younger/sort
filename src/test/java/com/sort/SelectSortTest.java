package com.sort;


import static com.sort.SelectSort.selectSort;


public class SelectSortTest {
    public static void main(String[] args)
        {
        //创建数组
        int[] selectSortArr = SortTestUtils.createRandomArray(30,100);
        //打印排序前数组
        SortTestUtils.printArray(selectSortArr);
        //对数组进行排序
        SortTestUtils.testSort(selectSortArr, (ints)-> selectSort(ints));
        //打印排序后的数组
        SortTestUtils.printArray(selectSortArr);
        }
}
