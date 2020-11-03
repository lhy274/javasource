
public class Main {
	
	static void func1() {
		System.out.printf("void형 메서드는 돌려줄 게 없음.\n");
	}
	static int func2() { // 리턴의 값이랑 같은 데이터형을 써야함. int 이름 ()
		return 100;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		
		func1();
		
		a = func2();
		System.out.printf("int형 메서드에서 돌려준 값 => %d", a);

	}

}
