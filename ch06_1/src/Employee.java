
public class Employee {
	private String name;
	private String address;
	private String telno;
	private Date joinDate;

	public Employee() {
		System.out.println("매개변수 없음");
	}
	public Employee(String name, String address, String telno, Date joinDate) {
		this.name = name;
		this.address = address;
		this.telno = telno;
		this.joinDate = joinDate;
		System.out.println("사원 초기화 어떻게 되나 보자");
	}
	
	public void displayEmployee() {
		System.out.printf("이름 : %s, 주소 : %s, 전화번호 : %s, 일사일자 : %s \n",
							name, address, telno, joinDate);
	}
	
	public String getBasicInfo() {
		return String.format("이름 : %s, 주소 : %s",
							name, address);
	}

	public double payCheck() {/// 어거 잘 못 쓰니까 .payCheck 서브클레스랑 main 전부 오류나네.
		return 0;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Employee e = (Employee)obj; // 외에 오브젝트 변수명 빼먹고, Employee 첫 대문자 빼먹고, 오브젝트를 강제형변환해서 임플로이에 집어 넣고 블리안 이퀄을 하자. 결과는 this.d == e.d로 같다고 내보내고. 
		return (this.name == e.name && 
				this.address == e.address && 
				this.telno == e.telno && 
				this.joinDate == e.joinDate);
	}

}


