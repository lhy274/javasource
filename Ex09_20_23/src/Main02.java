import java.util.Scanner;

public class Main02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("���ڿ��� �Է��ϼ��� => ");
		String str = s.nextLine();
		
		char ch;
		String type = "";
		int gh = str.length();

		for(int i = str.length()-1; i >= 0; i--) {
			ch = str.charAt(i);
			System.out.printf("%s", ch);
		}
		for(int j = 0; j < str.length(); j++)
			type += str.charAt(gh -(j+1));
	}

}//��ſ� java programming
