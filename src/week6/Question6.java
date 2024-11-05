package week6;

public class Question6 {
    public static void main(String[] args) {
        // 배열 선언 및 초기화
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // 짝수만 출력
        System.out.println("배열에서 짝수만 출력:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}