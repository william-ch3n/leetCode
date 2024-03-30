package com.william.leetcode;

public class Main {

    public static void main(String[] args) {

        int ans = 0;
        int sum = 0;
        // (1+100)*100/2 = 5050，说明最后的边界是100
        // 当i到100的时候，最后一辆车装不满5000，所以直接ans+1结束循环
        int boundary = 100;

        for(int i = 777; i >=1; i--){
            sum += i;

            if(sum >= 5000){
                ans++;
                sum = 0;
                i++;
                // 装完一车之后每次确认此时i的下标位置，小于100则直接ans+1然后结束
                if(i < boundary){
                    ans += 1;
                    break;
                }
            }
        }

        // 结果为64（我们之前算出来63）
        System.out.println(ans);

    }

}