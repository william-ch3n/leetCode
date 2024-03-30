package com.william.leetcode;


import java.util.*;

public class Test2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int [][] works = new int[n][2];
        List<Integer>possibleMaxList = new ArrayList<>();

        for(int i = 0; i < n; i++){
            works[i] = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int maxDays;

        for(int i = 0; i < n-1; i++){
            int startDay = works[i][0];
            int endDay = works[i][1];
            for(int j = i + 1; j < n; j++){
                if(works[j][0] <= endDay + 1 && endDay <= works[j][1]){
                    endDay = works[j][1];
                }
            }
            maxDays = endDay - startDay + 1;
            possibleMaxList.add(maxDays);
        }


        Collections.sort(possibleMaxList);
        maxDays = possibleMaxList.get(possibleMaxList.size() - 1);

        System.out.println(maxDays);
    }

}
