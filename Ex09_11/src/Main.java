import java.util.Scanner;

public class Main {
	
	static void coffeeMachine(int button) {
		System.out.println("1. �߰ſ� ���� �غ��Ѵ�");
		System.out.println("2. �������� �غ� �غ��Ѵ�");

		switch(button) {
		case 1:
			System.out.println("3. ����Ŀ�Ǹ� ź��");
			break;
		case 2:
			System.out.println("3. ����Ŀ�Ǹ� ź��");
			break;
		case 3:
			System.out.println("3. ��Ŀ�Ǹ� ź��");
			break;
		default:
			System.out.println("3. �������� ź��");			
		}
		
		System.out.println("4. ���� �״´�");
		System.out.println("5. ��Ǭ���� ��� ���δ�");

	}
	
	public static void main(String[] args) {  // �̰� �ѹ� �غ� ��
		// TODO Auto-generated method stub
		System.out.print("Which one?");
		Scanner s = new Scanner(System.in);
		int coffee = s.nextInt();
		coffeeMachine(coffee);
		System.out.println("Done!");

	}

}
