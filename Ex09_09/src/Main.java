
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Java 프로그래밍";
		String str2 = "Java 프로그래밍";
		String str3 = new String("Java 프로그래밍");
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str3));
		System.out.println(str1==str3);
	}

}