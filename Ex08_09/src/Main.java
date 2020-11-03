
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] aa = {
						{1, 2, 3, 4},
						{5, 6, 7, 8},
						{9, 10, 11, 12}
					};
		
		System.out.println("aa[0][0]부터 aa[2][3]까지 출력");
		
		for(int i = 0; i < aa.length; i++) {
			for(int k = 0; k < aa[i].length; k++) {
				System.out.printf("%d\t",aa[i][k]);
			}
			System.out.println();
		}
		

	}

}
