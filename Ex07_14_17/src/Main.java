import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("합계의 시각값 =>");
		int start = s.nextInt();
		System.out.print("합계의 끝값 =>");
		int end = s.nextInt();
		System.out.print("배수 =>");
		int multiple = s.nextInt();
		
		int total = 0;
		int i = start;
		while (i <= end) {
			if (i % multiple == 0)
				total = total + i;
			
			i++;
		}
		
			System.out.printf("%d부터 %d까지의 %d의 합계 ==> %d\n", start, end, multiple, total);
	}

}
