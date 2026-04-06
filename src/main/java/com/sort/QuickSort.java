package com.sort;

import javax.swing.plaf.basic.BasicSeparatorUI;
import java.util.Random;

import static com.sort.SwapUtils.swap;
import static java.lang.System.currentTimeMillis;

public class QuickSort {
    //快速排序
    /*首先选基准元素，然后先end找找到比基准元素小的数停止，然后从start找找到比基准元素大的数停止，
    然后交换两个元素，然后重复这个过程，直到start和end相遇，
    交换start和基准元素，然后递归左边和右边*/



    //1.依次取数组第一个元素，设为基准元素
    //2.设置两个指针，一个指向数组的开始位置，一个指向数组的结束位置
    public static void quickSort(int[] arr, int i, int j)
        {
        if (i >= j) {
            return;
        }
        int start = i;
        int end = j;
        int baseNumber = arr[i];


        while (start != end) {
            //3.先从右指针开始，比较他和基准元素，直到找到一个比基准元素小的元素，停止比较
            while (true) {
                if (end <= start || arr[end] < baseNumber) {
                    break;
                }
                end--;
            }

            //4.再从左指针开始，比较他和基准元素，直到找到一个比基准元素大的元素，停止比较
            while (true) {
                if (start >= end || arr[start] > baseNumber) {
                    break;
                }
                start++;
            }
            if (start < end) {
                swap(arr,start,end);
            }
        }
        //5.交换两个元素

            swap(arr,start,i);

        //6.递归左右两边
        quickSort(arr, i, start - 1);
        quickSort(arr, start + 1, j);
        }

}
