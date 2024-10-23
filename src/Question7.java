public class Question7 {
    public static void main(String[] args) {
        // 배열 선언 및 초기화
        int[] arr = {5, 10, 15, 20, 25};

        // 배열 역순 출력
        System.out.println("배열을 역순으로 출력:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}