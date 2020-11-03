
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] multiple = new int[9][9];
		
		for(int i = 0; i < multiple.length; i++) {
			for(int j = 0; j < multiple[i].length; j++) {
				multiple[i][j] = (i + 1) * (j + 1);
			}
		}
		
		for(int i = 0; i < multiple.length; i++) {
			for(int j = 0; j < multiple[i].length; j++) {
				System.out.printf("%3dx%d=%1d", j + 1, i + 1, multiple[i][j]);
			}
			System.out.println();
		}
	}

}
