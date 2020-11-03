
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date myDate = new Date();  // new 가장 중요한 거야!!!
		myDate.displayDate();
		//myDate.setMonth(25);
		//myDate.displayDate();
		//myDate.setDate(1999, 12, 30);
		//myDate.displayDate();
		
		myDate.setDate(1950, 12, 30); //매개변수 3개짜리 생성자 
		myDate.displayDate();
		
		myDate.setDate(2500, 156, 100); //month 0으로 하니까 오류났네.
		myDate.displayDate();

		
	}

}
