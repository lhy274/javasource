import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.printf("�� ������ �Է� : ");
		int row = s.nextInt();
		System.out.printf("�� ������ �Է� : ");
		int col = s.nextInt();
		
		int [][] aa = new int[row][col]; //�Ҵ� �ϰ� �� �Ŀ� �Է°��� �޴°� �ƴ϶� ������ �� �Է°��� �޴� �Ŷ� ��ĳ�ʴ��� ���� ����.
		
		
		int val = 1;
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				aa[i][j] = val++; //aa[row][col] �ֵ��� ������ �������ִ� �Ű� �ݺ��������� ���� ���� ��ġ�� i j�� ó���ϴ� ����. �׷��� ������ ���� ��ü�� �ƴ϶� ������ ��� ���ʰ� �ʿ��� ��
			}
		}
		System.out.printf("aa[0][0]���� aa[%d][%d]���� ���\n", row, col);
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				System.out.printf("%5d", aa[i][j]);
			}
			System.out.println();
		}

	}

}


