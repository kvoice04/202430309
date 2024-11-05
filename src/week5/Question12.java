package week5;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요: ");
        int n = sc.nextInt();
        int i = 2;
        boolean isPrime = true;

        System.out.println(isPrime);

        if(n < 2){
            isPrime = false;
        }else{
            while( i < (n/2) ){
                System.out.println( i );
                if(n % i == 0){
                    isPrime = false;
                    break;
                }
                i++;
            }
        }
        System.out.println( "결과 : " + i + ", 소수 여부 : " + isPrime );
    }
}