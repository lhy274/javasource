import java.util.Scanner;

public class Main_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("## ��ȯ�� ���� ?");
		int pay = s.nextInt();
		
		int coin500;
		int coin100;
		int coin50;
		int coin10;
		int coin1;
		coin500 = pay / 500;
		pay = pay % 500;
		System.out.printf("�����¥�� => %d ��\n", coin500);
		coin100 = pay / 100;
		pay = pay % 100;
		System.out.printf("���¥�� => %d ��\n", coin100);
		coin50 = pay / 50;
		pay = pay % 50;
		System.out.printf("���ʿ�¥�� => %d ��\n", coin50);
		coin10 = pay / 10;
		pay = pay % 10;
		System.out.printf("�ʿ�¥�� => %d ��\n", coin10);
		System.out.printf("�ٲ��� ���� �ܵ� => %d ��\n", pay);
		coin1 = pay / 1;
		pay = pay % 1;
		System.out.printf("�ٲ��� ���� �ܵ� => %d ��\n", coin1);
	}

}
