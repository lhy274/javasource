import java.util.Scanner;

public class Main02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		String str;
		System.out.print("���ڿ��� �Է��ϼ��� => ");
		str = s.nextLine();
		
		System.out.printf("�Է� ���ڿ� ==> %s\n", str);
		String str2 = str.replace("Java", "�ڹ�");
		System.out.println("�ٲ� ���ڿ� ==> " + str2);
		System.out.println();
		String str3 = str.substring(0, 5);
		System.out.println("�Ϻ� ���ڿ� ==> " + str3);
		System.out.println();
		String [] str4 = str.split(" ");
		for(int i = 0; i < str4.length; i++)
		System.out.println("�и��� ���ڿ� ==> " + str4[i]);
		

	}

}
