import java.util.Scanner;

public class Main_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int type, data = 0;
		String str;
		
		System.out.print("�Է����� ���� <1>10 <2>16 <3>8 :");
		type = s.nextInt();
		
		System.out.printf("�� �Է� :");   
		
		if (type == 1) {
			str = s.next();
			data = Integer.parseInt(str, 10);
		}
		if (type == 2) {
			str = s.next();
			data = Integer.parseInt(str, 16);
		}
		if (type == 3) {
			str = s.next();
			data = Integer.parseInt(str, 8);
		}
		System.out.printf("10���� ==> %d\n", data);
		System.out.printf("16���� ==> %x\n", data);
		System.out.printf("8���� ==> %o\n", data);
	}

}
