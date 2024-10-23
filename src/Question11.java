import java.util.HashSet;
import java.util.Set;

public class Question11 {
    public static void main(String[] args) {
        // 배열 선언 및 초기화
        int[] arr = {1, 2, 2, 3, 4, 4, 5};

        // 중복된 값 제거를 위한 Set 사용
        Set<Integer> uniqueValues = new HashSet<>();

        // 배열에서 중복 제거
        for (int value : arr) {
            uniqueValues.add(value);
        }

        // 새로운 배열로 중복 제거된 값 출력
        System.out.println("중복 제거된 배열:");
        for (int value : uniqueValues) {
            System.out.println(value);
        }
    }
}