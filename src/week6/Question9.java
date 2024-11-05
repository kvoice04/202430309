package week6;

public class Question9 {
    public static void main(String[] args) {
        // 원본 배열 선언 및 초기화
        int[] original = {1, 2, 3, 4, 5};

        // 복사할 배열 선언
        int[] copy = new int[original.length];

        // 배열 복사
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }

        // 복사된 배열 출력
        System.out.println("복사된 배열:");
        for (int i = 0; i < copy.length; i++) {
            System.out.println(copy[i]);
        }
    }
}