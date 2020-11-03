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
		RegularEmployee res = new RegularEmployee(); // �̸� : null, �ּ� : null, ��ȭ��ȣ : null, �ϻ����� : null 
		res.displayEmployee();
		
		public Employee() {  // super Ŭ������ �Ű����� ���� �����ڰ� ������ �Ʒ��� �� ����.
		public RegularEmployee() { //super Ŭ������ �Ű����� ���� �����ڰ� ������ sub �� ����.
		*/
		
		
		Date joinDate = new Date(2020, 1, 1);  // �̰� ������ �ʱ�ȭ �� �� �����±���.
		RegularEmployee re = new RegularEmployee("����", "�����", "123-4567", joinDate, 3000000);
		re.displayEmployee();
		double salary = re.payCheck();
		System.out.printf("�޿��� : %.0f ��\n", salary);
		
		Employee e = new RegularEmployee("e��", "e�����", "e123-4567", joinDate, 3000000);    // (short)3000000 �ߴµ� ��. �޿��� : -14656 ��
		e.displayEmployee();
		
		RegularEmployee re1 = new RegularEmployee("����", "���ֽ�", "891-2345", joinDate, 4000000);
		RegularEmployee re2 = new RegularEmployee("���", "�ߺ�", "678-9123", joinDate, 5000000);
		
		String basicInfo1 = re1.getBasicInfo();
		System.out.println(basicInfo1);
		
		String basicInfo2 = re2.getBasicInfo();
		salary = re2.payCheck();///�̰� ���� �̻��ҵ�///������. ���ο� �ν��Ͻ������ �����.
		System.out.println(basicInfo2 + " " + salary);
		
		
		TemporaryEmployee te = new TemporaryEmployee("���", "��õ��", "345-6789", joinDate, 100000);
		te.displayEmployee();
		te.setWorkHours(60); //te.workHour = 60; ������ �ʵ忡 ���� ���Է��ε� ������ set�ذ���.
		salary = te.payCheck();///�̰� ���� �߸��ఢ�߱��� ������ Ÿ���� �ٿ��� �������ž�.
		System.out.printf("�޿��� : %.0f ��\n", salary);
		
		SalesEmployee se = new SalesEmployee("���", "������", "123-4567", joinDate, 1000000, 0.01);
		te.displayEmployee();
		se.setSeles(150000000);
		salary = se.payCheck();
		System.out.printf("�޿��� : %.0f ��\n", salary);///�̰� �޿��� ���� �������µ� �ٿ��� �����°Ŷ� ������ �Ŷ� ��� ��ġ��?
		
		Department dept = new Department();
		dept.addEmployee(re);
		dept.addEmployee(re1);
		dept.addEmployee(re2);
		dept.addEmployee(te);
		dept.addEmployee(se);
		dept.display();//������ ���÷��� ���÷��� \n ������ �ſ�����
		
		
		RegularEmployee re3 = new RegularEmployee("����", "�����", "123-4567", joinDate, 3000000);
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
		System.out.printf("�޿��� : %.0f ��\n", salary);
		
		RegularEmployee re5 = (RegularEmployee)e;
		salary = re5.payCheck();
		System.out.printf("�޿��� : %.0f ��\n", salary);
		
		
		Employee ee = new Employee("ee��", "�����", "123-4567", joinDate);
		
		//RegularEmployee re7 = (RegularEmployee)ee; �̰� ��������. �ν���Ʈ ��ü�� ("ee��", "�����", "123-4567", joinDate) ����� �ϸ� �����Ǽ� �׷��ٰ� �Ͻŵ�.
		
		RegularDepart rd = new RegularDepart();
		rd.addRegularEmp(re1);
		rd.addRegularEmp(re2);
		//rd.addRegularEmp(ee); superŬ������ �ȵ�.
		//rd.addRegularEmp((RegularEmployee)ee); ��������. ������ ĳ������ �ȵǴµ�
		//rd.addRegularEmp(re7); ĳ���� �ɾ��൵ ��������.
		///rd.addRegularEmp(te); ���÷��̸� ���ؼ� ���� ������ �ƴ϶� �ȵ�.
		rd.addRegularEmp(se); // se�� ���� Ŭ������ ��.
		//rd.addRegularEmp(re7);
		rd.displays();
		
		
		
		
		
		
		
		

	}	

}
