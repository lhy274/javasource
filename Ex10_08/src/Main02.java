import java.io.IOException;

public class Main02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userName = "hanbit";
		int key;
		String input = "";  // 합을 구할 때는 무조건 초기화 해줘야 하는 구나.
		
		try {
			do {
			System.out.print("이름을 입력하세요 => ");
			while ((key = System.in.read()) != 13) 
					input += Character.toString((char)key);
					
			if(input.equals(userName)) //맞아 String은 ==이 안되서 .equals를 썼었어.
				System.out.println(input + "님 반값습니다");
			else
				System.out.println(input + "님 아직 등록을 안하셨군요");
			} while((key = System.in.read()) != 48); ////////// 안되네..... 
			
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
