import java.util.Scanner;

public class Main_05_02 {

	public static void main(String[] args) {   /// chapter 03-예제모음 04~07 p122 따로 정리 함.
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("입력진수 결정 <1>10 <2>16 <3>8 : "); 
		int first = s.nextInt();

		System.out.print("값 입력  : ");
		String second = s.next();

		int data = 0;
		
		if (first == 1) {
		data = Integer.parseInt(second, 10);
		}
		if (first == 2) {
		data = Integer.parseInt(second, 16);
		}
		if (first == 3) {
		data = Integer.parseInt(second, 8);
		}

		System.out.printf("10진순 => %d\n", data);
		System.out.printf("16진순 => %x\n", data);
		System.out.printf("8진순 => %o\n", data);

	}

}
