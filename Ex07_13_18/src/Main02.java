import java.util.Scanner;

public class Main02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("���ڿ� �� �Է� : ");
			String str = s.nextLine();
			
		int upperCount = 0;
		int lowerCount = 0;
		int diditCount = 0;
		int i = 0;
	
		
		do {
			char ch = str.charAt(i); //���ڿ����� �� ���ڸ� �����Ѵ�(i=���ڿ��� ������ŭ)
			
			if (ch > 'A' && 'Z' > ch)
				upperCount++;
			if (ch > 'a' && 'z' > ch)
				lowerCount++;
			if (ch > '0' && '9' > ch)
				diditCount++;
			
			i++;
		} while (i < str.length());
		
		System.out.printf("�빮�� %d, �ҹ��� %d, ���� %d ", upperCount, lowerCount, diditCount);
	}

}
