
public class Car {
		private String color;
		private int speed;

		public Car() {   // �����ڴ� �޼ҵ�� �޼��忡���� ����()�� ��ġ����.
			color = "Blue";
			speed = 5;
		}
		public Car(int speed) { /// �빮��!!!!!! Ŭ���� �̸��� ���ƾ���.///2-4 �ϳ��� �ִ� �͵��� �����ڰ� �ȸ����� �ʱ�ȭ ���� �Գ�
			this.color = color;
			this.speed = speed;
		}
		
		public Car(String color) { //�Ű������� �ʵ� �̸� �ƴ� �� ���� null�� ����. �ʱ�ȭ �� �Դµ�. ī4 green�̶� ���� �ɸ���.
			this.color = color;
			this.speed = speed;
		}
		
		public Car(String color, int speed) {
			this.color = color;
			this.speed = speed;
		}
		
		public void upSpeed(int value) {   ///�� �ٿ� ���� value��ų� �Űܺ��� �̸��� �ٲ��� �Ȥ��� color���.. ��. Ȯ���ʿ�.// value��� ������ϸ� �ȵǳ�..����� �Է��� �ȵǴµ�
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
