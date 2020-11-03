package Shopping;

public class User {
	private String name;
	private PayType paytype;
	public User(String name, PayType paytype) {
		this.name = name;
		this.paytype = paytype;
	}
	public String getName() {
		return name;
	}
	public PayType getPaytype() {
		return paytype;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPaytype(PayType paytype) {
		this.paytype = paytype;
	}
}
