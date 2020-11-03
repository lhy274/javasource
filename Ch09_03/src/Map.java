
public class Map <T extends Number, V>{ // extends Number 숫자의 서브 클래스가 되면 숫자만 할 수 있는거야. 정수, 실수
	private T [] ky;
	private V [] value;
	private int count;
	
	public Map(int size) {
		ky = (T[])new  Number[size]; // 2장 Main 인줄 [(double)size] 이렇게 쓰는 건 줄 알았는데 map에서 배열 부분 사이즈를 Number로 바꿔줘야 했엄.
		value = (V[])new Object[size];
		count = 0;
	}//2장 ky = (T[])new Object[size]; 여기에 오즈젝트를 only 숫자만 받을 수 있게  Number로 바꿔줘. 받는건 상관 없지만 오브젝트는 모든 걸 받으니까. 제니릭의 목적을 놓치지마. 제네릭은 혹시모를 이상한 타입들ㅇ르 막는 것이 중요해.
	
	public void push(T key, V value) {
		this.ky[count] = key;
		this.value[count] = value;
		count++;
	}
	
	public V get(T key) {
		for(int i = 0; i < count; ++i)////2 push의 넣어준 값이 같은지 묻는 거구나. 그리고 넣어준 값이 같으면 push에서 넣어준 y값을 출력하는 거고
			if(this.ky[i].equals(key))/// 1 필드의 key 값의 i 번째의 값이 
				return this.value[i];
		return null;
	}
	
	public int size() {
		return count;
	}
	

	
}
