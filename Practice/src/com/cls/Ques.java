package com.cls;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee1 //implements Comparable<Employee>
{
	private int id;
	private String name;
	private int age;
	private String gender;
	private int year;
	public Employee1() {
		
	}
	public Employee1(int id,String name,int age,String gender,int year) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.year = year;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", year=" + year + "]";
	}
	/*public int compareTo1(Employee o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}*/
	public int compareTo(Employee1 o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
public class Ques {

	public static void main(String args[]) {
		List<Employee1> empList = new ArrayList<>();
		empList.add(new Employee1(2,"Sri",20,"Male",2004));
		empList.add(new Employee1(3,"Kosu",21,"Male",2003));
		empList.add(new Employee1(1,"Lee",19,"Female",2005));
		empList.add(new Employee1(5,"Thari",18,"Female",2007));
		empList.add(new Employee1(4,"Hemi",15,"Male",2010));
		System.out.println("before sorting employee data");
		empList.forEach(emp ->System.out.println("Id : "+emp.getId()+" Name : "+emp.getName()+" Age : "+emp.getAge()+" Gender : "+emp.getGender()+" Year : "+emp.getYear()));
		//List<Employee1> frmtData = empList.stream().sorted(Comparator.comparing(Employee :: getId)).collect(Collectors.toList());
		
	}
}
