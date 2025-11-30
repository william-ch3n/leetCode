package com.william.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * 414. 第三大的数
 *
 *给你一个非空数组，返回此数组中 第三大的数 。如果不存在，则返回数组中最大的数。
 *
 * 示例 1：
 *
 * 输入：[3, 2, 1]
 * 输出：1
 * 解释：第三大的数是 1 。
 * 示例 2：
 *
 * 输入：[1, 2]
 * 输出：2
 * 解释：第三大的数不存在, 所以返回最大的数 2 。
 * 示例 3：
 *
 * 输入：[2, 2, 3, 1]
 * 输出：1
 * 解释：注意，要求返回第三大的数，是指在所有不同数字中排第三大的数。
 * 此例中存在两个值为 2 的数，它们都排第二。在所有不同数字中排第三大的数为 1 。
 *
 *
 * 提示：
 *
 * 1 <= nums.length <= 104
 * -231 <= nums[i] <= 231 - 1
 *
 *
 * 进阶：你能设计一个时间复杂度 O(n) 的解决方案吗？
 */
public class Quest414 {

    public static void main(String[] args) {
        Quest414 q = new Quest414();
        int [] nums1 = {1,2,3,4,5,6,7,8,9};
        int [] nums2 = {1,2};
        int [] nums3 = {1};
        int [] nums4 = {2,2,3,1};
        int [] nums5 = {3,3,3,1,5,6,0};
        int [] nums6 = {6,3,6,1,5,6,0};
        int [] nums7 = {1,2,-2147483648};
        int [] nums8 = {1,2,2,5,3,5};
        System.out.println(q.thirdMax(nums1));
        System.out.println(q.thirdMax(nums2));
        System.out.println(q.thirdMax(nums3));
        System.out.println(q.thirdMax(nums4));
        System.out.println(q.thirdMax(nums5));
        System.out.println(q.thirdMax(nums6));
        System.out.println(q.thirdMax(nums7));
        System.out.println(q.thirdMax(nums8));
    }

    public int thirdMax(int[] nums) {
        long a = Long.MIN_VALUE;
        long b = Long.MIN_VALUE;
        long c = Long.MIN_VALUE;

        for(int num : nums){
                if(num > a){
                    long tmp_a = a;
                    long tmp_b = b;
                    a = num;
                    b = tmp_a;
                    c = tmp_b;
                }else if(num > b && num != a){
                    long tmp_b = b;
                    b = num;
                    c = tmp_b;
                }else if(num > c && num != a && num != b){
                    c = num;
                }
        }


        System.out.println("check a: "+a+", b: "+b+", c: "+c);

        return (int) (Long.MIN_VALUE == c ? a : c);
    }

}
