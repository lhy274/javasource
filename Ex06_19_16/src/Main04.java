import java.util.Scanner;

public class Main04 {  /// 이것도 되네.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("글자를 입력 :");
		String str = s.nextLine();
		
			System.out.printf("입력한 문자열 ==> %s\n", str);
			System.out.printf("입력한 문자열 ==>");
			for(int i = str.length() -1; i >= 0; --i) {
				System.out.printf("%s", str.charAt(i));

	 }
	}

}
