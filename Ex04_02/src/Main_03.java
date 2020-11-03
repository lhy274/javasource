
public class Main_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i1, i2;
		i1 = i2 = 10;
		int r1 = 2 * ++i1;
		int r2 = 2 * i2++;
		System.out.printf("i1 = %d \n i2 = %d \n r1 = %d \n r2 = %d \n", i1, i2, r1, r2);
		
		// 
		
		int a = 10;
		
		a ++;
		System.out.printf("a ++ => %d\n", a);
		a --;
		System.out.printf("a -- => %d\n", a);
		a += 5;
		System.out.printf("a += 5 => %d\n", a);
		a -= 5;
		System.out.printf("a -= 5 => %d\n", a);
		a *= 5;
		System.out.printf("a *= 5 => %d\n", a);
		a /= 5;
		System.out.printf("a /= 5 => %d\n", a);
		a %= 5;
		System.out.printf("a %%= 5 => %d\n", a);

	}

}
