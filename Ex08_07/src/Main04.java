import java.util.Scanner;

public class Main04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int [][] aa = new int[2][2]; // ������ ���� ���������� Ǯ���ָ� �� Ǯ��
		
		int val = 0;
		for(int i = 0; i < aa.length; i++) {
			System.out.printf("%d �л��Դϴ�--- \n", i);
			for(int j = 0; j < aa[i].length; j++) {
				System.out.printf("%d ��° ������ �Է��ϼ��� ", j);
				aa[i][j] = s.nextInt(); /// ����� �����ص� �������� �ʳ�.
				val+=aa[i][j];
			}
			System.out.printf("��� : %d\n", val/aa[i].length);
		}
		int total = 0;
		for(int i = 0; i < aa.length; i++) {
			System.out.printf("----  %d ��° ���� ---- \n", i);
			for(int j = 0; j < aa[i].length; j++) {
				System.out.printf("%d ��° ���� : %d\t", j, aa[i][j]);
				total+=aa[i][j];
			}
			System.out.printf("��� : %d\n", total/aa[i].length);
		}

	}

}
