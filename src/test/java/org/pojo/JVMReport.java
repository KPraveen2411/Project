package org.pojo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public class JVMReport {
	
	public static void generateJVMReport(String name) {
		
		File f =new File("C:\\Users\\praveen\\eclipse-workspace\\Cucumber\\JVMReport");
		
		Configuration c=new Configuration(f, "Asda");
		c.addClassifications("os", "Windows");
		c.addClassifications("Tool", "Eclipse");
		c.addClassifications("Langauage", "java");
		c.addClassifications("Data", "29/04/2022");
		
		List<String> l=new ArrayList<String>();
		l.add(name);
		
		ReportBuilder r=new ReportBuilder(l, c);
		r.generateReports();

	}

}
