import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		String out = "";
		int diff = 'a' - 'A'; // �̰Ÿ� Z�� ������.
		char ch;
		
		System.out.print("���ڿ��� �Է��ϼ��� ");
		String str = s.nextLine();
	
		int count = str.length();
		
		for(int i = 0; i < count; i++) {
				ch = str.charAt(i);
			if(('A' <= ch) && (ch <= 'Z')) 
				out += (char)(ch + diff);
			else if(('a' <= ch) && (ch <= 'z')) 
				out += (char)(ch - diff);
			else
				ch += (char) ch;
		}
		System.out.printf("��ȯ�� ���ڿ� => %s", out);

	}//JAVA is puN

}
