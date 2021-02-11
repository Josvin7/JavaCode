package com.wenhui.lession4;

import java.util.Arrays;

/**
 * @ClassName Test
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/02/11/18:14
 */
public class Test {
    public static void merge_sort_two_array(int[] array1, int[] array2, int[] array3) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] <= array2[j]) {
                array3[k] = array1[i];
                i++;
                k++;
            } else {
                array3[k] = array2[j];
                j++;
                k++;
            }
        }
        for (; i < array1.length; i++) {
            array3[k] = array1[i];
            k++;
        }
        for (; j < array2.length; j++) {
            array3[k] = array2[j];
            k++;
        }

    }

    public static void merge_sort(int[] array) {
        if (array.length < 2) {
            return;
        }
        int mid = array.length / 2;
        int[] left_array = Arrays.copyOfRange(array, 0, mid);
        int[] right_array = Arrays.copyOfRange(array, mid, array.length);
        merge_sort(left_array);
        merge_sort(right_array);
        merge_sort_two_array(left_array,right_array,array);
    }

    public static void main(String[] args) {
        int[] ayyay1 = {1, 2, 4, 5, 6};
        int[] array2 = {2, 23, 45, 6, 2, 6, 7, 12, 3, 4, 5, 6};
        int[] array3 = new int[array2.length + ayyay1.length];
        //merge_sort_two_array(ayyay1, array2, array3);
        merge_sort(array2);
        System.out.println(Arrays.toString(array2));

    }

}
