import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] stack = new char[5];
		int top = 0;
		
		stack[top] = 'A';
		top++;
		stack[top] = 'b';
		top++;
		stack[top] = 'c';
		top++;
		System.out.println();
		top--;
		System.out.printf("%c 빠져나갑니다", stack[top]);
		--top;
		System.out.printf("%c 빠져나갑니다", stack[top]);
		--top;
		System.out.printf("%c 빠져나갑니다", stack[top]);
	}

}
