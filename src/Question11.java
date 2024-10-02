import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력해주세요: ");
        int first = sc.nextInt();
        System.out.print("두 번째 숫자를 입력해주세요: ");
        int second = sc.nextInt();
        System.out.print("세 번째 숫자를 입력해주세요: ");
        int third = sc.nextInt();

        int max;

        if (first > second) {
            max = (first > third) ? first : third;
        } else {
            max = (second > third) ? second : third;
        }

        System.out.println("가장 큰 수는: " + max);
    }
}

