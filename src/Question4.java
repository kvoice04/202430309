public class Question4 {
    public static void main(String[] args) {
        // 배열 선언 및 초기화
        int[] arr = {3, 7, 2, 9, 4};

        // 최대값을 첫 번째 요소로 초기화
        int max = arr[0];

        // 배열에서 최대값 찾기
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // 최대값 출력
        System.out.println("배열의 최대값: " + max);
    }
}