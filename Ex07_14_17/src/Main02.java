import java.util.Scanner;

public class Main02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("�հ��� ���۰� => ");
		int start = s.nextInt();
		System.out.print("�հ��� ���۰� => ");
		int end = s.nextInt();
		System.out.print("�հ��� ���۰� => ");
		int multiple = s.nextInt();
		
		int i;
		int total = 0;
		for(i = start; i <= end; i++) {
			if (i % multiple == 0) 
				total += i;
			
		}
		System.out.printf("%d���� %d������ %d����� �հ� ==> %d\n", start, end, multiple, total);
	}

}
