package com.springcore.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {
	private String empName;
	private List<String> phones;
	private Set<String> address;
	private Map<String, String> courses;
	
	private Properties  props;
	
	// getter and setters in source option
	
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		System.out.println("Employee Nmae :");
		this.empName = empName;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		System.out.println("Employee No. :");
		this.phones = phones;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		System.out.println("Employee address  :");
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		System.out.println("Course Name :");
		this.courses = courses;
	}
	
	public void setProps(Properties props) {
		System.out.println("Property :");
	      this.props = props;
	   }
	   
	   // prints and returns all the elements of the Property.
	   public Properties getProps() {
	      
	      return props;
	   }
	      
	      
	public Emp(String empName, List<String> phones, Set<String> address, Map<String, String> courses , Properties props) {
		super();
		this.empName = empName;
		this.phones = phones;
		this.address = address;
		this.courses = courses;
		this.props = props;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Emp [empName=" + empName + ", phones=" + phones + ", address=" + address + ", courses=" + courses
				+ ", props=" + props + "]";
	}
	
	
	
	
	

}
