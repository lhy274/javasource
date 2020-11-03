import java.util.Scanner;

public class Main02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("문자열 입력 => ");
		String str = s.nextLine();
		System.out.print("문자열 입력 => "); // 연달아 입력하는 거구나...
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'o')
				System.out.printf("%c", '$');
			else
				System.out.printf("%c", str.charAt(i)+1); //p304 직접 풀어보기 9-1
		}

	}

}
