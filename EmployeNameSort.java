package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeNameSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Employee e1 = new Employee(1, "naga", 41000.00);
		Employee e2 = new Employee(3, "ashok", 20000.00);
		Employee e3 = new Employee(5, "ravi", 60000);
		Employee e4 = new Employee(2, "banu", 30000);
		Employee e5 = new Employee(4, "sneha", 15000);

		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		employeeList.add(e5);
		
		System.out.println(employeeList);
		
		Comparator<Employee> idComp= new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				if(o1.getId() > o2.getId()){
					return -1;
				}else{
					return 1;
				}
			}
			
		};
		
		 Collections.sort(employeeList,idComp);
		 System.out.println("sort based on ID "+employeeList);
		
		 Comparator<Employee> nameComp = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o2.getName().compareTo(o1.getName());
			}
			 
		};
		Collections.sort(employeeList,nameComp);
		 System.out.println("sort based on Name "+employeeList);
	}

}
