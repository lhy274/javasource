
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 500; // 정수만 놓을 수 있는 것.
		double temperature = 0.0; // 실수, 정수도 되고 실수도 됨.
		
		age = 100;// 만약 100.1을 주고 싶으면 (int)를 주면 됨. 그렇지만 소수점 이하는 짤림.
		temperature = 123.45;
		
		System.out.printf("%d/%.1f", age, temperature);
		System.out.printf("%d %.1f", age, temperature);
	}

}
