import java.util.Scanner;

public class Main03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		char ch = 0;
		char a = 'a' - 'A'; // 32-65
		//char b = '가' - '거';
		String out = "";
		System.out.println(65-32);
		System.out.printf("변환 %d\n", (int)'A');
		System.out.print("문자열을 입력하세요 => ");
		String str = s.nextLine();
		
		for(int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if((ch >= 'A') && (ch <= 'C')) 
				out += (char)(ch + 32);   // - 바꾸면 대문자일때 변환이 특수문자랑숫자로 됨.
			else if((ch >= 'a') && (ch <= 'c'))
				out += (char)(ch - a); // + 바꾸면 소문자 일때 변환이 ???됨
			else
				out += (char) ch; // (ch + a); 했을 때 공백 @ 나왔음.
			
		}
		System.out.println("변환된 문자열 =>" + out);
	}

}