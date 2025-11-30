package com.william.leetcode.easy;

import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。
 *
 * 请注意，你可以假定字符串里不包括任何不可打印的字符。
 *
 * 示例:
 *
 * 输入: "Hello, my name is John"
 * 输出: 5
 * 解释: 这里的单词是指连续的不是空格的字符，所以 "Hello," 算作 1 个单词。
 */
public class Quest434 {

    public static void main(String[] args) {
        Quest434 quest434 = new Quest434();
        String s1 = "Hello, my name is John";
        System.out.println(quest434.countSegments(s1));
        String s2 = "Hello,mynameisJohn";
        System.out.println(quest434.countSegments(s2));
        String s3 = "";
        System.out.println(quest434.countSegments(s3));
        String s4 = null;
        System.out.println(quest434.countSegments(s4));
        String s5 = ", , , ,        a, eaefa"; // 6
        System.out.println(quest434.countSegments(s5));
    }

    public int countSegments(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        List<String> list = Arrays.asList(s.split(" "));
        list = list.stream().filter(str -> str.length() != 0).collect(Collectors.toList());

        return list.size();
    }

    /**
     * 官方解答：
     *  主要是要寻找出规律。面对用例s5，怎么才能判断一个词是否为一个词是解题关键。
     *  如果上一个字符不为空格，而下一个字符为空格，则判断该片段为一个词
     */
//    public int countSegments(String s) {
//        int segmentCount = 0;
//
//        for (int i = 0; i < s.length(); i++) {
//            if ((i == 0 || s.charAt(i - 1) == ' ') && s.charAt(i) != ' ') {
//                segmentCount++;
//            }
//        }
//
//        return segmentCount;
//    }


}
