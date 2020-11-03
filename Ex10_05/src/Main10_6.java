import java.util.Scanner;

public class Main10_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		byte a;
		short b;
		int c;
		long d;
		float e;
		double f;
		String str1, str2;
		
		System.out.printf("byte : ");
		a = s.nextByte();
		System.out.printf("short : ");
		b = s.nextShort();
		System.out.printf("int : ");
		c = s.nextInt();
		System.out.printf("long : ");
		d = s.nextLong();
		System.out.printf("float : ");
		e = s.nextFloat();
		System.out.printf("double : ");
		f = s.nextDouble();
		System.out.printf("str1 : ");
		str1 = s.next();
		System.out.printf("str2 : ");
		str2 = s.nextLine();


	}

}
