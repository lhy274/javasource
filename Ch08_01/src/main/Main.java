package main;
import common.Date;
import dapt.*;
import employee.Employee;
import employee.RegularEmployee;
import employee.SalesEmployee;
import employee.TemporaryEmployee;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		RegularEmployee res = new RegularEmployee(); // 이름 : null, 주소 : null, 전화번호 : null, 일사일자 : null 
		res.displayEmployee();
		
		public Employee() {  // super 클래스의 매개변수 없는 생성자가 없으면 아래도 못 만듦.
		public RegularEmployee() { //super 클래스의 매개변수 없는 생성자가 없으면 sub 못 만듦.
		*/
		
		
		Date joinDate = new Date(2020, 1, 1);  // 이거 없으면 초기화 값 안 나오는구나.
		RegularEmployee re = new RegularEmployee("김일", "서울시", "123-4567", joinDate, 3000000);
		re.displayEmployee();
		double salary = re.payCheck();
		System.out.printf("급여액 : %.0f 원\n", salary);
		
		Employee e = new RegularEmployee("e일", "e서울시", "e123-4567", joinDate, 3000000);    // (short)3000000 했는데 됨. 급여액 : -14656 원
		e.displayEmployee();
		
		RegularEmployee re1 = new RegularEmployee("김이", "제주시", "891-2345", joinDate, 4000000);
		RegularEmployee re2 = new RegularEmployee("김삼", "중북", "678-9123", joinDate, 5000000);
		
		String basicInfo1 = re1.getBasicInfo();
		System.out.println(basicInfo1);
		
		String basicInfo2 = re2.getBasicInfo();
		salary = re2.payCheck();///이거 뭔가 이상할듯///수정함. 새로운 인스턴스만든거 지운거.
		System.out.println(basicInfo2 + " " + salary);
		
		
		TemporaryEmployee te = new TemporaryEmployee("김사", "인천시", "345-6789", joinDate, 100000);
		te.displayEmployee();
		te.setWorkHours(60); //te.workHour = 60; 했으면 필드에 직접 값입력인데 막혀서 set준거지.
		salary = te.payCheck();///이거 내가 잘못행각했구나 테이터 타입을 붙여서 오류난거야.
		System.out.printf("급여액 : %.0f 원\n", salary);
		
		SalesEmployee se = new SalesEmployee("김오", "강원시", "123-4567", joinDate, 1000000, 0.01);
		te.displayEmployee();
		se.setSeles(150000000);
		salary = se.payCheck();
		System.out.printf("급여액 : %.0f 원\n", salary);///이거 급여액 따로 떨어지는데 붙여나 나오는거랑 떨어진 거랑 어떻게 합치지?
		
		Department dept = new Department();
		dept.addEmployee(re);
		dept.addEmployee(re1);
		dept.addEmployee(re2);
		dept.addEmployee(te);
		dept.addEmployee(se);
		dept.display();//나오는 임플로이 디스플레이 \n 안해준 거였ㅇㅁ
		
		
		RegularEmployee re3 = new RegularEmployee("김일", "서울시", "123-4567", joinDate, 3000000);
		re.displayEmployee();
		re3.displayEmployee();
		if(re == re3)
			System.out.println("==");
		else
			System.out.println("!=");
		if(re.equals(re3))
			System.out.println("equals");
		else
			System.out.println("!equals");
		
		String str1 = "I love you";
		String str2 = new String("I love you");
		if(str1 == str2)
			System.out.println("==");
		else
			System.out.println("!=");
		if(str1.equals(str2))
			System.out.println("equals");
		else
			System.out.println("!equals");
		
		RegularEmployee re6 = se;
		salary = re6.payCheck();
		System.out.printf("급여액 : %.0f 원\n", salary);
		
		RegularEmployee re5 = (RegularEmployee)e;
		salary = re5.payCheck();
		System.out.printf("급여액 : %.0f 원\n", salary);
		
		
		Employee ee = new Employee("ee일", "서울시", "123-4567", joinDate);
		
		//RegularEmployee re7 = (RegularEmployee)ee; 이거 에러나네. 인스턴트 자체가 ("ee일", "서울시", "123-4567", joinDate) 일허게 하면 생성되서 그렇다고 하신듯.
		
		RegularDepart rd = new RegularDepart();
		rd.addRegularEmp(re1);
		rd.addRegularEmp(re2);
		//rd.addRegularEmp(ee); super클래스라 안됨.
		//rd.addRegularEmp((RegularEmployee)ee); 오류나네. 참조값 캐스팅은 안되는듯
		//rd.addRegularEmp(re7); 캐스팅 걸어줘도 에러나네.
		///rd.addRegularEmp(te); 임플로이를 안해서 상위 개념이 아니라 안됨.
		rd.addRegularEmp(se); // se는 서브 클래스라 돔.
		//rd.addRegularEmp(re7);
		rd.displays();
		
		
		
		
		
		
		
		

	}	

}
