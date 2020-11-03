import java.util.Scanner;

public class Main02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("과일을 입력하세요 : ");
		String str = s.next();
		
		switch (str) {
			case "사과":
				System.out.println("사과는 빨간색입니다");
				break;
			case "바나나":
				System.out.println("바나나는 노랑색입니다");
				break;
			case "포도":
				System.out.println("포도는 보라색/남색입니다");
				break;
			case "수박":
				System.out.println("수박은 초록색입니다");
				break;
			case "귤":
				System.out.println("귤은 주황색입니다");
				break;
			default:
				System.out.println("과일 그 이상입니다");
				break;
				
		}

	}

}
