import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str;
		
		System.out.print("문자열을 입력하세요 => ");
		str = s.nextLine();
		
		System.out.println("[" + str + "]");
		String str1 = str.toUpperCase();
		System.out.println("[" + str1 + "]");
		String str2 = str.toLowerCase();
		System.out.println("[" + str2 + "]");
		String str3 = str.trim();
		System.out.println("[" + str3 + "]");
		String str4 = str.replace(" ", "");
		System.out.println("[" + str4 + "]"); // replace로 했는데 다른 방법
		

	}

}
