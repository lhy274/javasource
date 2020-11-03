package Shopping;

import java.util.ArrayList;
import java.util.Scanner;

public class MyShop implements IShopping {
	//User [] users = new User[2];//1. 아 아직 User 클래스가 없어서 못 만드는 구나.
	User [] users = new User[2]; //3. 클래스 만들고 나니까 만들어지네//10. 이것도 유저 기반 배열이구나 그래서 아래쪽거를 넣는듯?? 이 아니라?? 맞는듯?
	Product [] products = new Product[10];//2. 클래스를 만들엇 놔서 만들 수 있었네
	ArrayList<Product> carts = new ArrayList<Product>();
	Scanner scan = new Scanner(System.in);
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
		// TODO Auto-generated method stub
		for(product a: products)
			System.out.println(printDetail);
	}

}

