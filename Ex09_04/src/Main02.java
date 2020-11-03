import java.util.Scanner;

public class Main02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		String str;
		System.out.println("문자열을 입력하세요 => ");
		str = s.nextLine();
		
		System.out.println(str.indexOf("Hi"));
		System.out.println(str.lastIndexOf("Java"));

	}

}
