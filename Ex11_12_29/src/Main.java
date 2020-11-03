
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pet dog = new Pet();
		dog.type = "강아지";
		dog.year = 8;
		dog.Move();
		Pet cat = new Pet();
		cat.type = "고양이";
		cat.year = 13;
		cat.Move();

		System.out.println(dog.type + "는 " + dog.year + "개월 입니다");
		System.out.println(cat.type + "는 " + dog.year + "개월 입니다");
		
	}

}
