package com.william.leetcode.hotQuestions;

import java.util.ArrayList;
import java.util.List;

/**
 * 斐波那契数：
 *  递归相加
 *  fib(n) = fib(n - 1) + fib(n - 2) -> 然后找到最初两个数值，层层返回即可
 */
public class FibonacciNumber {

    public static void main(String[] args) {
//        System.out.println(fib(0));
//        System.out.println(fib(1));
//        System.out.println(fib(2));
//        System.out.println(fib(3));
//        System.out.println(fib(4));

        List<String> rows = new ArrayList<>();
        rows.add("abcdefg");

        System.out.println("" + rows.get(0).charAt(1) + rows.get(0).charAt(2));
    }

    public static Integer fib(Integer n){

        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }else{
            return fib(n - 1) + fib(n - 2);
        }

    }

}
