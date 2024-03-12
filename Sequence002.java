import java.util.Scanner;

public class Sequence002 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("금액을 입력하세요 : ");
			int n = Integer.parseInt(sc.nextLine());
			
			int[] coins = {500,100,50,10};
			int[] result = new int [coins.length];
			
			for(int i = 0; i < coins.length ; i ++) {result[i] += n / coins[i];
			n = n % coins[i];
}		
			for(int i = 0; i < coins.length ; i ++) {
				if(i != coins.length-1) {
					System.out.print(coins[i] + "원 " + result[i] + "개와 "  );
				}else {
					System.out.print(coins[i] + "원 " + result[i] + "개가 필요합니다."  );
				}
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}	