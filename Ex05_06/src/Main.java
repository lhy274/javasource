import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a;
		
		System.out.print("������ �Է��ϼ��� : ");
		a = s.nextInt();
		
		if (a % 2 ==0)
			System.out.printf("¦���� �Է��ϼ̽��ϴ�.\n");
		else
			System.out.println("Ȧ���� �Է��ϼ̽��ϴ�..");
	}

}
