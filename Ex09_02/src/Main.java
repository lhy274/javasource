import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("���ڿ� �Է� => ");
		String str = s.nextLine();
		System.out.print("���ڿ� ��� => "); // ���޾� �Է��ϴ� �ű���...
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'o')
				System.out.printf("%c", '$');
			else
				System.out.printf("%c", str.charAt(i));
		}

	}

}
