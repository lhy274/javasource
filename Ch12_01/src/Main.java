import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> iter = new LinkedList<>();
		iter.add("����");
		iter.add("�ٶ�");
		iter.add("����");

		List<String> iter1 = new LinkedList<>();
		iter1.add("�ϳ�");
		iter1.add("��");
		iter1.add("��");
		
		ListIterator<String> iterGo = iter.listIterator();
		Iterator<String> iterGo1 = iter1.iterator();
		//ListIterator<String> iterGo = iter.listIterator();
		//Iterator<String> iterGo1 = iter1.iterator();
		while(iterGo1.hasNext()) {//2��° ������ �� �ִ� ���� �ϰ�
			System.out.println(iter);
			if(iterGo.hasNext()) iterGo.next();//���� 1��° �������� 1��° �״������ΰ�
			System.out.println(iter);
			iterGo.add(iterGo1.next());//1��°�� ����. 2��°���� ���Ƿ� ����
		}//2��°�� �������� 1��°�� �������� 1��° �����ΰ��� 1��°����=2��°���� �����ΰ�
		//1111  2��°���� ���� ���� �ֳİ� ����� ���� �ݺ��ϴµ�, ���� 1��°�� ���� ���� �ֳİ� ����ð�(�̶� �̹� 1��-1��µ�) ������ �̵��ϰ�
		//2222  1��°���� 2��°���� ������ �̵��߾� �׸��� while���� �ִ� 2��°���� ����ϸ鼭 ���� ������ ����. �׸��� 1���� �� ����ϴ� ����. �׷��� ��? 2��° ���� ����� �ȵǴ� �ɱ�?
		//[����, �ϳ�, �ٶ�, ��, ����, ��] 1���� ����������.
		System.out.println(iter);//1���� ���� ���� ������ ���⿡�� 1���� ����Ʈ�ؼ� �׷���?
								//2�� ������ while�� ������ �ݹ� �ݺ��� ���� �� �˾Ҵµ� �ƴϳ�. while ���� ��Ȯ�� ���� ����??
		//hasNext()�� �ǹ̴� Iterator�� ���� ���������� �̵��ϴµ�, Iterator�� ����Ű�� ������������� ���� ��ġ���� �̵��� �׸��� �ִ��� üũ�մϴ�. ��, Iterator�� ���������� ������������� �ڽ��� ����Ű�� �ִ� ������ �˰� �ֽ��ϴ�.  �ᱹ, �̵��� �׸��� �ִٸ� true�� �����ϰ� �׷��� ������ false�� �����մϴ�.
		//�׷��� ��¹����� while�̶� if�� ���� �þ����� �׷��ǰ�. ��������� ����� 1�� ���ѰŰ� 2�� �������� ������ ������ ������ 1�� ��� ��� �����Ѵٴ� �ǹ� ����.
		//iterGo.next(); ���ϱ� --- [�ϳ�, ��, ��, ����, �ٶ�, ����]�̰� ����. �̰ų�.
		//iterGo.add(iterGo1.next()); ���Ⱑ �ٽ��̳� �̰� ������ 2�� ���� �����ϳ�
		iterGo1 = iter1.listIterator();//�̰� ���� ������ ���Ӱ� �־��� �ű���
		while(iterGo1.hasNext()) {
			iterGo1.next();
			if(iterGo1.hasNext()) {
				iterGo1.next();
				iterGo1.remove();
			}
		}
		System.out.println(iter1);
		
	}

}
