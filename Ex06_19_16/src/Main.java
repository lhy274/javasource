import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է� :");
		String str = s.nextLine();
		
		for(int i = str.length() -1; i >= 0; --i) {
			System.out.printf("�Է��� ���ڿ� ==> %s\n", str);
			System.out.printf("�Է��� ���ڿ� ==> %s", str.charAt(i));
		}
	}

}
