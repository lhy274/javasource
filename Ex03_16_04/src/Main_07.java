import java.util.Scanner;

public class Main_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int repeat;
		
		System.out.println("문자열을 입력 =>");
		String first = s.nextLine();
		
		for (repeat = first.length() - 1; repeat >= 0; repeat--)  {
		System.out.printf("%c", first.charAt(repeat));
		
		}
		System.out.printf("\"안녕하세요\"\n");
	}

}
