import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str, out = "";
		char ch;
		int count, i;
		int diff = 'a' - 'A';

		System.out.print("���ڿ��� �Է��ϼ��� : ");
			str = s.nextLine();
		
		count = str.length();
		
		for(i = 0; i < count; i++) {
			ch = str.charAt(i);
			if(('A' <= ch) && (ch <= 'Z'))
				out += (char) (ch + diff);
			else if(('a' <= ch) && (ch <= 'Z'))
				out += (char) (ch - diff);
			else
				out += (char) ch;		
		}
		System.out.printf("��ȯ�� ���ڿ� => %s \n", out);
	}

} //��ſ� JAVA PROGramming 123
