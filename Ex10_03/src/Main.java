
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100, b = 0;
		int result;
		try {
			result = a/b;
		} catch(ArithmeticException e) {
			System.out.print("�߻� ���� => ");
			System.out.println(e.getMessage());
		}
	}

}
