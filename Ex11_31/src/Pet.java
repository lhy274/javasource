
public class Pet {
	private String type;
	private int year;
	static int count = 0;
	
	static int getCount() {
		return count;
	}

	public Pet() {
		type = "running";
		year = 100;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	public int getYear() {
		return year;
	}
	
	void petType(String value) {
		type += value;
	}

	void Move() {
		System.out.println(this.type + "가 움직입니다");
	}
	

}
