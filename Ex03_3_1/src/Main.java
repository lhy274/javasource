
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%d+%d=%d", 100, 200, 300);
		System.out.println("\n");
		System.out.printf("%d/%d=%.1f", 100, 200, 100.5/200.5);
		System.out.print("\n");
		System.out.printf("%d+%d=%.1f", 100, 25+175, (150.0*2));
		System.out.print("\n");
		
		int a = 5;
		int b = 1;
		System.out.println("a + (b+0.5) =" + (a + (b + 0.5)));
		
		//������ ����ȯ �ǳ� ����.
		System.out.printf("%d+%d=%d", 100, 200, (int) 20.5); 
		
		System.out.print("\n");
		//��� �Ǽ� ������ �ʳ�. �׳� ���� �κи� ���ؼ� �����µ�
		int c = (int) 20.5;
		int d = (int) 2.5;
		System.out.printf("%d+%d=%d", 100, 200, (c+d)); 
	
		System.out.print("\n");
		System.out.printf("%d+%d=%d\n", 100, 200, 10+5);
		System.out.format("%d+%d=%d\n", 100, 200, 300); 
		System.out.print("10���� : \n" + 100 + "\n"); 
		System.out.printf("%d\n", 5);
		System.out.println(5 + "+" + 1 + "=" ); // + result �ص� �� ���� ""���� �־ ���� ���.
		System.out.println(5 + "+" + 1 + "=" + (5+1));
	}

}
