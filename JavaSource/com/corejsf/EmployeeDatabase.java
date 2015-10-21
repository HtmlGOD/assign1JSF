package com.corejsf;

import java.io.Serializable;
import java.util.ArrayList;
<<<<<<< HEAD
import java.util.Arrays;
=======
>>>>>>> b1f08f5daba5424870a73f379b905299e1971581

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
<<<<<<< HEAD
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
=======
       new Employee("John", 26, "Wilson")
   };
	
	private ArrayList<Employee> employees2;
	private int size;
	
	public EmployeeDatabase() {
		employees2 = new ArrayList<Employee>();
		employees2.add(new Employee("Chris", 1, "cbow"));
		employees2.add(new Employee("Tony", 2, "tlee"));
		employees2.add(new Employee("Wesley", 3, "wsura"));
		employees2.add(new Employee("Anthony", 4, "afigueroa"));
		size = employees2.size();
	}

   public Employee[] getEmployees() { return employees;}
   public ArrayList<Employee> getEmployees2() { return employees2;}
   public int getSize() {
	   return employees2.size();
   }
>>>>>>> b1f08f5daba5424870a73f379b905299e1971581
}
