package com.sort;

import static com.sort.SwapUtils.swap;

/**
 * @author Young
 */
public class BubbleSort {
    //冒泡排序(从小到大)
    /*用双层for循环，外层for循环次数(固定)：循环数组数减一次；
      内层循环次数(会变)：外层循环数开始依次减一；
      循环方法体：从第一个数开始，依次比较相邻两个数大小，大的往后排；
     */

    public static void bubbleSort(int[] arr)
        {
        int n = arr.length;
        //参数判断
        if (arr == null || n < 1) {
            return;
        }

        //外循环,循环次数：arr.length-1;
        for (int i = 0; i < n-1; i++) {
            //设置isSorted标记判断当前数组是否有序，判断外层循环是否有必要执行，降低除最坏情况的时间复杂度
            boolean isSorted = true;
            //内循环：外层循环数开始依次减一；
            for (int j = 0; j < n-i-1; j++) {
                //循环方法体：从第一个数开始，依次比较相邻两个数大小，大的往后排；
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    isSorted = false;
                }
            }
            if(isSorted){
                break;
            }
        }

        }
}
