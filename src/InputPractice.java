import java.util.Scanner;

public class InputPractice {
    public static void main(String[] args) {
        // 객체를 사용
        Scanner scanner = new Scanner(System.in);

        // 두 수 입력
        System.out.print("첫 번째 숫자 : ");
        double num1 = scanner.nextDouble();

        System.out.print("두 번째 숫자 : ");
        double num2 = scanner.nextDouble();

        // 계산 결과
//        double sum = num1 + num2;
//        double difference = num1 - num2;
//        double product = num1 * num2;
//        double quotient = num1 / num2;
//
//      // 결과 출력
//        System.out.println("합: " + sum);
//        System.out.println("차: " + difference);
        //System.out.println("곱: " + product);
        //System.out.println("나눗셈: " + quotient);//

        System.out.print("+, -, *, /, ");


        // 종료
        scanner.close();
    }
}