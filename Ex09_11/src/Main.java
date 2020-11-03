import java.util.Scanner;

public class Main {
	
	static void coffeeMachine(int button) {
		System.out.println("1. 뜨거운 물을 준비한다");
		System.out.println("2. 종이컵을 준비 준비한다");

		switch(button) {
		case 1:
			System.out.println("3. 보통커피를 탄다");
			break;
		case 2:
			System.out.println("3. 설탕커피를 탄다");
			break;
		case 3:
			System.out.println("3. 블랙커피를 탄다");
			break;
		default:
			System.out.println("3. 랜덤으로 탄다");			
		}
		
		System.out.println("4. 물을 붓는다");
		System.out.println("5. 스푼으로 저어서 녹인다");

	}
	
	public static void main(String[] args) {  // 이건 한번 해본 거
		// TODO Auto-generated method stub
		System.out.print("Which one?");
		Scanner s = new Scanner(System.in);
		int coffee = s.nextInt();
		coffeeMachine(coffee);
		System.out.println("Done!");

	}

}
