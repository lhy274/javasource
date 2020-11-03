
public class Date {
		private int year;
		private int month;
		private int day;
		
		public Date() {
			this.year = 1999;
			this.month = 1;
			this.day = 1;
		}
		
		public Date(int yy, int mm, int dd) {
			setDate(year, month, day);
			System.out.println("Date(int yy, int mm, int dd)");
		}
		
		public void displayDate() {
			System.out.printf("%04d-%02d-%02d\n", year, month, day);
		}
		
		public void setMonth(int mm) {
			month = mm;
		}
		
		public int getMonth() {
			return month;
		}
		/*
		public void setDate(int yy, int mm, int dd) {
			if(yy >= 1999)
				year = yy;
			if(mm > 0 && mm < 13)
				month = mm;
			if(dd > 0 && dd < 32)
				day = dd;
		}
		*/
		public void setDate(int yy, int mm, int dd)  {
			int [] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 
			
		
			year = max(1990, yy);
			month = max(1, mm);
			month = min(12, mm);
			day = max(1, dd);    // 배열 이름이랑 겹쳐서 오류났구나.
			day = min(day, days[month-1]);
			
		}
		
		public int max(int x, int y) {
			if(x > y)
				return x;
			else
				return y;
		}
		public int min(int x, int y) {
			if(x < y)
				return x;
			else
				return y;
		}
		
		
		/*
		public int getDate() { // 이거 안되고 나중에 해보자
			this.year = year;
			this.month = month;
			this.day = day;
			return
		} */
		
		

}
