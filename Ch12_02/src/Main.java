import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) {
		
		Map<String, Employee> p1 = new HashMap<>();
		p1.put("1234", new Employee("�л�1", 100.0));
		p1.put("2345", new Employee("�л�2", 200));// �˾Ƽ� ����� ��ȯ�Ǽ� ������
		p1.put("3456", new Employee("�л�3", 300.0));

		System.out.println(p1);
		
		p1.remove("1234");
		p1.put("1234", new Employee("�л�100", 101.0));// ó�� ��Ʈ�� ���� �� �ٸ��� ����. �o��??
		//Map-HashMap : ������ ���ϳ�.... ����.put �ؼ� ó�� Ű���� ���� ������ ������.
		System.out.println(p1);
		
		//System.out.println(p1.get("3456"));  //-- �̷��� �ص� �Ǵµ� ���Ѱ� ���� �ڵ� ������ ���� ������ ���� �����̰���? �ٸ� ������ �� �� �־����� ������...args..args.
		Employee e = p1.get("2345"); //Map�� get���� ���÷��� Ŭ������ �� ������ �ߴµ� �̰� �׳� ���� ������ �ſ���. �ݹ��� ���� ����.
		System.out.println(e);
		// for���� �ȵȴٴ� �� Ű�� ������ ���� �����;��ؼ�.
		p1.forEach((k, y) -> System.out.println("key =" + k + ", value =" + y));
		
		
		
		
	}
}
