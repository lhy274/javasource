
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date myDate = new Date();  // new ���� �߿��� �ž�!!!
		myDate.displayDate();
		//myDate.setMonth(25);
		//myDate.displayDate();
		//myDate.setDate(1999, 12, 30);
		//myDate.displayDate();
		
		myDate.setDate(1950, 12, 30); //�Ű����� 3��¥�� ������ 
		myDate.displayDate();
		
		myDate.setDate(2500, 156, 100); //month 0���� �ϴϱ� ��������.
		myDate.displayDate();

		
	}

}
