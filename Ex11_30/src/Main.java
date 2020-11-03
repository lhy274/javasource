
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pet dog = new Pet();
		dog.setType("강아지");
		dog.setYear(8);
		dog.Move();
		Pet cat = new Pet();
		cat.setType("고양이");
		cat.setYear(13);
		cat.Move();

		System.out.println(dog.getType() + "는 " + dog.getYear() + "개월 입니다");
		System.out.println(cat.getType() + "는 " + cat.getYear() + "개월 입니다");
		
	}

}
