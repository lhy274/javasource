
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Pet.getCount()); // 	처음에 Pet.count++; 없이 했을 때 0 뜬 거랑 같네

		Pet dog = new Pet();
		dog.setType("강아지");
		dog.setYear(8);
		Pet.count++;
		dog.Move();
		Pet cat = new Pet();
		cat.setType("고양이");
		cat.setYear(13);
		cat.Move();
		Pet.count++;
		Pet lion = new Pet();
		Pet.count++;

		Pet.getCount();
		
		System.out.println(dog.getType() + "는 " + dog.getYear() + "개월 입니다");
		System.out.println(cat.getType() + "는 " + cat.getYear() + "개월 입니다");
		System.out.println(lion.getType() + "는 " + lion.getYear() + "개월 입니다");
		System.out.println(Pet.getCount());
		
	}

}
