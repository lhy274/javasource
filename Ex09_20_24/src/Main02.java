import java.util.Scanner;

public class Main02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String in, out = "";
		char ch;
		int count, i;
		int diff = 'a' - 'A';

		System.out.print("���ڿ��� �Է��ϼ��� : ");
			in = s.nextLine();

		count = in.length();
		
		for(i = 0; i < count; i++) {
			ch = in.charAt(i);
			if(('A' <= ch) && (ch <= 'Z'))
				out += (char)(ch + diff);
			else if(('a' <= ch) && (ch <= 'z'))//�̰Ÿ� Z�� ������.
				out += (char)(ch - diff);
			else
				out += (char) ch;			
		}
		System.out.printf("%s", out);
	}

}//��ſ� Java Programming 1234 ^__^
