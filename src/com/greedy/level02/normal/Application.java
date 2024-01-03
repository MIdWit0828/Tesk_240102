package com.greedy.level02.normal;
import com.greedy.level02.normal.RandomMaker;
public class Application
{
    //첫 번째 인자의 최소값 부터 두 번쨰 인자까지 범위의 난수를 출력 (randomNumber 호출)
    //인자로 전달한 정수 길이의 랜덤한 문자열을 출력함 (randomUpperAlphabet 호출)
    //가위, 바위, 보 중 한 가지를 출력함 (rockPaperScissors 호출)
    //앞면, 뒷면 중 한 가지를 출력함 (tossCoin 호출)
    public static void main(String[] args)
    {
        RandomMaker rdm = new RandomMaker();
        System.out.println(rdm.randomNumber(1,10));
        System.out.println(rdm.radomUpperAlphabet(5));
        System.out.println(rdm.rockPaperScissors());
        rdm.coinToss();
    }

}
