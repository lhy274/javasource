import java.io.IOException;

public class Main02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userName = "hanbit";
		int key;
		String input = "";  // ���� ���� ���� ������ �ʱ�ȭ ����� �ϴ� ����.
		
		try {
			do {
			System.out.print("�̸��� �Է��ϼ��� => ");
			while ((key = System.in.read()) != 13) 
					input += Character.toString((char)key);
					
			if(input.equals(userName)) //�¾� String�� ==�� �ȵǼ� .equals�� �����.
				System.out.println(input + "�� �ݰ����ϴ�");
			else
				System.out.println(input + "�� ���� ����� ���ϼ̱���");
			} while((key = System.in.read()) != 48); ////////// �ȵǳ�..... 
			
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
