package week5;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요: ");
        int n  = sc.nextInt();
        int sum = 0;

        for (int i=1; i<=n; i++) {
            sum += i;
            if(i>=100){
                break;
            }
        }

        System.out.println("100 이하까지의 합은 " + sum);
    }
}
