import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a;
		
		System.out.print("정수를 입력하세요 : ");
		a = s.nextInt();
		
		if (a % 2 ==0)
			System.out.printf("짝수를 입력하셨습니다.\n");
		else
			System.out.println("홀수를 입력하셨습니다..");
	}

}
