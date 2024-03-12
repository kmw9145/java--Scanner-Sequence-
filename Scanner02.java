import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 정수 입력
        System.out.print("정수 타입 숫자를 입력하세요 : ");
        int a = scanner.nextInt();

        // 실수 입력
        System.out.print("실수 타입 숫자를 입력하세요 : ");
        double b = scanner.nextDouble();

        // 덧셈
        double sum = a + b;
        System.out.println("더하기: " + sum);

        // 뺄셈
        double difference = a - b;
        System.out.println("빼기: " + difference);

        // 곱셈
        double product = a * b;
        System.out.println("곱하기: " + product);

        // 나눗셈
        if (b != 0) {
            double quotient = a / b;
            System.out.println("나누기: " + quotient);
        } else {
            System.out.println("0으로 나눌 수 없습니다.");
        }

        scanner.close();
    }
}
