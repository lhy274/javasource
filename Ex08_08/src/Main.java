
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] aa = new int[3][4];
		
		int val = 1; // 이ㅣ 초기 값을 그대로 넣어 준 거구나.
		for(int i = 0; i < aa.length; i++) {
			for(int j = 0; j < aa[i].length; j++) { /// aa[i]가 무엇보다 튼지 정확하게 규정시켜 줄려고 그런 건가? // i보다 덜 돌았을 때 계속 돌라는 거 아닌가?
				aa[i][j] = val;
				val++;
			}
		}
		
		System.out.println("aa[0][0]부터 aa[2][3]까지 출력");
		
		for(int i = 0; i < aa.length; i++) {
			for(int j = 0; j < aa[i].length; j++) {  /// 그래서 행이 더 길어서 J
				System.out.printf("%3d", aa[i][j]);
			}
			System.out.println();
		}

	}

}
