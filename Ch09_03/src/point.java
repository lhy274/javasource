
public class point implements Comparable<point> { // <T> 부분을 포인터 타입 확인하려고 <point> 타입으로 바꿈. ++ 또한 데이터 타입을 T값을 다 int 값으로 꿈
	private int x;
	private int y;
	
	public point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	/*
	@Override
	public int compareTo(T o) {
		return -1; // -1이면 작은거  +++ 그런데 -1이든 1이든 결과에 영향을 안주는 듯?? 
		//영향 안주는 줄 알았는데 main에서 poit 좌표끼리 크기 비교하는 때 쓰이네 point r2 = Util.max(new point(1000, 2000), new point(100, 200));
		//-1 하면 작은 걸 꺼내고, 1하면 큰거를 꺼내고
	}
	*/
	@Override // 대문자 O를 써줘야함.
	public int compareTo(point o) {
		if(x <= o.x && y <= o.y) return -1;
		if(x == o.x && y == o.y) return 0; // 비교연산자 == 이야. =는 대입연산자임.
		return 1;
	}
	
	
	
	
	
}
