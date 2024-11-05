import java.util.Scanner;

public class Calculator {

    // 덧셈 메소드
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    // 뺄셈 메소드
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // 곱셈 메소드
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // 나눗셈 메소드
    public double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return num1 / num2;
    }

    // 제곱 메소드
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // 제곱근 메소드
    public double squareRoot(double num) {
        if (num < 0) {
            throw new ArithmeticException("Cannot calculate the square root of a negative number.");
        }
        return Math.sqrt(num);
    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);


        System.out.println("연산자 선택: +, -, *, %, ^, √");
        String operation = scanner.nextLine();

        double num1 = 0;
        double num2 = 0;
        double result = 0;

        try {

            if (operation.equals("√")) {
                System.out.print("숫자를 입력하세요: ");
                num1 = scanner.nextDouble();
                result = calculator.squareRoot(num1);
            } else {
                System.out.print("첫번째 숫자 : ");
                num1 = scanner.nextDouble();
                System.out.print("두번째 숫자 : ");
                num2 = scanner.nextDouble();

                switch (operation) {
                    case "+":
                        result = calculator.add(num1, num2);
                        break;
                    case "-":
                        result = calculator.subtract(num1, num2);
                        break;
                    case "*":
                        result = calculator.multiply(num1, num2);
                        break;
                    case "%":
                        result = calculator.divide(num1, num2);
                        break;
                    case "power":
                        result = calculator.power(num1, num2);
                        break;
                    default:
                        System.out.println("계산이 불가능 합니다");
                        scanner.close();
                        return;
                }
            }

            System.out.println("결과 : " + result);

        } catch (Exception e) {
            System.out.println("에러 : " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
