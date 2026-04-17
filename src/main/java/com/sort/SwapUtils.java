package com.sort;

public class SwapUtils {
    public static void swap(int[] arr, int i, int j)
        {
        //防止数组为空或者下标越界
        if (arr == null || i < 0 || j < 0 || i >= arr.length || j >= arr.length) {
            throw new IllegalArgumentException("数组为空或下标越界");
        }
        //交换数组元素
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        }
}
