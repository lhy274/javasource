import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("�հ��� �ð��� =>");
		int start = s.nextInt();
		System.out.print("�հ��� ���� =>");
		int end = s.nextInt();
		System.out.print("��� =>");
		int multiple = s.nextInt();
		
		int total = 0;
		int i = start;
		while (i <= end) {
			if (i % multiple == 0)
				total = total + i;
			
			i++;
		}
		
			System.out.printf("%d���� %d������ %d�� �հ� ==> %d\n", start, end, multiple, total);
	}

}
