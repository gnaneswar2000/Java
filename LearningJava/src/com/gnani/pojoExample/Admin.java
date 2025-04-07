package com.gnani.pojoExample;

public class Admin {

	public static void main(String[] args) throws Exception {

		try {
			Employee e1 = new Employee();
			e1.setId(101);
			e1.setName("Gnani");
			e1.setSalary(10000);

			Employee e2 = new Employee();
			e2.setId(102);
			e2.setName("Keerthi");
			e2.setSalary(20000);

			Employee e3 = new Employee();
			e3.setId(103);
			e3.setName("Manoj");
			e3.setSalary(30000);

			Employee e4 = new Employee();
			e4.setId(104);
			e4.setName("Bittu");
			e4.setSalary(40000);

			Employee[] emp = new Employee[] { e1, e2, e3, e4 };
			int temp = 0;
			for (Employee i : emp) {
				temp += i.getSalary();
			}
			System.out.println("Overall Salary: " + temp);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
