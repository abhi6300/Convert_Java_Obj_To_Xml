package com.abhi;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.abhi.entity.Employee;

public class ObjectToXml {
		 
	  public static void jaxbObjectToXML(Employee employee) 
	  {
	      try
	      {
	        //Create JAXB Context
	          JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
	           
	          //Create Marshaller
	          Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
	 
	          //Required formatting??
	          jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	 
	         //Store XML to File
	          File file = new File("D:\\Core-WorkSpace-Spring\\Employee.xml");
	           
	          //Writes XML file to file-system
	          jaxbMarshaller.marshal(employee, file); 
	      } 
	      catch (JAXBException e) 
	      {
	          e.printStackTrace();
	      }
	  }
	

}
