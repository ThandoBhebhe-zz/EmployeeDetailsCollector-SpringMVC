package com.bhebhe.thando;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class Employee {
	
	private String name;
	private String surname;
	private String empId;
	private String countryName;
	private String programmingLanguage;
	
	//declare operatingSystems String array
	private String[] operatingSystems;
	
	
	//getter
	public String[] getOperatingSystem() {
		return this.operatingSystems;
	}
	//setter
	public void setOperatingSystem(String[] operatingSystem) {
		this.operatingSystems = operatingSystem;
	}
	
	
	private LinkedList<String> ll;
	
	private LinkedHashMap<String,String> lhm;
	private LinkedHashMap<String,String>osLhm;
	
	public Employee() {
		this.ll = new LinkedList();
		this.lhm= new LinkedHashMap();
		this.osLhm = new LinkedHashMap();
		
		this.osLhm.put("MAC", "Mac");
		this.osLhm.put("WINDOWS","Windows");
		this.osLhm.put("LINUX","Windows");
		
		
		
		//this.operatingSystem = new String[10];
		ll.add("South Africa");
		ll.add("Ireland");
		ll.add("Canada");
		
		lhm.put("You Chose Java", "Java");
		lhm.put("You chose C#","C#");
		lhm.put("You chose GO","GO");
	}
	
	
	
	public Map getLhm() {
		return this.lhm;
	}
	
	public String getProgrammingLanguage() {
		return programmingLanguage;
	}
	
	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}
	
	public String getCountryName() {
		return countryName;
	}
	
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getEmpId() {
		return empId;
	}
		
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	
	public Collection<String> getLl() {
		return this.ll;
	}
	
	public Map getOsLhm(){
		return this.osLhm;
	}
	
	public void setOsLhm(LinkedHashMap<String,String> osLhm) {
		
		this.osLhm=osLhm;
	}
	
}
