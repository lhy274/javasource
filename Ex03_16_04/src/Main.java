import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("점수를 입력하세요 =>");
		int first = s.nextInt();
		System.out.printf("10진수 => %d\n", first);
		System.out.printf("16진수 => %x\n", first);
		System.out.printf("8진수 => %o\n", first);
		
		
	}

}
