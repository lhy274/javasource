
public class Main_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int result = a>>1;
		System.out.printf("%d 를 오른쪽으로 1회 시프트하면 %d 이다.\n", a, result);
		result = a>>2;
		System.out.printf("%d 를 오른쪽으로 2회 시프트하면 %d 이다.\n", a, result);
		result = a>>3;
		System.out.printf("%d 를 오른쪽으로 3회 시프트하면 %d 이다.\n", a, result);
		System.out.printf("%d 를 오른쪽으로 4회 시프트하면 %d 이다.\n", a, a>>4);
		int b = 25000;
		System.out.printf("%d 를 오른쪽으로 5회 시프트하면 %d 이다.\n", b, b>>5);
	}

}
