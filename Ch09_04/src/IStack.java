
public interface IStack <T> { //인터페이스 제네릭이고
	void push(T item);
	T pop();
	int size();
	boolean compareSize(IStack<?> o);
}
