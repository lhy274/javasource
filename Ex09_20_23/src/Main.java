import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int charAt;
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String str = s.nextLine();
		System.out.print("������ �Ųٷ� ��� : ");
		for(int i = str.length()-1; i >= 0; i--) { //p126 i >= 0
			System.out.printf("%c", str.charAt(i));
		}
		
	}

}
