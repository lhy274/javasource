import java.util.Scanner;

public class Main_05_03 {  //선생님과 한 것. else if, else 별 차이가 없구나.

	public static void main(String[] args) {   /// chapter 03-예제모음 04~07 p122 따로 정리 함.
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("입력진수 결정 <1>10 <2>16 <3>8 : "); 
		int type = s.nextInt(); // 이제 입력 받아야지

		System.out.print("값 입력  : "); //이제 값을 입력해야지
		int data;  ///입력한 값을 선언하자.
		String str = s.next(); 

		if (type == 1) //10진수, 16진수, 8진수로 받는 게 해석하는 게 다 달라. 이게 8이라고 입력 받아도 10진수로 받은 건지 8진수로 받은 건지 몰라.
		data = Integer.parseInt(str, 10);
		else if (type == 2) 
		data = Integer.parseInt(str, 16);
		else
		data = Integer.parseInt(str, 8);

		System.out.printf("10진순 => %d\n", data); //10진수
		System.out.printf("16진순 => %x\n", data); //16진수
		System.out.printf("8진순 => %o\n", data); //8진수

	}

}
