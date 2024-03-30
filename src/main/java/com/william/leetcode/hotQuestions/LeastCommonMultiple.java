package com.william.leetcode.hotQuestions;

/**
 * 最小公倍数：
 *  两数相乘再除以其最大公约数
 */
public class LeastCommonMultiple {

    public static void main(String[] args) {
        System.out.println(solution(7,6));
        System.out.println(solution(5,6));
        System.out.println(solution(3,6));
        System.out.println(solution(12,6));
        System.out.println(solution(8,6));
        System.out.println(solution(28,7));
    }

    public static Integer solution(Integer a, Integer b){
        return a * b / gcd(a, b);
    }


    public static Integer gcd(Integer a, Integer b){

        if(a % b == 0){
            return b;
        }else{
            return gcd(b, a % b);
        }

    }
}
