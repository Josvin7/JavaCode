package com.wenhui.lession4;

import java.util.*;

/**
 * @ClassName leetcode40
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/02/08/23:28
 */
public class leetcode40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> listList = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(candidates);
        int sum = 0;
        combinationSum2Helper(0, target, candidates, sum,list, listList, set);
        return listList;
    }

    private void combinationSum2Helper(int i, int target, int[] candidates, int sum, List<Integer> list, List<List<Integer>> listList, Set<List<Integer>> set) {
        if (i >= candidates.length || sum > target) {
            return;
        }
        list.add(candidates[i]);
        sum += candidates[i];
        if (!set.contains(list) && sum == target) {
            set.add(new ArrayList<>(list));
            listList.add(new ArrayList<>(list));
        }
        combinationSum2Helper(i + 1, target, candidates, sum, list, listList, set);
        list.remove(list.size()-1);
        sum -= candidates[i];
        combinationSum2Helper(i + 1, target, candidates, sum, list, listList, set);
    }
}
