import java.util.Scanner;

public class Scanner03 {
	public static final float PI = 3.14f;
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("원의 반지름을 입력하시오(cm):");
		try (Scanner scanner = new Scanner(System.in)) {
			float vol;
			float tripleradius;
			
			float radius = scanner.nextInt();
			tripleradius = radius * radius;
			vol = 4 / 3 * PI * tripleradius;
			String volume = String.format("%.2f",vol);
			System.out.println("원의 반지름은" + volume + "cm 입니다.");
		}
		
		
		

	}

}
