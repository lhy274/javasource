/*
public class Util {
	static <T extends Comparable<T>> T min(T x, T y) {
		//if(x < y)
		if(x.compareTo(y) < 0)  //1-3 = -2�� 0���� �����ϱ� �������� 1��ȯ 
			return x;
		return y;
	}
}

*/


public class Util {//�̰� �޼�Ʈ �������̵��̱���. �׸��� ����ƽ�� �� Ŭ���� ��� ����Ǵ� ���̰� Ư�� �̸��� �ƴ϶� Ŭ���� �̸����� �־��� �� �־�.
	static < T extends Comparable<T>> T max(T x, T y) {  // <T>> �̰� ���ؼ� ������.
			if(x.compareTo(y) > 0)
				return x;
			return y;
			//x.compareTo(y) > 0 ? x : y;  ///�ΰ��� �����ž�. x�� ũ�� x��ȯ x�� ������ y�� ū�Ŵϱ� y��ȯ
		}
}

