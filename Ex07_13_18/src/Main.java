import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է� : ");
		String str = s.nextLine();
		
		int i = 0;
		char ch = 0;
		int upperCount = 0;
		int lowerCount = 0;
		int digitCount = 0;

		do {
			ch = str.charAt(i);
			
			if (ch >= 'A' && ch <= 'Z')
				upperCount++;
			if (ch >= 'a' && ch <= 'z')
				lowerCount++;
			if (ch >= '0' && ch <= '9')
				digitCount++;
			
			i++;
				
		} while(i < str.length());
		
		System.out.printf("�빮�� %d��, �ҹ��� %d��, ���� %d��", upperCount, lowerCount, digitCount);
		
	}

}
