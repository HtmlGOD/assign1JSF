package com.corejsf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

import javax.inject.Named; 
   // or import javax.faces.bean.ManagedBean;
import javax.enterprise.context.SessionScoped; 
   // or import javax.faces.bean.SessionScoped;

@Named ("employeeDatabase")
@SessionScoped
public class EmployeeDatabase implements Serializable {
	/*private static final Employee[] employees = new Employee[] {
       new Employee("William",23, "Dupont"),
       new Employee("Anna", 24, "Keeney"),
       new Employee("Mariko",25,  "Randor"),
       new Employee("John", 26, "Wilson")*/
	private static final ArrayList<Employee> employees = new ArrayList<Employee>(Arrays.asList(
		new Employee("William",23, "Dupont"),
	    new Employee("Anna", 24, "Keeney"),
	    new Employee("Mariko",25,  "Randor"),
	    new Employee("John", 26, "Wilson")
	));

   public ArrayList<Employee> getEmployees() { return employees;}
   
   public String save() {
	      for (Employee employee : employees) employee.setEditable(false);
	      return null;
	   }
   public String add(Employee newEmp){
	   employees.add(newEmp);
	   return null;
   }
   
   public String delete(Employee deleteEmp) {
	      employees.remove(deleteEmp);
	      return null;
	   }
}
