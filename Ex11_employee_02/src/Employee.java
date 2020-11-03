import java.util.Scanner;

public class Employee {
	private String name;
	private int employeeId;
	private String address;
	private String functionalTitles;
	private int enteredYear;
	private String hobby;
	
	public Employee() {
		name = name;
	}
	public Employee(String name, int employeeId, String functionalTitles, int enteredYear) {
		this.name = name;
		this.employeeId = employeeId;
		this.functionalTitles = functionalTitles;
		this.enteredYear = enteredYear;
	}
	
	public void displayEmployee(String name, int employeeId, String functionalTitles, int enteredYear) {
		System.out.printf("��� �̸� : %s, ��� ��ȣ : %d, ��å : %d, �Ի翬�� : %d", name, employeeId, functionalTitles, enteredYear);
	}
	
	Scanner s = new Scanner(System.in);
	
	String a = "";
	
	public void EmpInput(int i) {	
		do {
			System.out.print("��� ���� �ý����Դϴ�. ���ϴ� �۾��� �����ּ���.\n 1. ��� ���� �Է� 2. ����");
			 i = s.nextInt();
			
			 switch(i) {
			 case(1): {
				 System.out.print("��� ������ �Է��ϼ���.\n ��� �̸� : ");
				 String inputName = s.next();
				 name = inputName;
				 System.out.println();
				 System.out.print("��� ��ȣ : ");
				 int inputEmployeeId = s.nextInt();
				 employeeId = inputEmployeeId;
				 System.out.println();
				 System.out.print("��å : ");
				 String inputFunctionalTitles = s.next();
				 functionalTitles = inputFunctionalTitles;
				 System.out.println();
				 System.out.print("�Ի翬�� : ");
				 int inputEnteredYear = s.nextInt();
				 enteredYear = inputEnteredYear;
				 System.out.println();
				 System.out.println("��� ������ �Է� �Ǿ����ϴ�.");
				 break;
			 }
			
			 case(2): {
				 System.out.println("�����մϴ�.");
				 break;
			 }
			 default:
				 System.out.println("�߸� �Է��ϼ̽��ϴ�");
				 break;
			 }
			
			 for(int k = 0; k < case(1)[k]; k++)  // ���̽� ����ŭ ���ư� ������ ����ϱ�
			 System.out.printf("�̸� : %5s, �����ȣ : %5s, ��å : %5s, �Ի�⵵ : %5s\n", name, employeeId, functionalTitles, enteredYear);
			 
		}while(i != 2);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
