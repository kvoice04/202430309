import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자: ");
        int first = sc.nextInt();
        System.out.print("두 번째 숫자: ");
        int second = sc.nextInt();
        System.out.print("연산자(+, -, *, /): ");
        String operation = sc.next();

        if (operation.equals("+")) {
            System.out.println(first + second);
        } else if (operation.equals("-")) {
            System.out.println(first - second);
        } else if (operation.equals("*")) {
            System.out.println(first * second);
        } else if (operation.equals("/")) {
            if (second != 0) {
                System.out.println(first / second);
            } else {
                System.out.println("0으로 나눌 수 없습니다.");
            }
        } else {
            System.out.println("올바른 연산자를 입력하세요.");
        }
        sc.close();
    }
}
