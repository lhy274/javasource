
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Pet.getCount()); // 	ó���� Pet.count++; ���� ���� �� 0 �� �Ŷ� ����

		Pet dog = new Pet();
		dog.setType("������");
		dog.setYear(8);
		Pet.count++;
		dog.Move();
		Pet cat = new Pet();
		cat.setType("�����");
		cat.setYear(13);
		cat.Move();
		Pet.count++;
		Pet lion = new Pet();
		Pet.count++;

		Pet.getCount();
		
		System.out.println(dog.getType() + "�� " + dog.getYear() + "���� �Դϴ�");
		System.out.println(cat.getType() + "�� " + cat.getYear() + "���� �Դϴ�");
		System.out.println(lion.getType() + "�� " + lion.getYear() + "���� �Դϴ�");
		System.out.println(Pet.getCount());
		
	}

}
