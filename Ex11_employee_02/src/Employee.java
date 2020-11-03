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
		System.out.printf("사원 이름 : %s, 사원 번호 : %d, 직책 : %d, 입사연도 : %d", name, employeeId, functionalTitles, enteredYear);
	}
	
	Scanner s = new Scanner(System.in);
	
	String a = "";
	
	public void EmpInput(int i) {	
		do {
			System.out.print("사원 관리 시스템입니다. 원하는 작업을 눌러주세요.\n 1. 사원 정보 입력 2. 종료");
			 i = s.nextInt();
			
			 switch(i) {
			 case(1): {
				 System.out.print("사원 정보를 입력하세요.\n 사원 이름 : ");
				 String inputName = s.next();
				 name = inputName;
				 System.out.println();
				 System.out.print("사원 번호 : ");
				 int inputEmployeeId = s.nextInt();
				 employeeId = inputEmployeeId;
				 System.out.println();
				 System.out.print("직책 : ");
				 String inputFunctionalTitles = s.next();
				 functionalTitles = inputFunctionalTitles;
				 System.out.println();
				 System.out.print("입사연도 : ");
				 int inputEnteredYear = s.nextInt();
				 enteredYear = inputEnteredYear;
				 System.out.println();
				 System.out.println("모든 정보가 입력 되었습니다.");
				 break;
			 }
			
			 case(2): {
				 System.out.println("종료합니다.");
				 break;
			 }
			 default:
				 System.out.println("잘못 입력하셨습니다");
				 break;
			 }
			
			 for(int k = 0; k < case(1)[k]; k++)  // 케이스 문만큼 돌아간 다음에 출력하기
			 System.out.printf("이름 : %5s, 사원번호 : %5s, 직책 : %5s, 입사년도 : %5s\n", name, employeeId, functionalTitles, enteredYear);
			 
		}while(i != 2);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
