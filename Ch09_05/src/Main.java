import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;//�̰� ������ ������ �����ΰ�? ++ �ƴϳ� ��ũ�峪 ��̳� �� ����Ʈ�� �޳�. �Ϲݾƿ��̶� �ӽû���̶� ����� �����ε�

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new LinkedList<String>(); //LinkedList<T> �̷��� �ִٴ� ����? �迭�� �޾Ƽ� (T [] v)Objeck
		list.add("One");
		list.add("Two");
		list.add("Three");
		//list.add(50);  - ���ڿ��θ� �޾ƾ���. ���׸��̶� ����ϳ�.
		for(int i = 0; i < 10; i++)
			list.add("List"+i);// �ֱ⸸ �ϰ� ���� ����� ���߱���.
		
		String str1 = list.get(1);// �� ���Ű� �ǰ����� ����Ʈ0�� 1��°�� �� �ű���
		System.out.println(str1);//++ ���� ���� �ø��ϱ� ���� ���� ���� two�� ������
		
		
		list.remove(1);
		list.remove("Three");
		for(String s : list)
			System.out.println(s);
		
		int size = list.size(); 
			System.out.println("size : " + size); // remove ������ �Ŵ� ����� ���Ե��� �ʴ�����.
		
		String [] arrs = new String[list.size()]; /// ����Ǿ� �ִ� �� �� �̴°ǰ�?
		arrs = list.toArray(arrs);
		for(String s : list)
			System.out.println(s);
		
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}
	
		str1 = list.get(1);// �� ���Ű� �ǰ����� ����Ʈ0�� 1��°�� �� �ű���
		System.out.println(str1);
		
		
		
	}

}
