package com.william.leetcode.easy;

import java.util.Arrays;

/**
 给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。

 请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。

 注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。为了应对这种情况，nums1 的初始长度为 m + n，其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。nums2 的长度为 n 。



 示例 1：

 输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 输出：[1,2,2,3,5,6]
 解释：需要合并 [1,2,3] 和 [2,5,6] 。
 合并结果是 [1,2,2,3,5,6] ，其中斜体加粗标注的为 nums1 中的元素。
 示例 2：

 输入：nums1 = [1], m = 1, nums2 = [], n = 0
 输出：[1]
 解释：需要合并 [1] 和 [] 。
 合并结果是 [1] 。
 示例 3：

 输入：nums1 = [0], m = 0, nums2 = [1], n = 1
 输出：[1]
 解释：需要合并的数组是 [] 和 [1] 。
 合并结果是 [1] 。
 注意，因为 m = 0 ，所以 nums1 中没有元素。nums1 中仅存的 0 仅仅是为了确保合并结果可以顺利存放到 nums1 中。


 提示：

 nums1.length == m + n
 nums2.length == n
 0 <= m, n <= 200
 1 <= m + n <= 200
 -109 <= nums1[i], nums2[j] <= 109


 进阶：你可以设计实现一个时间复杂度为 O(m + n) 的算法解决此问题吗？
 */

public class Quest88 {

    public static void main(String[] args) {
        Quest88 q88 = new Quest88();
        // case 1
        int [] nums1 = {1,2,3,0,0,0};
        int [] nums2 = {2,5,6};
        q88.merge2(nums1, 3, nums2, 3);
        System.out.println("Check nums2: "+ Arrays.toString(nums1));

        // case 2
//        int [] nums1 = {1};
//        int [] nums2 = {};
//        q88.merge1(nums1, 1, nums2, 0);
//        System.out.println("Check nums1: "+ Arrays.toString(nums1));

        // case 3
//        int [] nums1 = {0};
//        int [] nums2 = {1};
//        q88.merge1(nums1, 0, nums2, 1);
//        System.out.println("Check nums1: "+ Arrays.toString(nums1));
    }

    /**
     * 我的解法就是合并两个数组，然后冒泡排序
     */
    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        // 先把两个array合并了
        for(int i = 0; i < n; i++){
            nums1[nums1.length - (i + 1)] = nums2[i];
        }

        // 冒泡排序
        for(int i = 0; i < nums1.length - 1; i++){
            for(int j = i + 1; j < nums1.length; j++){
                if(nums1[i] > nums1[j]){
                    int tmp = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = tmp;
                }
            }
        }
    }

    /**
     * 官方解法：
     * 双指针，合并两个已经排序过的数组(关键点是已经排序过的两个数组，所以可以用该方法来合并数组)
     */
    public void merge2(int[] nums1, int m, int[] nums2, int n) {

        int [] res = new int [m+n];
        int l = 0;
        int r = 0;

        // 循环一次m+n，每次循环必定出一个结果
        // 一次循环后的必然结果是i+1, l/r + 1, res数组元素+1
        // l+r == m+n，所以不会超出下标
        for(int i = 0; i < m+n; i++){

            if(l == m){
                res[i] = nums2[r++];
                continue;
            }

            if(r == n){
                res[i] = nums1[l++];
                continue;
            }

            if(nums1[l] <= nums2[r]){
                res[i] = nums1[l++];
            }else{
                res[i] = nums2[r++];
            }

        }

        // 复制结果到nums1数组中
        for(int i = 0; i < res.length; i++){
            nums1[i] = res[i];
        }

    }
}
