
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pet dog = new Pet();
		dog.type = "������";
		dog.year = 8;
		dog.Move();
		Pet cat = new Pet();
		cat.type = "�����";
		cat.year = 13;
		cat.Move();

		System.out.println(dog.type + "�� " + dog.year + "���� �Դϴ�");
		System.out.println(cat.type + "�� " + dog.year + "���� �Դϴ�");
		
	}

}
