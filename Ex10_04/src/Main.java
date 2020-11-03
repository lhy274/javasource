
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100, b =0;
		int result;
		try {
			if(b == 0)
				throw new Exception("0으로 나누려고요? 안됩니다.");
			result = a/b;
		} catch (Exception e) {
			System.out.print("발생호류 ==> ");
			System.out.println(e.getMessage());
		}

	}

}
