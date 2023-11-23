package com.william.leetcode.medium;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

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
