
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] aa = new int[3];
		try {
			aa[3] = 100;
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 ÷�ڰ� �迭 ũ�⺸�� Ŀ��~");
		}

	}

}