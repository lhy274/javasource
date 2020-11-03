
public class Employee {
	private String name;
	private String address;
	private String telno;
	private Date joinDate;

	public Employee() {
		System.out.println("�Ű����� ����");
	}
	public Employee(String name, String address, String telno, Date joinDate) {
		this.name = name;
		this.address = address;
		this.telno = telno;
		this.joinDate = joinDate;
		System.out.println("��� �ʱ�ȭ ��� �ǳ� ����");
	}
	
	public void displayEmployee() {
		System.out.printf("�̸� : %s, �ּ� : %s, ��ȭ��ȣ : %s, �ϻ����� : %s \n",
							name, address, telno, joinDate);
	}
	
	public String getBasicInfo() {
		return String.format("�̸� : %s, �ּ� : %s",
							name, address);
	}

	public double payCheck() {/// ��� �� �� ���ϱ� .payCheck ����Ŭ������ main ���� ��������.
		return 0;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Employee e = (Employee)obj; // �ܿ� ������Ʈ ������ ���԰�, Employee ù �빮�� ���԰�, ������Ʈ�� ��������ȯ�ؼ� ���÷��̿� ���� �ְ� ���� ������ ����. ����� this.d == e.d�� ���ٰ� ��������. 
		return (this.name == e.name && 
				this.address == e.address && 
				this.telno == e.telno && 
				this.joinDate == e.joinDate);
	}

}


