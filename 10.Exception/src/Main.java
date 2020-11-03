
public class Main {

	public static double divideByZero(int x, int y) {
		return x / y;
	}
	public static void main(String[] args) {
		int x = 50;
		int y = 0;
		double z = 0.0;
		
		try {
			z = divideByZero(x, y);
			System.out.printf("결과 : %f\n", z);
		}/* 
		catch(NoSuchMethodException e) {
			System.out.println("0으로 나누기 예외가 발생했습니다.");
		}*/
		finally {
			System.out.println("처리가 완료되었습니다.");
		}
		
	}

}
