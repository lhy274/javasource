package Shopping;

import java.util.ArrayList;
import java.util.Scanner;

public class MyShop implements IShopping {
	//User [] users = new User[2];//1. �� ���� User Ŭ������ ��� �� ����� ����.
	User [] users = new User[2]; //3. Ŭ���� ����� ���ϱ� ���������//10. �̰͵� ���� ��� �迭�̱��� �׷��� �Ʒ��ʰŸ� �ִµ�?? �� �ƴ϶�?? �´µ�?
	Product [] products = new Product[10];//2. Ŭ������ ����� ���� ���� �� �־���
	ArrayList<Product> carts = new ArrayList<Product>();
	Scanner s = new Scanner(System.in); //11. s scan �̰� �ΰ� �� �������̿����� //12. �� �̰� ��ĳ�� ���� ��.
	int selUser;
	private String title;//4. �̰� ���ο��� ���� �ʵ� ������
	
	@Override
	public void setTitle(String title) {
		this.title = title;

	}

	@Override
	public void genUser() {
		User user1 = new User("��1", PayType.CARD);//5. ����� �޼��� ���� �ű��� �׳� ���� �ȵǳ�. �׳ɴ� ���� Ŭ������ �׳� ���� ��. �ٸ� Ŭ�����ϱ� �ּҸ� ������ ��������.
		//6. [] �迭�̱� ������ ������ ���� �迭 �Ȥ��±���///||7. �װ� �ƴ϶� �̰� ���� Ŭ�������� ������ �Ű�, �迭�� �ҰŴ� �� ũ���� ���� �����ϴ� ����.
		users[1] = new User("��2", PayType.CASH);// 8. ó������ �迭�� �ƴ϶�. �迭�� Ŭ������ ������ ���� new �ν��Ͻ����� �־��ִ� �ű���.
		//9. �迭�� �� �Է���. Ŭ������ �����ϰ� ���߿� ���Է��� �ϴ� ��.
		users[0] = user1;
	}

	@Override
	public void genProduct() {
		products[0] = new CellPhone("������", 1, "sk");
		products[1] = new SmartTv("�Ｚ full hd", 2, "full hd");
	}

	@Override
	public void start() {
		int i = 0;
		for(User a: users)
			System.out.printf("���� : %d, �� : %s(%s)", i++, a.getName(), a.getPayType());
		
		String num = s.next(); // char num  �ؼ� �ҷ��� �ߴµ� �ȵǳ�.
		
		System.out.println(num + " �����̽��ϴ�.");
		
		switch (num) {// �̰� ��¥ ��ǰ �����̱⵵ ������ ������ ���� �����ϰ� 
		case "0": case "1":
			System.out.println("��Ϲ�ȣ" + num + "�ݰ����ϴ�.");
			selUser = Integer.parseInt(num); // �̰� �� ���Գ� �Ľ���Ʈ��
			productList();
			break;
		case "x":case "X":
			System.out.println("�����ư�� �����̽��ϴ�.");
			break;
		default:
			System.out.println("���� �����Դϴ�. �ٽ� Ȯ�����ּ���.");
			break;
		}
		
		
	}//start() end

	
	void productList() { // ���⼭ ��ĳ�ʰ� �ʿ� ���� ������ ������ ������ �Ἥ �׷�����
		int k = 0;
		for(Product c:products) {
			System.out.printf("[%d]", k++);//printDetail ���ڰ� �ִ� �� �ƴϴϱ�. products�� �迭�� ���� �� ���̰�
			c.printDetail();// ó���� �迭�� ���� �̷��� �̴� �� �� �Ƹ����.
		}

		String check = s.next();
		
		switch (check) { // ��ٱ��ϱ��� // ��ٱ��Ϸ��� �ٸ� checkout �޼ҵ�� ���� ��
		case "0":case "1":case "2":case "3":
		case "4":case "5":case "6":case "7":
		case "8":case "9":
			carts.add(products[Integer.parseInt(check)]); //carts�� ArrayList �迭�̶� ArrayList �ȿ� �ִ� �޼ҵ� ������ �� �� ����
			//�迭�� ����ġ��(������ ����� ����) �������� �ϳ��� Array�迭�� ������
			//products[Integer.parseInt(check)] - products�� �迭�� ��ȣ �κ��� �����ϴ� ���� �׷��� �� �ٷ� check�� �ȵǴ� ����??
			productList();
			break;

		default:// �ٸ� �� ������ �ϴ� ����� ������.
			productList();
			break;
		}
		
		
		
	}//productList end
	
	void checkout() {
		for(che a:carts)
			System.out.println(a.carts);
	}

	
	
	
}//MyShop end

