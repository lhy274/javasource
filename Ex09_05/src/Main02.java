import java.util.Scanner;

public class Main02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		String str;
		System.out.print("문자열을 입력하세요 => ");
		str = s.nextLine();
		
		System.out.printf("입력 문자열 ==> %s\n", str);
		String str2 = str.replace("Java", "자바");
		System.out.println("바꾼 문자열 ==> " + str2);
		System.out.println();
		String str3 = str.substring(0, 5);
		System.out.println("일부 문자열 ==> " + str3);
		System.out.println();
		String [] str4 = str.split(" ");
		for(int i = 0; i < str4.length; i++)
		System.out.println("분리한 문자열 ==> " + str4[i]);
		

	}

}
