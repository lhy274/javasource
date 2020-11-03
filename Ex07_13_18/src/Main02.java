import java.util.Scanner;

public class Main02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("문자열 을 입력 : ");
			String str = s.nextLine();
			
		int upperCount = 0;
		int lowerCount = 0;
		int diditCount = 0;
		int i = 0;
	
		
		do {
			char ch = str.charAt(i); //문자열에서 한 글자를 추출한다(i=문자열의 개수만큼)
			
			if (ch > 'A' && 'Z' > ch)
				upperCount++;
			if (ch > 'a' && 'z' > ch)
				lowerCount++;
			if (ch > '0' && '9' > ch)
				diditCount++;
			
			i++;
		} while (i < str.length());
		
		System.out.printf("대문자 %d, 소문자 %d, 숫자 %d ", upperCount, lowerCount, diditCount);
	}

}
