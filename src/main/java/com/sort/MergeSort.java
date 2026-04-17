package com.sort;

public class MergeSort {
    /*归并排序
    核心思想：1、把数组从中间分成两半，递归分直到每个小数组只有一个数
    2、递归归的时候合并两个数组，合并数组是设置左右数组指针，小的先进数组
     */

    public static void mergeSort(int[] arr)
        {
        if (arr == null || arr.length < 2) {
            return;
        }
        int[] temp = new int[arr.length];

        sort(arr, 0, arr.length - 1, temp);


        }

    private static void sort(int[] arr, int pre, int last, int[] temp)
        {
        if (pre >= last) {
            return;
        }
        //mid指向头数组的末尾值，mid+1为尾数组的初始值
        int mid = (pre + last) / 2;

        sort(arr, pre, mid, temp);
        sort(arr, mid + 1, last, temp);
        merge(arr, pre, mid, last, temp);
        }

    private static void merge(int[] arr, int pre, int mid, int last, int[] temp)
        {
        int i = pre;
        int j = mid + 1;
        int t = pre;

        while (i <= mid && j <= last) {
            if (arr[i] >= arr[j]) {
                temp[t++] = arr[j++];
            } else {
                temp[t++] = arr[i++];
            }
        }
        while (i <= mid) {
            temp[t++] = arr[i++];
        }
        while (j <= last) {
            temp[t++] = arr[j++];
        }
        System.arraycopy(temp, pre, arr, pre, last - pre + 1);

        }

}
