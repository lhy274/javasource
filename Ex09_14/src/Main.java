import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("계산 입력 1.+ 2.- 3,* 4. / ");
		int operator = s.nextInt();
		System.out.print("첫번째 숫자 입력 : ");
		int o1 = s.nextInt();
		System.out.print("두번째 숫자 입력 : ");
		int o2 = s.nextInt();
		
		int result = calc(o1, o2, operator);
		System.out.println("결과 : " + result);

	}

	private static int calc(int o1, int o2, int operator) {
		// TODO Auto-generated method stub
		int result = -1;
		
		switch(operator) {
		case 1:
			result = o1 + o2;
			break;
		case 2:
			result = o1 - o2;
			break;
		case 3:
			result = o1 * o2;
			break;
		case 4:
			if(02 == 0)
				break;
			result = o1 / o2;
			break;
		}
		return result;
	}

}
