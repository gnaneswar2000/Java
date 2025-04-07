package com.gnani.pojoExample;

public class Admin {

	public static void main(String[] args) throws Exception {

		try {
			Employee e1 = new Employee();
			e1.setId(101);
			e1.setName("Modi");
			e1.setSalary(55555.55);
			e1.setCountry("Bharath");

			Employee e2 = new Employee();
			e2.setId(102);
			e2.setName("Trump");
			e2.setSalary(66666.66);
			e2.setCountry("USA");


			Employee e3 = new Employee();
			e3.setId(103);
			e3.setName("Rahul");
			e3.setSalary(22222.21);
			e3.setCountry("Bharath");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void totalSalary(Employee e1, Employee e2, Employee e3) {
		Employee[] emp = new Employee[] { e1, e3, e3 };
		int temp = 0;
		for (Employee i : emp) {
			temp += i.getSalary();
		}
		System.out.println("Overall Salary: " + temp);
	}
//	
//	for(Employee e : emp) {
//		if (e.getCountry().equalsIgnoreCase("Bharath")) {
//			
//		}
//			
//			
//	}
	
	
}
