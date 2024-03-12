import java.util.Scanner;

public class Sequence001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 변수 입력
        System.out.print("변수 a에 넣을 숫자 입력 : ");
        int num1 = scanner.nextInt();

        System.out.print("변수 b에 넣을 숫자 입력 : ");
        int num2 = scanner.nextInt();

        System.out.println("스왑 전 - 변수 a 의 값 = " + num1 + ", 변수 b의 값 = " + num2);

        // 변수 스왑
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("스왑 후 - 변수 a 의 값 = " + num1 + ", 변수 b의 값 = " + num2);

        scanner.close();
    }
}