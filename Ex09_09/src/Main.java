
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Java ���α׷���";
		String str2 = "Java ���α׷���";
		String str3 = new String("Java ���α׷���");
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str3));
		System.out.println(str1==str3);
	}

}