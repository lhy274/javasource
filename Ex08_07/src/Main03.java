import java.util.Scanner;

public class Main03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int [][] aa = new int[2][2]; // 오류가 나면 위에서부터 풀어주면 잘 풀림
		
		for(int i = 0; i < aa.length; i++) {
			System.out.printf("%d 학생입니다--- \n", i);
			for(int j = 0; j < aa[i].length; j++) {
				System.out.printf("%d 번째 점수를 입력하세요 ", j);
				aa[i][j] = s.nextInt(); /// 몇번을 강조해도 부족하지 않네.
			}
		}
		int total = 0;
		for(int i = 0; i < aa.length; i++) {
			System.out.printf("----  %d 번째 점수 ---- \n", i);
			for(int j = 0; j < aa[i].length; j++) {
				System.out.printf("%d 번째 점수 : ", aa[i][j]);
				total+=aa[i][j];
			}
			System.out.printf("평균 : %d\n", total/aa[i].length);
		}

	}

}
