import java.util.Scanner;

public class Main03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		char ch = 0;
		char a = 'a' - 'A'; // 32-65
		//char b = '��' - '��';
		String out = "";
		System.out.println(65-32);
		System.out.printf("��ȯ %d\n", (int)'A');
		System.out.print("���ڿ��� �Է��ϼ��� => ");
		String str = s.nextLine();
		
		for(int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if((ch >= 'A') && (ch <= 'C')) 
				out += (char)(ch + 32);   // - �ٲٸ� �빮���϶� ��ȯ�� Ư�����ڶ����ڷ� ��.
			else if((ch >= 'a') && (ch <= 'c'))
				out += (char)(ch - a); // + �ٲٸ� �ҹ��� �϶� ��ȯ�� ???��
			else
				out += (char) ch; // (ch + a); ���� �� ���� @ ������.
			
		}
		System.out.println("��ȯ�� ���ڿ� =>" + out);
	}

}