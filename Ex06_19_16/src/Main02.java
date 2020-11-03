import java.util.Scanner;

public class Main02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int str_cnt;
		
		System.out.print("글자를 입력 :");
		String str = s.nextLine();
		
		System.out.println();
			System.out.printf("입력한 문자열 ==> %s\n", str);
			System.out.printf("입력한 문자열 ==> ");
			
		str_cnt = str.length();
			for(int i = str_cnt-1; i >= 0; --i) {
				System.out.printf("%c", str.charAt(i));
		}
			
			
	}

}
