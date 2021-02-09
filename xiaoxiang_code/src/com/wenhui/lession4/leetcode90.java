package com.wenhui.lession4;

import java.util.*;

/**
 * @ClassName leetcode90
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/02/07/22:36
 */
public class leetcode90 {
    public static List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> listList = new ArrayList<>();
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        set.add(list);
        listList.add(list);
        subsetsHelper(0, nums, list, listList,set);
        return listList;
    }

    private static void subsetsHelper(int i, int[] nums, List<Integer> list, List<List<Integer>> listList, Set<List<Integer>> set) {
        if (i >= nums.length) {
            return;
        }
        list.add(nums[i]);
        if (!set.contains(new ArrayList<>(list))) {
            listList.add(new ArrayList<>(list));
            set.add(new ArrayList<>(list));//
        }
        subsetsHelper(i + 1, nums, list,listList, set);
        list.remove(list.size() - 1);
        subsetsHelper(i + 1, nums, list, listList,set);
    }
}
