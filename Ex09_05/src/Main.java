import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		String str;
		System.out.print("���ڿ��� �Է��ϼ��� => ");
		str = s.nextLine();
		
		
		
		String str2 = str.replace("Java", "�ڹ�");
		System.out.println(str2);
		String str3 = str.substring(0, 5);
		System.out.println(str3);
		String [] str4 = str.split(" ");
		for(int i = 0; i < str4.length; i++)
		System.out.println(str4[i]);

	}

}
