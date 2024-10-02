import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몸무게를 입력해주세요 (kg): ");
        double weight = sc.nextDouble();
        System.out.print("키를 입력해주세요 (cm): ");
        double height = sc.nextDouble() / 100;  // cm를 m로 변환

        double bmi = weight / (height * height);

        if (bmi < 18.5) {
            System.out.println("저체중");
        } else if (bmi < 24.9) {
            System.out.println("정상");
        } else if (bmi < 29.9) {
            System.out.println("과체중");
        } else {
            System.out.println("비만");
        }
    }
}
