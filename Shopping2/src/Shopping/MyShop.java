package Shopping;

import java.util.ArrayList;
import java.util.Scanner;

public class MyShop implements IShopping {
	//User [] users = new User[2];//1. 아 아직 User 클래스가 없어서 못 만드는 구나.
	User [] users = new User[2]; //3. 클래스 만들고 나니까 만들어지네//10. 이것도 유저 기반 배열이구나 그래서 아래쪽거를 넣는듯?? 이 아니라?? 맞는듯?
	Product [] products = new Product[10];//2. 클래스를 만들엇 놔서 만들 수 있었네
	ArrayList<Product> carts = new ArrayList<Product>();
	Scanner s = new Scanner(System.in); //11. s scan 이거 두개 다 변수명이였구나 //12. 아 이거 스캐너 시작 말.
	int selUser;
	private String title;//4. 이건 내부에서 쓰는 필드 같은데
	
	@Override
	public void setTitle(String title) {
		this.title = title;

	}

	@Override
	public void genUser() {
		User user1 = new User("고객1", PayType.CARD);//5. 상수는 메서드 같은 거구나 그냥 오면 안되네. 그냥느 같은 클래스만 그냥 오는 듯. 다른 클래스니까 주소를 닷으로 찍어줘야지.
		//6. [] 배열이긴 하지만 생성할 때는 배열 안ㅆ는구나///||7. 그게 아니라 이건 유저 클래스에서 가져온 거고, 배열로 할거는 이 크래스 값을 대입하는 거지.
		users[1] = new User("고객2", PayType.CASH);// 8. 처음부터 배열이 아니라. 배열에 클래스의 새로이 생긴 new 인스턴스값을 넣어주는 거구나.
		//9. 배열의 값 입력임. 클래스로 생성하고 나중에 값입력을 하는 거.
		users[0] = user1;
	}

	@Override
	public void genProduct() {
		products[0] = new CellPhone("아이폰", 1, "sk");
		products[1] = new SmartTv("삼성 full hd", 2, "full hd");
	}

	@Override
	public void start() {
		int i = 0;
		for(User a: users)
			System.out.printf("순서 : %d, 고객 : %s(%s)", i++, a.getName(), a.getPayType());
		
		String num = s.next(); // char num  해서 할려고 했는데 안되네.
		
		System.out.println(num + " 누르셨습니다.");
		
		switch (num) {// 이건 진짜 제품 설명이기도 하지만 그전에 유저 선택하고 
		case "0": case "1":
			System.out.println("등록번호" + num + "반갑습니다.");
			selUser = Integer.parseInt(num); // 이거 또 나왔네 파스인트랑
			productList();
			break;
		case "x":case "X":
			System.out.println("종료버튼을 누르셨습니다.");
			break;
		default:
			System.out.println("없는 선택입니다. 다시 확인해주세요.");
			break;
		}
		
		
	}//start() end

	
	void productList() { // 여기서 스캐너가 필요 없는 이유가 위에서 가져다 써서 그렇구나
		int k = 0;
		for(Product c:products) {
			System.out.printf("[%d]", k++);//printDetail 숫자가 있는 건 아니니까. products는 배열에 넣은 것 뿐이고
			c.printDetail();// 처음에 배열로 만들어서 이렇게 뽑는 게 참 아름답네.
		}

		String check = s.next();
		
		switch (check) { // 장바구니구나 // 장바구니래서 다른 checkout 메소드로 빠진 줄
		case "0":case "1":case "2":case "3":
		case "4":case "5":case "6":case "7":
		case "8":case "9":
			carts.add(products[Integer.parseInt(check)]); //carts는 ArrayList 배열이라서 ArrayList 안에 있는 메소드 가져다 쓸 수 있지
			//배열을 스위치문(끝남의 기약이 없는) 돌때마다 하나씩 Array배열에 저장해
			//products[Integer.parseInt(check)] - products의 배열의 번호 부분을 저장하는 거지 그런데 왜 바로 check가 안되는 거지??
			productList();
			break;

		default:// 다른 걸 눌러도 일단 목록을 보여줘.
			productList();
			break;
		}
		
		
		
	}//productList end
	
	void checkout() {
		for(che a:carts)
			System.out.println(a.carts);
	}

	
	
	
}//MyShop end

