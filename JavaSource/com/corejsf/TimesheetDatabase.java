package com.corejsf;

import java.util.ArrayList;
import java.util.List;

public class TimesheetDatabase implements TimesheetCollection{
	
	private ArrayList<Timesheet> timesheets;
	
	/**
     * @return all of the timesheets.
     */
    public List<Timesheet> getTimesheets() {
    	return timesheets;
    }

    /**
     * @param e the employee whose timesheets are returned
     * @return all of the timesheets for an employee.
     */
    public List<Timesheet> getTimesheets(Employee e) {
    	ArrayList<Timesheet> employeeArray = new ArrayList<Timesheet>();
    	for (int i = 0; i < timesheets.size(); i++) {
    		if (timesheets.get(i).getEmployee() == e) {
    			employeeArray.add(timesheets.get(i));
    		}
    	}
    	return employeeArray;
    }

    /**
     * @param e teh employee whose current timesheet is returned
     * @return the current timesheet for an employee.
     */
    public Timesheet getCurrentTimesheet(Employee e) {
    	ArrayList<Timesheet> employeeArray = (ArrayList<Timesheet>) getTimesheets(e);
    	return employeeArray.get(employeeArray.size()-1);    	
    }

    /**
     * Creates a Timesheet object and adds it to the collection.
     *
     * @return a String representing navigation to the newTimesheet page.
     */
    public String addTimesheet() {
    	Timesheet t = new Timesheet();
    	timesheets.add(t);
    	return "timesheetAdded";
    }
	
	
}
