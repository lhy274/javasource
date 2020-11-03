import java.util.Scanner;

public class Main02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("합계의 시작값 => ");
		int start = s.nextInt();
		System.out.print("합계의 시작값 => ");
		int end = s.nextInt();
		System.out.print("합계의 시작값 => ");
		int multiple = s.nextInt();
		
		int i;
		int total = 0;
		for(i = start; i <= end; i++) {
			if (i % multiple == 0) 
				total += i;
			
		}
		System.out.printf("%d부터 %d까지의 %d배수의 합계 ==> %d\n", start, end, multiple, total);
	}

}
