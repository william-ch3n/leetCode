package com.william.leetcode.easy;

import java.time.Instant;
import java.time.ZoneId;

/**
 * 441. 排列硬币
 *
 * 你总共有 n 枚硬币，并计划将它们按阶梯状排列。对于一个由 k 行组成的阶梯，其第 i 行必须正好有 i 枚硬币。阶梯的最后一行 可能 是不完整的。
 *
 * 给你一个数字 n ，计算并返回可形成 完整阶梯行 的总行数。
 *
 * 示例 1：
 *
 *
 * 输入：n = 5
 * 输出：2
 * 解释：因为第三行不完整，所以返回 2 。
 * 示例 2：
 *
 *
 * 输入：n = 8
 * 输出：3
 * 解释：因为第四行不完整，所以返回 3 。
 *
 *
 * 提示：
 *
 * 1 <= n <= 231 - 1
 */
public class Quest441 {

    public static void main(String[] args) {
        Quest441 quest441 = new Quest441();
        int n1 = 5;
//        System.out.println(quest441.arrangeCoins(n1));
        int n2 = 8;
//        System.out.println(quest441.arrangeCoins(n2));

        System.out.println(Instant.ofEpochSecond(1732864500).atZone(ZoneId.systemDefault()));
        System.out.println(Instant.ofEpochSecond(1079999).atZone(ZoneId.systemDefault()));

    }

    public int arrangeCoins(int n) {



        long x = 1;
        long max = Integer.MAX_VALUE;
        long min = 1;
        while(true){

            long sum1 = (1 + x) * x / 2;
            long sum2 = (1 + x + 1) * (x + 1) / 2;

            if(n >= sum1 && n < sum2){
                return (int)x;
            }

            if(n < sum1){
                max = Math.max(sum1, max);
                x = x + max/2;
            }else if(n >= sum2){
                min = Math.min(sum2, min);
                x = x - min/2;
            }

        }

    }


}
