package Shopping;

import java.util.ArrayList;
import java.util.Scanner;

public class MyShop implements IShopping {
	//User [] users = new User[2];//1. �� ���� User Ŭ������ ��� �� ����� ����.
	User [] users = new User[2]; //3. Ŭ���� ����� ���ϱ� ���������//10. �̰͵� ���� ��� �迭�̱��� �׷��� �Ʒ��ʰŸ� �ִµ�?? �� �ƴ϶�?? �´µ�?
	Product [] products = new Product[10];//2. Ŭ������ ����� ���� ���� �� �־���
	ArrayList<Product> carts = new ArrayList<Product>();
	Scanner scan = new Scanner(System.in);
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
		// TODO Auto-generated method stub
		for(product a: products)
			System.out.println(printDetail);
	}

}

