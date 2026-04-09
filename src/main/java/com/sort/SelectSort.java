package com.sort;

/**
 * @author Young
 */
public class SelectSort {
    /**
     * 选择排序
     * 核心思想：每一轮从未排序的区间找最小值，排到当前区间首位；
     * 时间复杂度O(n²)，交换次数O(n)不稳定排序
     * 外循环：循环变量i，起始值为0，终止条件：<len-1;
     * 内循环：循环变量j，起始值为i+1，终止条件：<len;
     * minindex:用于记录找到的最小值,初始索引为i;
     */
    public static void selectSort(int[] arr)
        {
        //minindex:用于记录找到的最小值的索引
        int minindex;
        int len = arr.length;
        //外循环：循环变量i，起始值为0，终止条件：<len-1；
        for (int i = 0; i < len - 1; i++) {
            minindex = i;
            //内循环：循环变量j，起始值为i+1，终止条件：<len；
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < arr[minindex]) {
                    minindex = j;
                }
            }
            SwapUtils.swap(arr, i, minindex);
        }

        }
}
