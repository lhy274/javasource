import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("문자열 입력 => ");
		String str = s.nextLine();
		System.out.print("문자열 출력 => "); 
		
		if(!str.startsWith("("))
			System.out.printf("-");
		
		for(int i = 0; i < str.length(); i++)
			System.out.printf("%c", str.charAt(i));
			
		if(!str.endsWith(")"))
			System.out.printf(")");

	}

}
if(!str.endsWith(")"))
System.out.printf(")");