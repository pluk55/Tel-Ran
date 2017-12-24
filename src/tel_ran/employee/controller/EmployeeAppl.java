package tel_ran.employee.controller;

import tel_ran.employee.entity.Employee;

public class EmployeeAppl {

	public static void main(String[] args) {

		Employee vasya = new Employee();
		//vasya.id = 123456789;
		vasya.setId(123456789);
		vasya.setName("Vasya");
		vasya.setSalary(10000);
		vasya.setTaxAllowance(2.25);
		//vasya.setTax(13);
		vasya.calcTaxes();
		vasya.calcSalaryNetto();
		
		Employee petya = new Employee();
		petya.setId(987654321);
		petya.setName("Petya");
		petya.setSalary(8500);
		petya.setTaxAllowance(2.25);
		//petya.setTax(11.5);
		petya.calcTaxes();
		petya.calcSalaryNetto();
		
		// System.out.println(vasya.name + " " + vasya.id);
		vasya.display();
		petya.display();
		
		
	}
	
	
}
