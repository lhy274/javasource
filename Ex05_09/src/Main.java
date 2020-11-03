import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("1 ~ 4 중에 선택하세요 : ");
			int score = s.nextInt();
				
		switch (score) {
			case 4:
				System.out.println("4를 선택했다");
				break;
			case 3:
				System.out.println("3을 선택했다");
				break;
			case 2:
				System.out.println("2를 선택했다");
				break;
			default:
				System.out.println("1을 선택했다");
				break;
		
		}
	}

}
