package com.corejsf;

import java.io.Serializable;
import java.util.ArrayList;

import javax.inject.Named;
// or import javax.faces.bean.ManagedBean;
import javax.enterprise.context.SessionScoped; 
   // or import javax.faces.bean.SessionScoped;

@Named("employeeDatabase")
@SessionScoped
public class EmployeeDatabase implements Serializable {
	private static final Employee[] employees = new Employee[] {
       new Employee("William",23, "Dupont"),
       new Employee("Anna", 24, "Keeney"),
       new Employee("Mariko",25,  "Randor"),
       new Employee("John", 26, "Wilson")
   };
	
	private ArrayList<Employee> employeesTwo;
	private int size;
	
	public EmployeeDatabase() {
		employeesTwo = new ArrayList<Employee>();
		employeesTwo.add(new Employee("Chris", 1, "cbow"));
		employeesTwo.add(new Employee("Tony", 2, "tlee"));
		employeesTwo.add(new Employee("Wesley", 3, "wsura"));
		employeesTwo.add(new Employee("Anthony", 4, "afigueroa"));
		size = employeesTwo.size();
	}

   public Employee[] getEmployees() { return employees;}
   
   public ArrayList<Employee> getEmployees2() { return employeesTwo;}
   
   public int getSize() {
	   return employeesTwo.size();
   }
}
