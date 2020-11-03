
public class Main02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 21; ++i) {
			System.out.print("-");
		}
		System.out.println();
		System.out.println("10진수\t16진수\t문자");
		for(int i = 0; i < 21; ++i) {
			System.out.print("-");
		}
		System.out.println();
		for(int j = 0; j < 128; ++j) {
			System.out.printf("%3d\t",j);
			System.out.printf("%3X\t",j);
			System.out.printf("%3c\t",j);
			System.out.println();
		}

	}

}
