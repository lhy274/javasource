import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int i = 0;
		char [] stack = new char[5];
		char car = 'A';
		int select = 1;
		int top = 0;
		
		while(select != 3) {
			System.out.print("1.push 2.pop 3.end");
			select = s.nextInt();
			
			switch(select) {
			case 1: 
				if(top >= 5) {
					System.out.printf("차로 터널이 가득 찼습니다.\n");
				}
				else  {
					stack[top] = car++;
					System.out.printf("%o가 터털에 들어감\n", (int)stack[top]);
					top++;
				}
				break;
			case 2: 
				if(top > 0) {
				top--;
				stack[top] = car++;
				System.out.printf("%c가 터털에서 나옵니다\n", stack[top]);
				}
				else
					System.out.printf("차가 없습니다.\n");
				break; 
			case 3: 
				System.out.printf("종료합니다 남은 차량 %d대\n", top);
				break;
			default: 
				System.out.printf("현대 터널에 차 %d대가 있습니다.\n", top);
				break;
			}
		}
			System.out.printf("프로그램을 종료합니다\n");
	}

}
