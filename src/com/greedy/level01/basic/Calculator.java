package com.greedy.level01.basic;

public class Calculator
{
    public static void checkMethod(){
        System.out.println("메소드 호출 확인");
    }
    public static int sum1to10(){
        int num = 0;
        for(int i=1;i<11;i++){
            //System.out.println("Log : "+num+"+"+i);
            num += i;
        }
        return num;
    }
    public static void checkMaxNumber(int a, int b){
        System.out.println("두 수 중 큰 수는 " +Math.max(a,b)+"이다.");
    }
    public static int sumTowNumer(int a, int b){
        return a+b;
    }
    public static int minusTwoNumber(int a, int b){
        return a-b;
    }
}
