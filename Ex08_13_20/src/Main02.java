
public class Main02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] gg = new int[9][9];
		
		int i;
		int k;
		
		for(i = 0; i < 9; i++) 
			for(k = 0; k < 9; k++) 
				gg[i][k] = (i + 1) * (k + 1);
		
		for(i = 0; i < 9; i++) {
			for(k = 0; k < 9; k++) {
				System.out.printf("%dx%d=%2d", k + 1, i + 1, gg[i][k]);
			}
			System.out.println();
		}
	}

}