import java.util.Scanner;

public class Main02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int [][] exams = new int[2][3];
		
		for(int i = 0; i < exams.length; i++) {
			System.out.printf("%d번째 학생입니다\n", i);
			for(int j = 0; j < exams[i].length; j++) {
				System.out.printf("%d번째 학생의 점수를 입력하세요 : ", j);
				exams[i][j] = s.nextInt();
			}
		}
		for(int i = 0; i < exams.length; i++) {
			System.out.printf("%d번째 학생의 점수 ------- \n", i);
			int total = 0;  // 가로줄의 토탈을 잡고 총합의/시험. i=가까이서 들여다 보면 행뿐만 아니라 열도 보임
			for(int j = 0; j < exams[i].length; j++) {
				System.out.printf("%d번째 시험 : %d\t\n", j, exams[i][j]);
				total += exams[i][j];
			}
			System.out.printf("평균은 %d 입니다\n", total/exams[i].length);
		}
	}

}

