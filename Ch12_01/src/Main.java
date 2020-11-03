import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> iter = new LinkedList<>();
		iter.add("가나");
		iter.add("다라");
		iter.add("마바");

		List<String> iter1 = new LinkedList<>();
		iter1.add("하나");
		iter1.add("둘");
		iter1.add("셋");
		
		ListIterator<String> iterGo = iter.listIterator();
		Iterator<String> iterGo1 = iter1.iterator();
		//ListIterator<String> iterGo = iter.listIterator();
		//Iterator<String> iterGo1 = iter1.iterator();
		while(iterGo1.hasNext()) {//2번째 가져올 수 있는 동안 하고
			System.out.println(iter);
			if(iterGo.hasNext()) iterGo.next();//만약 1번째 가져오면 1번째 그다음으로가
			System.out.println(iter);
			iterGo.add(iterGo1.next());//1번째에 터해. 2번째거의 옆의로 가서
		}//2번째거 가져오고 1번째꺼 가져오고 1번째 옆으로가고 1번째꺼에=2번째꺼의 옆으로가
		//1111  2번째꺼에 옆에 뭐가 있냐고 물어보는 동안 반복하는데, 만약 1번째꺼 옆에 뭐가 있냐고 물어봤고(이때 이미 1번-1출력됨) 옆으로 이동하고
		//2222  1번째꺼는 2번째꺼의 옆으로 이동했어 그리고 while문에 있는 2번째껄르 출력하면서 다음 옆으로 갔어. 그리고 1번을 또 출력하는 거지. 그런데 왜? 2번째 부터 출력이 안되는 걸까?
		//[가나, 하나, 다라, 둘, 마바, 셋] 1번이 번저나오네.
		System.out.println(iter);//1번이 먼저 나온 이유가 여기에서 1번을 프린트해서 그런가?
								//2가 없으면 while문 때문에 금방 반복이 끝날 줄 알았는데 아니네. while 문의 정확한 뜻이 뭐지??
		//hasNext()의 의미는 Iterator가 보통 순방향으로 이동하는데, Iterator가 가리키는 데이터저장소의 현재 위치에서 이동할 항목이 있는지 체크합니다. 즉, Iterator는 내부적으로 데이터저장소의 자신이 가리키고 있는 지점을 알고 있습니다.  결국, 이동할 항목이 있다면 true을 리턴하고 그렇지 않으면 false을 리턴합니다.
		//그런데 출력문에서 while이랑 if로 물고 늘어져서 그런건가. 결과적으로 출력은 1을 원한거고 2가 없어져도 와일이 끝났을 뿐이짐 1은 계속 출력 ㄱㄱ한다는 의미 같음.
		//iterGo.next(); 빼니까 --- [하나, 둘, 셋, 가나, 다라, 마바]이거 나옴. 이거네.
		//iterGo.add(iterGo1.next()); 여기가 핵심이네 이거 다음에 2가 끼기 시작하네
		iterGo1 = iter1.listIterator();//이거 정리 끝나고 새롭게 넣어준 거구나
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
