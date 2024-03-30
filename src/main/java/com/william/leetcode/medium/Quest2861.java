package com.william.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Quest2861 {

    public static void main(String[] args) {

    }

    public int maxNumberOfAlloys(int n, int k, int budget, List<List<Integer>> composition, List<Integer> stock, List<Integer> cost) {


        for(int i = 0; i < k; i++){
            int mCost = 0;
            int mSave = 0;
            List<Integer>costSave = new ArrayList<>();
            for(int j = 0; j < n; j++){
                mCost += composition.get(i).get(j) * cost.get(j);
                mSave += composition.get(i).get(j) * cost.get(j) * stock.get(j);
            }
            costSave.add(mCost);
            costSave.add(mSave);
//            machineCostSaveMap.put(i, costSave);
        }

        return 0;
    }

}
