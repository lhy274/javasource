
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] aa = new int[3][4];
		
		int val = 1; // �̤� �ʱ� ���� �״�� �־� �� �ű���.
		for(int i = 0; i < aa.length; i++) {
			for(int j = 0; j < aa[i].length; j++) { /// aa[i]�� �������� ư�� ��Ȯ�ϰ� �������� �ٷ��� �׷� �ǰ�? // i���� �� ������ �� ��� ����� �� �ƴѰ�?
				aa[i][j] = val;
				val++;
			}
		}
		
		System.out.println("aa[0][0]���� aa[2][3]���� ���");
		
		for(int i = 0; i < aa.length; i++) {
			for(int j = 0; j < aa[i].length; j++) {  /// �׷��� ���� �� �� J
				System.out.printf("%3d", aa[i][j]);
			}
			System.out.println();
		}

	}

}
