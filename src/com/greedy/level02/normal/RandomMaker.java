package com.greedy.level02.normal;
import java.util.Random;
public class RandomMaker
{
    Random rd = new Random();
    public int randomNumber(int min, int max){
        //최소값부터 최대값까지 범위의 난수를 반환한다
        return rd.nextInt(min,max+1);
    }
    public String radomUpperAlphabet(int length){
        //인자의 길이 만큼의 랜덤한 대문자 알파벳으로 이루어진 문자열을 반환함
        String str ="";
        for(int i = length; i > 0; i--){
            char ch = (char)rd.nextInt(65,80);
            //System.out.println(ch);
            str += ch;
        }
        return str;
    }
    public String rockPaperScissors(){
        //가위, 바위, 보 중 한가지를 반환함
        int i = rd.nextInt(3);
        String returnStr =null;
        switch (i)
        {
            case 0:
                returnStr = "가위";
                break;
            case 1:
                returnStr = "바위";
                break;
            case 2:
                returnStr ="보";
                break;
            default:
                System.out.println("스위치 오류");
                break;
        }
        return returnStr;
    }
    public void coinToss(){
        //동전의 앞면 뒷면 중 한 가지를 반환함
        int num = rd.nextInt(2);
        System.out.println(num==1 ? "앞면" : "뒷면" );
    }
}
