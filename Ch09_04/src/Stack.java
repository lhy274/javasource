
public class Stack < T > implements IStack<T> {
	private T [] v;
	private int count;
	
	public Stack(int size) {
		v = (T[])new Object[size];
		this.count = 0;
	}
	
	public void push(T o) {
		v[count++] = o;
	}
	
	public T pop() {
		return v[--count];
	}
	
	public int size() {
		return count;
	}
	/*
	@Override
	public boolean compareSize(IStack<T> o) {
		// TODO Auto-generated method stub
		return size() > o.size() ? true : false;
	}
	*/
	@Override
	public boolean compareSize(IStack<?> o) {//와일드 카드 <?> 알지 못하는 타입 (unknown 이란 의미를 가짐
		// TODO Auto-generated method stub
		return size() > o.size() ? true : false;
	}

	
}
