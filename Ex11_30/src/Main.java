
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pet dog = new Pet();
		dog.setType("������");
		dog.setYear(8);
		dog.Move();
		Pet cat = new Pet();
		cat.setType("�����");
		cat.setYear(13);
		cat.Move();

		System.out.println(dog.getType() + "�� " + dog.getYear() + "���� �Դϴ�");
		System.out.println(cat.getType() + "�� " + cat.getYear() + "���� �Դϴ�");
		
	}

}
