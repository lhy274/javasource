import java.util.Scanner;

public class Main02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int [][] exams = new int[2][3];
		
		for(int i = 0; i < exams.length; i++) {
			System.out.printf("%d��° �л��Դϴ�\n", i);
			for(int j = 0; j < exams[i].length; j++) {
				System.out.printf("%d��° �л��� ������ �Է��ϼ��� : ", j);
				exams[i][j] = s.nextInt();
			}
		}
		for(int i = 0; i < exams.length; i++) {
			System.out.printf("%d��° �л��� ���� ------- \n", i);
			int total = 0;  // �������� ��Ż�� ��� ������/����. i=�����̼� �鿩�� ���� ��Ӹ� �ƴ϶� ���� ����
			for(int j = 0; j < exams[i].length; j++) {
				System.out.printf("%d��° ���� : %d\t\n", j, exams[i][j]);
				total += exams[i][j];
			}
			System.out.printf("����� %d �Դϴ�\n", total/exams[i].length);
		}
	}

}

