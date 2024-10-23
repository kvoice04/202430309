import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        // 배열 선언 및 초기화
        int[] arr = {5, 10, 15, 20, 25, 30};
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 값 입력 받기
        System.out.print("배열에서 찾고 싶은 값을 입력하세요: ");
        int searchValue = scanner.nextInt();

        // 배열에서 해당 값의 인덱스 찾기
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchValue) {
                System.out.println("값의 위치(인덱스): " + i);
                found = true;
                break;
            }
        }

        // 값이 배열에 없을 경우
        if (!found) {
            System.out.println("값을 찾을 수 없습니다.");
        }
    }
}