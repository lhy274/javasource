
public class point implements Comparable<point> { // <T> �κ��� ������ Ÿ�� Ȯ���Ϸ��� <point> Ÿ������ �ٲ�. ++ ���� ������ Ÿ���� T���� �� int ������ ��
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
		return -1; // -1�̸� ������  +++ �׷��� -1�̵� 1�̵� ����� ������ ���ִ� ��?? 
		//���� ���ִ� �� �˾Ҵµ� main���� poit ��ǥ���� ũ�� ���ϴ� �� ���̳� point r2 = Util.max(new point(1000, 2000), new point(100, 200));
		//-1 �ϸ� ���� �� ������, 1�ϸ� ū�Ÿ� ������
	}
	*/
	@Override // �빮�� O�� �������.
	public int compareTo(point o) {
		if(x <= o.x && y <= o.y) return -1;
		if(x == o.x && y == o.y) return 0; // �񱳿����� == �̾�. =�� ���Կ�������.
		return 1;
	}
	
	
	
	
	
}
