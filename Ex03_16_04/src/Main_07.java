import java.util.Scanner;

public class Main_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int repeat;
		
		System.out.println("���ڿ��� �Է� =>");
		String first = s.nextLine();
		
		for (repeat = first.length() - 1; repeat >= 0; repeat--)  {
		System.out.printf("%c", first.charAt(repeat));
		
		}
		System.out.printf("\"�ȳ��ϼ���\"\n");
	}

}
