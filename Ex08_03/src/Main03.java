import java.util.Scanner;

public class Main03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int [] inputs = new int[5];
		
		for(int i = 0; i < inputs.length; i++) {
			System.out.printf("%d ��° ���ڸ� �Է��ϼ��� : ", i);
			inputs[i] = s.nextInt();
		}
		
		int total = 0;
		for(int i = 0; i < inputs.length; i++) {
			total += inputs[i];
		}
		System.out.printf("����� ���� : %d", total);
	}

}
