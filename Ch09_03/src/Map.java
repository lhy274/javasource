
public class Map <T extends Number, V>{ // extends Number ������ ���� Ŭ������ �Ǹ� ���ڸ� �� �� �ִ°ž�. ����, �Ǽ�
	private T [] ky;
	private V [] value;
	private int count;
	
	public Map(int size) {
		ky = (T[])new  Number[size]; // 2�� Main ���� [(double)size] �̷��� ���� �� �� �˾Ҵµ� map���� �迭 �κ� ����� Number�� �ٲ���� �߾�.
		value = (V[])new Object[size];
		count = 0;
	}//2�� ky = (T[])new Object[size]; ���⿡ ������Ʈ�� only ���ڸ� ���� �� �ְ�  Number�� �ٲ���. �޴°� ��� ������ ������Ʈ�� ��� �� �����ϱ�. ���ϸ��� ������ ��ġ����. ���׸��� Ȥ�ø� �̻��� Ÿ�Ե餷�� ���� ���� �߿���.
	
	public void push(T key, V value) {
		this.ky[count] = key;
		this.value[count] = value;
		count++;
	}
	
	public V get(T key) {
		for(int i = 0; i < count; ++i)////2 push�� �־��� ���� ������ ���� �ű���. �׸��� �־��� ���� ������ push���� �־��� y���� ����ϴ� �Ű�
			if(this.ky[i].equals(key))/// 1 �ʵ��� key ���� i ��°�� ���� 
				return this.value[i];
		return null;
	}
	
	public int size() {
		return count;
	}
	

	
}
