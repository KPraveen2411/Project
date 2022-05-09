package org.test;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.pojo.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\praveen\\eclipse-workspace\\Cucumber\\src\\test\\resources\\lib\\login.feature",glue="org.sample"
,dryRun=true,monochrome=true,snippets=SnippetType.CAMELCASE,tags= {"@praveen","@praveen2"},plugin= {"html:C:\\Users\\praveen\\eclipse-workspace\\Cucumber\\Report\\HTMLreport",
"json:C:\\Users\\praveen\\eclipse-workspace\\Cucumber\\Report\\json\\Praveen.json"})

public class Runner {
	
	@AfterClass
	public static void report() {
		JVMReport.generateJVMReport("C:\\Users\\praveen\\eclipse-workspace\\Cucumber\\JVMReport");
	}
	

}
