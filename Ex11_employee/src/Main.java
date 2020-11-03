
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee people5 = new Employee("oh", new Date(2010, 10, 31), "New World", "inturn", 1990);
		people5.displayEmployee();
		
		Employee test = new Employee();
		test.displayEmployee();
		
		//Employee people1 = new Employee("hana", 123, "Seoul", "ceo", 1200);
		//people1.displayEmployee();
		//Employee people2 = new Employee("dul", 456, "Daejeon", "cfo", 1985);
		//Employee people3 = new Employee("set", 789, "Daegu", "c0o", 2020);
		Employee people4 = new Employee();
		people4.setEmployeeId(1011);
		System.out.println(people4.getEmployeeId());		
		
		//System.out.printf("Name : %s - ID : %d - Address : %s - Titles : %s - Entered Year : %d\n", people2.getName(), people2.getEmployeeId(), people2.getAddress(), people2.getFunctionalTitles(), people2.getEnteredYear());
	
	
	
	
	
	
	}

}
