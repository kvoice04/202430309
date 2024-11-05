package week6;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        // 배열 선언 및 초기화
        int[] arr = {2, 4, 6, 8, 10};
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 값 입력 받기
        System.out.print("배열에서 찾고 싶은 값을 입력하세요: ");
        int searchValue = scanner.nextInt();

        // 배열에서 해당 값 찾기
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchValue) {
                found = true;
                break;
            }
        }

        // 결과 출력
        if (found) {
            System.out.println("존재합니다.");
        } else {
            System.out.println("존재하지 않습니다.");
        }
    }
}