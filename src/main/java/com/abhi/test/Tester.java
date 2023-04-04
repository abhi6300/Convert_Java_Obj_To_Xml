package com.abhi.test;

import com.abhi.ObjectToXml;
import com.abhi.XMLtoObject;
import com.abhi.entity.Employee;

public class Tester {

	public static void main(String[] args) {
		
	//	Employee emp = new Employee(1,"Abhi",15000.0,2233);
		
    // ObjectToXml.jaxbObjectToXML(emp);
		
		String fileName = "D:\\Core-WorkSpace-Spring\\Employee.xml";
		
		XMLtoObject.jaxbXmlFileToObject(fileName);
		
	}
}
