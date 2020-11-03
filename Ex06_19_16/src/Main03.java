import java.util.Scanner;

public class Main03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("글자를 입력 :");
		String str = s.nextLine();
		
		for(int i = str.length() -1; i >= 0; --i) {
			System.out.printf("입력한 문자열 ==> %s", str.charAt(i));
		}
		System.out.println();
		System.out.printf("입력한 문자열 ==>");
		int str_cnt = str.length();
		for(int i = str_cnt -1; i >= 0; --i) {
			System.out.printf("%s", str.charAt(i));
		}
	}
}