import java.util.Scanner;

public class Main_05_02 {

	public static void main(String[] args) {   /// chapter 03-�������� 04~07 p122 ���� ���� ��.
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("�Է����� ���� <1>10 <2>16 <3>8 : "); 
		int first = s.nextInt();

		System.out.print("�� �Է�  : ");
		String second = s.next();

		int data = 0;
		
		if (first == 1) {
		data = Integer.parseInt(second, 10);
		}
		if (first == 2) {
		data = Integer.parseInt(second, 16);
		}
		if (first == 3) {
		data = Integer.parseInt(second, 8);
		}

		System.out.printf("10���� => %d\n", data);
		System.out.printf("16���� => %x\n", data);
		System.out.printf("8���� => %o\n", data);

	}

}
