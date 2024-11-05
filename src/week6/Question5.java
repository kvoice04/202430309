package week6;

public class Question5 {
    public static void main(String[] args) {
        // 배열 선언 및 초기화
        int[] arr = {12, 3, 19, 7, 5};

        // 최소값을 첫 번째 요소로 초기화
        int min = arr[0];

        // 배열에서 최소값 찾기
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // 최소값 출력
        System.out.println("배열의 최소값: " + min);
    }
}