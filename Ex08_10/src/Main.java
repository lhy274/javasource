import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.printf("행 개수를 입력 : ");
		int row = s.nextInt();
		System.out.printf("열 개수를 입력 : ");
		int col = s.nextInt();
		
		int [][] aa = new int[row][col]; //할당 하고 난 후에 입력값을 받는게 아니라 실행할 때 입력값을 받는 거라서 스캐너다음 줄인 거임.
		
		
		int val = 1;
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				aa[i][j] = val++; //aa[row][col] 애들은 범위를 지정해주는 거고 반복문에서의 실제 동작 위치는 i j가 처리하는 거임. 그러니 동영상 길이 전체가 아니라 동영상 몇분 몇초가 필요한 것
			}
		}
		System.out.printf("aa[0][0]부터 aa[%d][%d]까지 출력\n", row, col);
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				System.out.printf("%5d", aa[i][j]);
			}
			System.out.println();
		}

	}

}


