import java.util.Scanner;

public class Main_05_03 {  //�����԰� �� ��. else if, else �� ���̰� ������.

	public static void main(String[] args) {   /// chapter 03-�������� 04~07 p122 ���� ���� ��.
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("�Է����� ���� <1>10 <2>16 <3>8 : "); 
		int type = s.nextInt(); // ���� �Է� �޾ƾ���

		System.out.print("�� �Է�  : "); //���� ���� �Է��ؾ���
		int data;  ///�Է��� ���� ��������.
		String str = s.next(); 

		if (type == 1) //10����, 16����, 8������ �޴� �� �ؼ��ϴ� �� �� �޶�. �̰� 8�̶�� �Է� �޾Ƶ� 10������ ���� ���� 8������ ���� ���� ����.
		data = Integer.parseInt(str, 10);
		else if (type == 2) 
		data = Integer.parseInt(str, 16);
		else
		data = Integer.parseInt(str, 8);

		System.out.printf("10���� => %d\n", data); //10����
		System.out.printf("16���� => %x\n", data); //16����
		System.out.printf("8���� => %o\n", data); //8����

	}

}
