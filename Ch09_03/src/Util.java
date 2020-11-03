/*
public class Util {
	static <T extends Comparable<T>> T min(T x, T y) {
		//if(x < y)
		if(x.compareTo(y) < 0)  //1-3 = -2가 0보다 작으니까 작은수인 1반환 
			return x;
		return y;
	}
}

*/


public class Util {//이거 메서트 오버라이딩이구나. 그리고 스태틱은 그 클래스 모두 적용되는 아이고 특정 이름이 아니라 클래스 이름으로 넣어줄 수 있어.
	static < T extends Comparable<T>> T max(T x, T y) {  // <T>> 이거 안해서 오류남.
			if(x.compareTo(y) > 0)
				return x;
			return y;
			//x.compareTo(y) > 0 ? x : y;  ///두개가 같은거야. x가 크면 x반환 x가 작으면 y가 큰거니까 y반환
		}
}

