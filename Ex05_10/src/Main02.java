import java.util.Scanner;

public class Main02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		String str = s.next();
		
		switch (str) {
			case "���":
				System.out.println("����� �������Դϴ�");
				break;
			case "�ٳ���":
				System.out.println("�ٳ����� ������Դϴ�");
				break;
			case "����":
				System.out.println("������ �����/�����Դϴ�");
				break;
			case "����":
				System.out.println("������ �ʷϻ��Դϴ�");
				break;
			case "��":
				System.out.println("���� ��Ȳ���Դϴ�");
				break;
			default:
				System.out.println("���� �� �̻��Դϴ�");
				break;
				
		}

	}

}
