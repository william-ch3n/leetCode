package com.william.leetcode.hotQuestions;

/**
 * 最大公约数：
 *  辗转相除法
 */
public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(solution(7,6));
        System.out.println(solution(5,6));
        System.out.println(solution(3,6));
        System.out.println(solution(12,6));
        System.out.println(solution(8,6));
        System.out.println(solution(28,7));
    }

    public static Integer solution(Integer a, Integer b){


        if(a % b == 0){
            return b;
        }else{
            return solution(b, a % b);
        }

    }

}
