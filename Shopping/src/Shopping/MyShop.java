package Shopping;

import java.util.ArrayList;
import java.util.Scanner;

public class MyShop implements IShop {
	
	private String title;
	Product[] products = new Product[10];
	ArrayList<Product> carts = new ArrayList<Product>();
	User user[] = new User[2];
	Scanner scan = new Scanner(System.in);
	
	int selUser;

	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void genUser() {
		/*
		User user1 = new User("ȫ�浿", PayType.CARD);
		User user2 = new User("������", PayType.CASH);
		
		user[0] = user1;
		user[1] = user2;
		*/
		
		user[0] = new User("ȫ�浿", PayType.CARD);
		user[1] = new User("������", PayType.CASH);
	}

	@Override
	public void genProduct() {
		//CellPhone[] = new Product("�޴���1", );
		products[0] = new CellPhone("������11", 100, "SKT");
		products[1] = new CellPhone("�Ｚ��Ʈ", 200, "KT");
		products[2] = new CellPhone("�޴���3", 300, "LG");
		products[3] = new CellPhone("�޴���4", 400, "AT&T");
		CellPhone cell = new CellPhone("�޴���5", 500, "�ѱ����");
		products[4] = cell;
		products[5] = new SmartTv("LG HD", 1000, "HD");
		products[6] = new SmartTv("��� Full HD", 2000, "Full HD");
		products[7] = new SmartTv("�Ｚ ����Ʈ", 3000, "4K");
		products[8] = new SmartTv("���� ����Ʈ", 4000, "8K");
		SmartTv tv = new SmartTv("�Ｚ��Ʈ��UHD", 5000, "UHD");
		products[9] = tv;
		
	}

	@Override
	public void start() {
		System.out.println(title+" : ����ȭ�� - ��������");
		System.out.println("=======================");
		
		int i = 0;
		for(User u:user) {
			System.out.printf("[%d] %s(%s)\n", i++, u.getName(), u.getPaytype());
		}
		System.out.println("[x] ��  ��");
		System.out.println("���� : ");
		/*
		scan.nextInt();
		
		System.out.println("## 1���� ##");
		System.out.println(title+" : ��ǰ ��� - ��ǰ����");
		System.out.println("=======================");
		*/
		String input = scan.next();
		
		switch (input) {
		case "0": case "1" :
			System.out.println("### " +input+" ���� ###");
			selUser = Integer.parseInt(input);
			productList();
			break;
		case "X" :case "x":
			System.out.println("shop�� �����մϴ�.");
			break;
		default:
			System.out.println("\n�Է°��� Ȯ���� �ּ���\n");
			start();
			break;
		}
				
	}//start END

	public void productList() {
		System.out.println(title+" : ����ȭ�� - ��������");
		System.out.println("=======================");
		
		int i = 0;
		for(Product p:products) {
		 System.out.printf("[%d]", i++);
			p.printDetail();
		}
		System.out.printf("[h] ����ȭ��");
		System.out.printf("[c] üũ�ƿ�");
		System.out.println("���� : ");
		
		String input = scan.next();
		
		switch (input) {
		case "h": 
			start();
			break;
		case "c":
			checkout();
			break;
		case "0":case "1":case "2":case "3":
		case "4":case "5":case "6":case "7":
		case "8":case "9":
			carts.add(products[Integer.parseInt(input)]);
			productList();
			break;
		default:
			System.out.println("�Է°��� Ȯ���� �ּ���");
			productList();
			break;
		}
	}//productList end
		public void checkout() {
			/*
			System.out.println("���� : ");
			String input = scan.next();
			System.out.println(title+" : üũ�ƿ�");
			System.out.println("=======================");
			System.out.println(carts);

			System.out.println("=======================");
			System.out.printf("���� ��� : ");
			System.out.printf("�հ� : ");
			System.out.printf("[p]����, [q]���� �Ϸ�");
			System.out.printf("[c] üũ�ƿ�");
			System.out.println("���� : ");
		*/
			System.out.println(title+" : üũ�ƿ�");
			System.out.println("=======================");
			int i = 0;
			int total = 0;
			for(Product p:carts) {
				System.out.printf("[%d]%s(%s)\n", i++, p.getPname(), p.getPrice());
				total += p.getPrice();
			}
			System.out.println("=======================");
			System.out.println("������� " +user[selUser].getPaytype());			
			System.out.println("[p] ���� ,[q] ���� �Ϸ�");
			System.out.println("���� : ");
			
			String input = scan.next();
			switch (input) {
			case "p": 
				productList();
				break;
			case "q":
				System.out.println("������ �Ϸ�Ǿ����ϴ�.");
				break;
			default:
				System.out.println("�Է°��� Ȯ���� �ּ���");
				checkout();
				break;
				
			}
		}
		
}


