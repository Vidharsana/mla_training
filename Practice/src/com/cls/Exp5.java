package com.cls;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private int salary;
	public Employee() {
		
	}
	public Employee(int id,String name,int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public int compareTo(Employee o) {
		return this.id-o.id;
	}
}
class NameComparator implements Comparator<Employee>{
	public int compare(Employee o1,Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}
}
public class Exp5 {

	public static void main(String args[]) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(4,"Rohit",1234));
		empList.add(new Employee(5,"Iyer",342));
		empList.add(new Employee(2,"Kohli",423));
		empList.add(new Employee(1,"Rahul",323));
		empList.add(new Employee(3,"Sky",844));
		Iterator<Employee> itr = empList.iterator();
		System.out.println("Before sorting employee data");
		while(itr.hasNext()) {
			Employee emp = itr.next();
			System.out.println("ID : "+emp.getId()+" Name : "+emp.getName()+" Salary : "+emp.getSalary());
		}
		Collections.sort(empList);
		for(Employee emp : empList) {
			System.out.println("ID : "+emp.getId()+" Name : "+emp.getName()+" Salary : "+emp.getSalary());
		}
		Collections.sort(empList,new NameComparator());
		System.out.println("based name sorting data");
		for(Employee emp : empList) {
			System.out.println("ID : "+emp.getId()+" Name : "+emp.getName()+" Salary : "+emp.getSalary());
		}
	}
}
