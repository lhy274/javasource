import java.util.Scanner;

public class Main03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("�հ��� ���۰� => ");
		int start = s.nextInt();
		System.out.print("�հ��� ���۰� => ");
		int end = s.nextInt();
		System.out.print("�հ��� ���۰� => ");
		int multiple = s.nextInt();
		
		int i = start;
		int total = 0;
		for(i = 0; i < end; i++) {
			if (i % multiple == 0) {
				System.out.printf("%d���� %d������ %d����� �հ� ==> %d\n", start, end, multiple, total);
				
				total += i;
			}
		}
			System.out.println("��� ����");
	}

}
