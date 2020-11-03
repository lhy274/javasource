import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) {
		
		Map<String, Employee> p1 = new HashMap<>();
		p1.put("1234", new Employee("학생1", 100.0));
		p1.put("2345", new Employee("학생2", 200));// 알아서 더블로 변환되서 나오네
		p1.put("3456", new Employee("학생3", 300.0));

		System.out.println(p1);
		
		p1.remove("1234");
		p1.put("1234", new Employee("학생100", 101.0));// 처음 스트링 값에 딸 다르게 나옴. 뭥미??
		//Map-HashMap : 순서를 정하네.... 변수.put 해서 처음 키값에 따라 순서를 정렬함.
		System.out.println(p1);
		
		//System.out.println(p1.get("3456"));  //-- 이렇게 해도 되는데 안한건 나후 코딩 수정관 변경 과정이 쉽기 때문이겠지? 다른 이유가 뭐 또 있었던거 같은데...args..args.
		Employee e = p1.get("2345"); //Map의 get보다 임플로이 클래스가 더 놓은가 했는데 이거 그냥 값을 너허준 거였네. 콜바이 벨류 느낌.
		System.out.println(e);
		// for문은 안된다는 덧 키와 벨류의 값을 꺼내와야해서.
		p1.forEach((k, y) -> System.out.println("key =" + k + ", value =" + y));
		
		
		
		
	}
}
