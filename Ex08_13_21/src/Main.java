
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][][] dimension = new int[10][10][10];
		
		int index = 1;
		
		for(int i = 0; i < dimension.length; i++) {
			for(int j = 0; j < dimension.length; j++) {
				for(int k = 0; k < dimension.length; k++) {
					dimension[i][j][k]+=index++; // += 했는데 같은 값이 나왔네???

				}
			}
		}
		
		int total = 0;
		for(int i = 0; i < dimension.length; i++) {
			for(int j = 0; j < dimension.length; j++) {
				for(int k = 0; k < dimension.length; k++) {
					total += dimension[i][j][k];

				}
			}
		}
		System.out.println(total);
	}

}
