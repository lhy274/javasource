
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] aa = new int[100];
		int [] bb = new int[100];
		
		for(int i = 0; i < aa.length; i++)
			aa[i] = i * 2;
		///for(int i = 0; i < aa.length; i++) �ѤѤ� �̰� �߰�ȣ �� ��� �׷��ǰ�?
			///System.out.printf("%d ��° �϶� aa[]�� ���� %d�̴�\n", i, aa[i]);
		for(int i = 0; i < bb.length; i++) 
			bb[i] = aa[aa.length-(i+1)];
		for(int i = 0; i < bb.length; i++)
			System.out.printf("%d : %d\n", i, bb[i]);
	}

}
