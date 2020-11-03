import java.util.Scanner;

public class Main_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("## 교환할 돈은 ?");
		int pay = s.nextInt();
		
		int coin500;
		int coin100;
		int coin50;
		int coin10;
		int coin1;
		coin500 = pay / 500;
		pay = pay % 500;
		System.out.printf("오백원짜리 => %d 개\n", coin500);
		coin100 = pay / 100;
		pay = pay % 100;
		System.out.printf("백원짜리 => %d 개\n", coin100);
		coin50 = pay / 50;
		pay = pay % 50;
		System.out.printf("오십원짜리 => %d 개\n", coin50);
		coin10 = pay / 10;
		pay = pay % 10;
		System.out.printf("십원짜리 => %d 개\n", coin10);
		System.out.printf("바꾸지 못한 잔돈 => %d 개\n", pay);
		coin1 = pay / 1;
		pay = pay % 1;
		System.out.printf("바꾸지 못한 잔돈 => %d 개\n", coin1);
	}

}
