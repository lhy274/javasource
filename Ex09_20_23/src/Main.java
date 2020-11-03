import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int charAt;
		System.out.print("문자열을 입력하세요 : ");
		String str = s.nextLine();
		System.out.print("내용을 거꾸로 출력 : ");
		for(int i = str.length()-1; i >= 0; i--) { //p126 i >= 0
			System.out.printf("%c", str.charAt(i));
		}
		
	}

}
