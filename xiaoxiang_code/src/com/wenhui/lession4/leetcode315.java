package com.wenhui.lession4;

import java.util.*;

/**
 * @ClassName leetcode315
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/02/12/23:35
 */
public class leetcode315 {
    public List<Integer> countSmaller(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] count = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        merge_sort(map, nums, count);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < count.length; i++) {
            list.add(count[i]);
        }
        return list;
    }
    public static void merge_sort_two_array(Map<Integer, Integer> map, int[] array1, int[] array2, int[] array3, int[] count) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] <= array2[j]) {
                count[map.get(array1[i])] += j;
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
            count[map.get(array1[i])] += j;
            array3[k] = array1[i];
            k++;
        }
        for (; j < array2.length; j++) {
            array3[k] = array2[j];
            k++;
        }

    }

    public static void merge_sort(Map<Integer, Integer> map, int[] array, int[] count) {
        if (array.length < 2) {
            return;
        }
        int mid = array.length / 2;
        int[] left_array = Arrays.copyOfRange(array, 0, mid);
        int[] right_array = Arrays.copyOfRange(array, mid, array.length);
        merge_sort(map, left_array, count);
        merge_sort(map, right_array, count);
        merge_sort_two_array(map,left_array,right_array,array,count);
    }
}
