package com.william.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 给定一种规律 pattern 和一个字符串 s ，判断 s 是否遵循相同的规律。
 *
 * 这里的 遵循 指完全匹配，例如， pattern 里的每个字母和字符串 s 中的每个非空单词之间存在着双向连接的对应规律。
 *
 *
 *
 * 示例1:
 *
 * 输入: pattern = "abba", s = "dog cat cat dog"
 * 输出: true
 * 示例 2:
 *
 * 输入:pattern = "abba", s = "dog cat cat fish"
 * 输出: false
 * 示例 3:
 *
 * 输入: pattern = "aaaa", s = "dog cat cat dog"
 * 输出: false
 *
 *
 * 提示:
 *
 * 1 <= pattern.length <= 300
 * pattern 只包含小写英文字母
 * 1 <= s.length <= 3000
 * s 只包含小写英文字母和 ' '
 * s 不包含 任何前导或尾随对空格
 * s 中每个单词都被 单个空格 分隔
 */

/**
 * 官方解题思路：
 *  因为要保证pattern <-> word 是一一对应的关系，所以如果只有一张hashMap的话，只能保证 pattern -> word 的对应关系（除非像自己写的逻辑一样每次都扫描一下map查看value是否有重复）
 *  所以用两个hashMap互相检验就能保证pattern <-> word是一一对应的关系了
 */
public class Quest290 {

    public static void main(String[] args) {
        Quest290 q = new Quest290();

        String pattern = "abba", s = "dog cat cat dog";
        System.out.println(q.wordPattern(pattern, s));

        String pattern1 = "abba", s1 = "dog cat cat fish";
        System.out.println(q.wordPattern(pattern1, s1));

        String pattern2 = "aaaa", s2 = "dog cat cat dog";
        System.out.println(q.wordPattern(pattern2, s2));

        String pattern3 = "abba", s3 = "dog dog dog dog";
        System.out.println(q.wordPattern(pattern3, s3));
    }

    public boolean wordPattern(String pattern, String s) {
        boolean result = true;

        String [] words = s.split(" ");

        if(pattern.length() != words.length){
            return false;
        }

        Map<String,String> map = new HashMap<>();
        for(int i = 0; i < pattern.length(); i++){

            String p = String.valueOf(pattern.charAt(i));

            if(null == map.get(p)){
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String value = entry.getValue();
                    if(value.equals(words[i])){
                        return false;
                    }
                }
                map.put(p, words[i]);
            }else{
                if(!map.get(p).equals(words[i])){
                    return false;
                }
            }
        }

        return result;
    }

}
