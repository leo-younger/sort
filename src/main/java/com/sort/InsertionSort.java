package com.sort;

/**
 * @author Young
 */
public class InsertionSort {
    /**
     * 插入排序:将数组分为已排序和未排序两组，遍历未排序数组，每次取一个数，
     * 与已排序数组从尾开始比较，找到合适位置插入。
     */
    public static void insertionSort(int[] arr)
        {
        if (arr == null || arr.length <= 1) {
            return;
        }
        //遍历未排序数组（默认第一个数为已排序），取第一个数为要插入的数
        for (int i = 1; i < arr.length; i++) {

            int cur = arr[i];
            int j = i - 1;
            //循环判断找出要插入位置同时，将比它大的数往后移
            while (j >= 0 && cur < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = cur;


        }
        }


}
