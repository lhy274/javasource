import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;//이게 상위고 갈수록 하위인가? ++ 아니네 링크드나 어레이나 다 리스트만 받네. 일반아원이랑 임시사원이랑 비슷한 느낌인듯

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new LinkedList<String>(); //LinkedList<T> 이러고 있다는 거지? 배열로 받아서 (T [] v)Objeck
		list.add("One");
		list.add("Two");
		list.add("Three");
		//list.add(50);  - 문자열로만 받아야함. 제네릭이랑 비슷하네.
		for(int i = 0; i < 10; i++)
			list.add("List"+i);// 넣기만 하고 아직 출력은 안했구나.
		
		String str1 = list.get(1);// 다 제거가 되가지구 리스트0이 1번째가 된 거구나
		System.out.println(str1);//++ 위로 끌어 올리니까 아직 제거 전의 two가 나오네
		
		
		list.remove(1);
		list.remove("Three");
		for(String s : list)
			System.out.println(s);
		
		int size = list.size(); 
			System.out.println("size : " + size); // remove 제거한 거는 사이즈에 포함되지 않느구나.
		
		String [] arrs = new String[list.size()]; /// 저장되어 있는 걸 쫙 뽑는건가?
		arrs = list.toArray(arrs);
		for(String s : list)
			System.out.println(s);
		
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}
	
		str1 = list.get(1);// 다 제거가 되가지구 리스트0이 1번째가 된 거구나
		System.out.println(str1);
		
		
		
	}

}
