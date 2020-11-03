
public class Car {
		private String color;
		private int speed;

		public Car() {   // 생성자는 메소드야 메서드에서의 끝에()를 놓치지마.
			color = "Blue";
			speed = 5;
		}
		public Car(int speed) { /// 대문자!!!!!! 클래스 이름이 같아야함.///2-4 하나씩 있는 것들은 생성자가 안먹히고 초기화 값을 먹네
			this.color = color;
			this.speed = speed;
		}
		
		public Car(String color) { //매개변수에 필드 이름 아닌 걸 쓰면 null값 나옴. 초기화 안 먹는듯. 카4 green이라 필터 걸린듯.
			this.color = color;
			this.speed = speed;
		}
		
		public Car(String color, int speed) {
			this.color = color;
			this.speed = speed;
		}
		
		public void upSpeed(int value) {   ///업 다운 빼고 value라거나 매겨변수 이름을 바꾸지 안ㄶ고 color썼네.. 음. 확인필요.// value라고 적용안하면 안되네..결과값 입력이 안되는듯
			if(speed + value > 200) 
				speed = 200;
			else
				speed += value;
			System.out.printf("%d\n", getSpeed());
		}
		
		public void downSpeed(int value) {
			if(speed - value < 0) 
				speed = 0;
			else
				speed -= value;
			System.out.println(getSpeed());
		}
		
		public void setColor(String color) {
			if(color.equals("red") || color.equals("blue") || color.equals("yellow"))
			this.color = color;
		}
		
		public void setSpeed(int speed) {
			this.speed = speed;
		}
		
		public String getColor() {
			return color;
		}
		
		public int getSpeed() {
			return speed;
		}
}
