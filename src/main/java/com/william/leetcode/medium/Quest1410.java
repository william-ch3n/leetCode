package com.william.leetcode.medium;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Link:
 *  <a href="https://leetcode.cn/problems/html-entity-parser/description/">Q1410</a>
 */
public class Quest1410 {

    public static void main(String[] args) {
        String text1 = "&amp; is an HTML entity but &ambassador; is not.";
        String text2 = "and I quote: &quot;...&quot;";
        String text3 = "Stay home! Practice on Leetcode :)";
        String text4 = "x &gt; y &amp;&amp; x &lt; y is always false";
        String text5 = "leetcode.com&frasl;problemset&frasl;all";
        String text6 = "&amp;gt;";

        System.out.println(entityParser(text1));
        System.out.println(entityParser(text2));
        System.out.println(entityParser(text3));
        System.out.println(entityParser(text4));
        System.out.println(entityParser(text5));
        System.out.println(entityParser(text6));

    }

    /**
     *  反思：
     *      功能可以，但是空间和时间效率不行。
     *  目标：
     *      循环text一次即完成特殊字符的替换
     *  怎么做：
     *      循环字符串，找到&的时候，开始遍历htmlSpecialWords，按照特殊字符长度获取text长度，进行匹配
     *      如果匹配成功，换成特殊字符然后下标前移相应位数
     *      如果不匹配，则直接将下标对应的字符输出
     */
    public static String entityParser(String text) {
        Map<String, String> htmlSpecialWords = new LinkedHashMap<>();

        htmlSpecialWords.put("&quot;", "\"");
        htmlSpecialWords.put("&apos;", "'");
        htmlSpecialWords.put("&gt;", ">");
        htmlSpecialWords.put("&lt;", "<");
        htmlSpecialWords.put("&frasl;", "/");
        htmlSpecialWords.put("&amp;", "&");


        for (Map.Entry<String, String> entry : htmlSpecialWords.entrySet()) {
            text = text.replaceAll(entry.getKey(), entry.getValue());
        }

        return text;

    }

}
