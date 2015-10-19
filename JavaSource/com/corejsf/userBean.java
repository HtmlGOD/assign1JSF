package com.corejsf;

import java.io.Serializable;
import javax.inject.Named; 
import javax.enterprise.context.SessionScoped; 

@Named("user") 
@SessionScoped
public class userBean {
	private String userName;
	private String password;
   
	public String getUserName() { return userName; }   
	public void setUserName(String newValue) { userName = newValue; }
   
	public String getPassword() { return password; }
	public void setPassword(String newValue) { password = newValue; }  
}
