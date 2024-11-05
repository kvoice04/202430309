package week6;

public class Question3 {
    public static void main(String[] args) {
        // 배열 선언 및 초기화
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        // 배열의 합 계산
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // 배열의 합 출력
        System.out.println("배열 요소의 합: " + sum);
    }
}