
public class Main_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b;
		
		b = a++;
		System.out.printf("%d\n", b);
		System.out.printf("%d\n", a);
		b +=a; // b = 11+10 ��>21 a�� ���� ��� 10�̴ϱ�. �ƴ� ���ϱ�� �ϴµ� a�� ����� ���� ��� �׷���?????
				// b = 10+11�ΰ�?
		System.out.printf("%d\n", b);
		System.out.printf("%d\n", a);
		b = ++a;
		System.out.printf("%d\n", b);
		System.out.printf("%d\n", a);
	}

}
