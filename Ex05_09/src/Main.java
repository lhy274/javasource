import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("1 ~ 4 �߿� �����ϼ��� : ");
			int score = s.nextInt();
				
		switch (score) {
			case 4:
				System.out.println("4�� �����ߴ�");
				break;
			case 3:
				System.out.println("3�� �����ߴ�");
				break;
			case 2:
				System.out.println("2�� �����ߴ�");
				break;
			default:
				System.out.println("1�� �����ߴ�");
				break;
		
		}
	}

}
