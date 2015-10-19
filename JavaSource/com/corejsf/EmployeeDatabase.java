package com.corejsf;

import java.io.Serializable;

import javax.inject.Named; 
   // or import javax.faces.bean.ManagedBean;
import javax.enterprise.context.SessionScoped; 
   // or import javax.faces.bean.SessionScoped;

@Named
@SessionScoped
public class EmployeeDatabase {
	private static final Employee[] employees = new Employee[] {
       new Employee("William",23, "Dupont"),
       new Employee("Anna", 24, "Keeney"),
       new Employee("Mariko",25,  "Randor"),
       new Employee("John", 26, "Wilson")
   };

   public Employee[] getEmployees() { return employees;}
}
