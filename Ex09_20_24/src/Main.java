import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		String out = "";
		int diff = 'a' - 'A'; // 이거를 Z로 썻었음.
		char ch;
		
		System.out.print("문자열을 입력하세요 ");
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
		System.out.printf("변환된 문자열 => %s", out);

	}//JAVA is puN

}
