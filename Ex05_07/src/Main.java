
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 75;
		
		if (a > 50) {
			if (a < 100) {
				System.out.println("50 < a <100, 50���� ũ�� 100���� �۱���.");
		}
			else {
				System.out.println("a > 100. 100���� ũ����.");
			}
	
	} else {
			System.out.println("50 < a, 50���� �۱���.");
		}
		
		if (a > 100)
			System.out.println("a > 100");
		else if (a > 50)
			System.out.println("50 < a < 100");
		else
			System.out.println("50 > a");
	}

}
