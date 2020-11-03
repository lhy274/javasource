import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int str;
		
		do {
			System.out.print("손님주문하시겠습니까?\n");
			System.out.print("1.라떼 2.카푸 3.아메 4.그만 => \n");
			str = s.nextInt();
			
			switch (str) {
			case 1:
				System.out.print("#라떼주문하셨습니다\n");
				break;
			case 2:
				System.out.print("#라떼주문하셨습니다\n");
				break;
			case 3:
				System.out.print("#라떼주문하셨습니다\n");
				break;
			default:
				System.out.print("잘못 주문하셨습니다\n");
			} 
		} while (str != 4);
	}

}
