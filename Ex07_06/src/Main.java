import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int str;
		
		do {
			System.out.print("�մ��ֹ��Ͻðڽ��ϱ�?\n");
			System.out.print("1.�� 2.īǪ 3.�Ƹ� 4.�׸� => \n");
			str = s.nextInt();
			
			switch (str) {
			case 1:
				System.out.print("#���ֹ��ϼ̽��ϴ�\n");
				break;
			case 2:
				System.out.print("#���ֹ��ϼ̽��ϴ�\n");
				break;
			case 3:
				System.out.print("#���ֹ��ϼ̽��ϴ�\n");
				break;
			default:
				System.out.print("�߸� �ֹ��ϼ̽��ϴ�\n");
			} 
		} while (str != 4);
	}

}
