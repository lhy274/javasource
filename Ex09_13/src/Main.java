
public class Main {
	static int plus(int o1, int o2) { // 계산식 입력하는 게 아니라 그냥 매개변수만 선언해주면 됨.
		int result;
		result = o1 + o2;
		return result;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = plus(100, 200);
		
		System.out.printf("100, 200의 plus() 메서드 결과 : %d", total);

	}

}
