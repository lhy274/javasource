
public class Main {
	
	public static void main(String[] args) {
		
		Map<Integer, String> m1 = new Map<Integer, String>(5);
		for(int i = 0; i < 5; ++i) {
			m1.push(i, "value"+i);
		}
		String s = m1.get(2);
		System.out.println(s);
		
		for(int i = 0; i < m1.size(); ++i) {
			System.out.printf("key = %d, value = %s\n", i, m1.get(i));
		}
		
		Map<Double, String> m2 = new Map<Double, String>(5); ///2�� ���׸����� Double Ŭ���� �������� �빮�ڷ� ���ְ�, ������ ������ Ÿ�Կ��� �ҹ��ڷ� ���±���
			for(int i = 0; i < 5; ++i)
				m2.push((double)i, "definition"+i);
			s = m2.get((double)4);///// push"key"+i == .get"key4 ���ڿ��� �¾ƾ��ϰ� ���� ���ڵ� ������ �Ѿ�� �ȵ�.++ ��� ���ڿͼ��ڰ� �´´� ������ ����� value���� ����� �����µ� �Ʒ� �ݺ��¹��� value = null ���̶�.
			System.out.println(s);
			//map �ڵ��� ������ ���� �Ŷ��� ���� ������.++++++=�� ����� "key"��� ���ڸ� �־��־���++==�ű�ٰ� 19���̶� 24�� get���� ���ƾ���.
			for(int i = 0; i < m2.size(); ++i) {
				System.out.printf("key = %s, value = %s\n", "key"+i, m2.get((double)i));//���⵵ key ���� ���ڿ��� �����ָ� ����� ������
	}
		
		
		int r = Util.max(10, 20);
		System.out.println(r);
		point r2 = Util.max(new point(1000, 2000), new point(100, 200)); //(1000, 100), ū ����ε� �̷������� y���� �۰� ���൵ ū�� ������
		System.out.printf("%d, %d\n", r2.getX(), r2.getY());
		String r3 = Util.max("�����", "����մϴ�.");
		System.out.println(r3);
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		/*
		Map<String, String> m2 = new Map<String, String>(5);
			for(int i = 0; i < 5; ++i)
				m2.push("key"+i, "definition"+i);
			s = m2.get("key4");///// push"key"+i == .get"key4 ���ڿ��� �¾ƾ��ϰ� ���� ���ڵ� ������ �Ѿ�� �ȵ�.++ ��� ���ڿͼ��ڰ� �´´� ������ ����� value���� ����� �����µ� �Ʒ� �ݺ��¹��� value = null ���̶�.
			System.out.println(s);
		//map �ڵ��� ������ ���� �Ŷ��� ���� ������.++++++=�� ����� "key"��� ���ڸ� �־��־���++==�ű�ٰ� 19���̶� 24�� get���� ���ƾ���.
		for(int i = 0; i < m2.size(); ++i) {
			System.out.printf("key = %s, value = %s\n", "key"+i, m2.get("key"+i));//���⵵ key ���� ���ڿ��� �����ָ� ����� ������
		}
		*/
		
	}
	
}
