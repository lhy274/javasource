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
					System.out.printf("���� �ͳ��� ���� á���ϴ�.\n");
				}
				else  {
					stack[top] = car++;
					System.out.printf("%o�� ���п� ��\n", (int)stack[top]);
					top++;
				}
				break;
			case 2: 
				if(top > 0) {
				top--;
				stack[top] = car++;
				System.out.printf("%c�� ���п��� ���ɴϴ�\n", stack[top]);
				}
				else
					System.out.printf("���� �����ϴ�.\n");
				break; 
			case 3: 
				System.out.printf("�����մϴ� ���� ���� %d��\n", top);
				break;
			default: 
				System.out.printf("���� �ͳο� �� %d�밡 �ֽ��ϴ�.\n", top);
				break;
			}
		}
			System.out.printf("���α׷��� �����մϴ�\n");
	}

}
