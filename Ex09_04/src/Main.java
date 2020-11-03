import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("문자열 입력 => ");
		String str = s.nextLine();
		
		System.out.println(str.indexOf("Java"));
		System.out.println(str.lastIndexOf("Hello"));
	}

}
