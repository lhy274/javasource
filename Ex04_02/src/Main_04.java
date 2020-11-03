
public class Main_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b;
		
		b = a++;
		System.out.printf("%d\n", b);
		System.out.printf("%d\n", a);
		b +=a; // b = 11+10 ㅡ>21 a의 값은 계속 10이니까. 아니 변하기는 하는데 a를 출력한 적이 없어서 그런가?????
				// b = 10+11인가?
		System.out.printf("%d\n", b);
		System.out.printf("%d\n", a);
		b = ++a;
		System.out.printf("%d\n", b);
		System.out.printf("%d\n", a);
	}

}
