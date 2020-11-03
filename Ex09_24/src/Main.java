import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str, out = "";
		char ch;
		int count, i;
		int diff = 'a' - 'A';

		System.out.print("문자열을 입력하세요 : ");
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
		System.out.printf("변환된 문자열 => %s \n", out);
	}

} //즐거운 JAVA PROGramming 123
