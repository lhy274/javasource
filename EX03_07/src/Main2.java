
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 500; // ������ ���� �� �ִ� ��.
		double temperature = 0.0; // �Ǽ�, ������ �ǰ� �Ǽ��� ��.
		
		age = 100;// ���� 100.1�� �ְ� ������ (int)�� �ָ� ��. �׷����� �Ҽ��� ���ϴ� ©��.
		temperature = 123.45;
		
		System.out.printf("%d/%.1f", age, temperature);
		System.out.printf("%d %.1f", age, temperature);
	}

}
