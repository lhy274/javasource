import java.util.Scanner;

public class Main_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("연도를 입력하세요 : ");
		int year = s.nextInt();

		if(((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))
			// 책에 (year % 100 != 0) 이라도 되어 있던데 같은 건가? 그리고 !(!a) 문이 있을 수 있고 이 문은 a랑 같은가?
			System.out.printf("%d 년은 윤년입니다.", year);
		else
			System.out.printf("%d 년은 윤년이 아닙니다.", year);

	}

}
