import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int [] aa = new int[4];
		
		System.out.print("1 ���� �Է��ϼ���");
		aa[0] = s.nextInt();
		System.out.print("2 ���� �Է��ϼ���");
		aa[1] = s.nextInt();
		System.out.print("3 ���� �Է��ϼ���");
		aa[2] = s.nextInt();
		System.out.print("4 ���� �Է��ϼ���");
		aa[3] = s.nextInt();
		
		int total = aa[0] + aa[1] + aa[2] + aa[3];
		
		System.out.printf("��:%d", total);

	}

}

