public class Question10 {
    public static void main(String[] args) {
        // 배열 선언 및 초기화
        int[] arr = {20, 30, 50, 70, 90};
        int sum = 0;

        // 배열 요소들의 합 계산
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // 배열 요소들의 평균 계산 및 출력
        double average = (double) sum / arr.length;
        System.out.println("배열 요소들의 평균: " + average);
    }
}