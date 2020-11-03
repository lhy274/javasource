
public class Employee {
		
		private String name;
		private int employeeId;
		private String address;
		private String functionalTitles;
		private int enteredYear;
		private String hobby;
		
		public Employee() {
			
		}
		public Employee(String nn, Date ee, String aa, String ff, int ey) {
			name = nn;
			this.employeeId = employeeId;
			address = aa;
			functionalTitles = ff;
			enteredYear = 2010;
		}
		
		public void setEnteredYear(int ey) {  /// 2000년 이후으 사원명부인 거지...
			if(ey >= 2000)
			this.enteredYear = ey;
		}
		
		public void displayEmployee() {
			System.out.printf("Name : %s - ID : %d - Address : %s - Titles : %s - Entered Year : %d\n",
								name, employeeId, address, functionalTitles, enteredYear);
		}
		
		public void setHobby(String hobby) {
			this.hobby = hobby;
		}
		public String getName() {
			return name;
		}
	
		public int getEmployeeId() {
			return employeeId;
		}
	
		public String getAddress() {
			return address;
		}
	
		public String getFunctionalTitles() {
			return functionalTitles;
		}
	
		public int getEnteredYear() {
			return enteredYear;
		}
	
		public void setName(String name) {
			this.name = name;
		}
	
		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
		}
	
		public void setAddress(String address) {
			this.address = address;
		}
	
		public void setFunctionalTitles(String functionalTitles) {
			this.functionalTitles = functionalTitles;
		}

	
	

}