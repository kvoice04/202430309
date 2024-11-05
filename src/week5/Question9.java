package week5;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요: ");

        int age = 0;
        do{
            System.out.println("0 이상의 나이를 입력해주세요");
            age = sc.nextInt();
        } while ( age < 0 );

        System.out.println("입력 받은 나이는 " + age + "입니다.");
    }
}