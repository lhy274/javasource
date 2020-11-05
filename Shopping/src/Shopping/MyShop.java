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
		User user1 = new User("홍길동", PayType.CARD);
		User user2 = new User("성춘향", PayType.CASH);
		
		user[0] = user1;
		user[1] = user2;
		*/
		
		user[0] = new User("홍길동", PayType.CARD);
		user[1] = new User("성춘향", PayType.CASH);
	}

	@Override
	public void genProduct() {
		//CellPhone[] = new Product("휴대폰1", );
		products[0] = new CellPhone("아이폰11", 100, "SKT");
		products[1] = new CellPhone("삼성노트", 200, "KT");
		products[2] = new CellPhone("휴대폰3", 300, "LG");
		products[3] = new CellPhone("휴대폰4", 400, "AT&T");
		CellPhone cell = new CellPhone("휴대폰5", 500, "한국통신");
		products[4] = cell;
		products[5] = new SmartTv("LG HD", 1000, "HD");
		products[6] = new SmartTv("대우 Full HD", 2000, "Full HD");
		products[7] = new SmartTv("삼성 스마트", 3000, "4K");
		products[8] = new SmartTv("엘지 스마트", 4000, "8K");
		SmartTv tv = new SmartTv("삼성울트라UHD", 5000, "UHD");
		products[9] = tv;
		
	}

	@Override
	public void start() {
		System.out.println(title+" : 메인화면 - 계정선택");
		System.out.println("=======================");
		
		int i = 0;
		for(User u:user) {
			System.out.printf("[%d] %s(%s)\n", i++, u.getName(), u.getPaytype());
		}
		System.out.println("[x] 종  료");
		System.out.println("선택 : ");
		/*
		scan.nextInt();
		
		System.out.println("## 1선택 ##");
		System.out.println(title+" : 상품 목록 - 상품선택");
		System.out.println("=======================");
		*/
		String input = scan.next();
		
		switch (input) {
		case "0": case "1" :
			System.out.println("### " +input+" 선택 ###");
			selUser = Integer.parseInt(input);
			productList();
			break;
		case "X" :case "x":
			System.out.println("shop을 종료합니다.");
			break;
		default:
			System.out.println("\n입력값을 확인해 주세요\n");
			start();
			break;
		}
				
	}//start END

	public void productList() {
		System.out.println(title+" : 메인화면 - 계정선택");
		System.out.println("=======================");
		
		int i = 0;
		for(Product p:products) {
		 System.out.printf("[%d]", i++);
			p.printDetail();
		}
		System.out.printf("[h] 메인화면");
		System.out.printf("[c] 체크아웃");
		System.out.println("선택 : ");
		
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
			System.out.println("입력값을 확인해 주세요");
			productList();
			break;
		}
	}//productList end
		public void checkout() {
			/*
			System.out.println("선택 : ");
			String input = scan.next();
			System.out.println(title+" : 체크아웃");
			System.out.println("=======================");
			System.out.println(carts);

			System.out.println("=======================");
			System.out.printf("결제 방법 : ");
			System.out.printf("합계 : ");
			System.out.printf("[p]이전, [q]결제 완료");
			System.out.printf("[c] 체크아웃");
			System.out.println("선택 : ");
		*/
			System.out.println(title+" : 체크아웃");
			System.out.println("=======================");
			int i = 0;
			int total = 0;
			for(Product p:carts) {
				System.out.printf("[%d]%s(%s)\n", i++, p.getPname(), p.getPrice());
				total += p.getPrice();
			}
			System.out.println("=======================");
			System.out.println("결제방법 " +user[selUser].getPaytype());			
			System.out.println("[p] 이전 ,[q] 결제 완료");
			System.out.println("선택 : ");
			
			String input = scan.next();
			switch (input) {
			case "p": 
				productList();
				break;
			case "q":
				System.out.println("결제가 완료되었습니다.");
				break;
			default:
				System.out.println("입력값을 확인해 주세요");
				checkout();
				break;
				
			}
		}
		
}


