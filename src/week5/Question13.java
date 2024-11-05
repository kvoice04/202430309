package week5;

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password = "";

        do {
            System.out.println("암호를 입력해주세요: ");
            password = sc.nextLine();
            System.out.println(password);
        } while(!password.equals("1234"));

        System.out.println("성공");
    }
}