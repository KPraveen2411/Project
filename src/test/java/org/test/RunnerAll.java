package org.test;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.pojo.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\praveen\\eclipse-workspace\\Cucumber\\RunnerAll",
glue="org.sample",dryRun=false,monochrome=true,snippets=SnippetType.CAMELCASE,
tags= {"@praveen","@praveen2"},
plugin= {"html:C:\\Users\\praveen\\eclipse-workspace\\Cucumber\\Report\\HTMLreport",
"json:C:\\Users\\praveen\\eclipse-workspace\\Cucumber\\Report\\json\\Praveen.json",
"rerun:C:\\Users\\praveen\\eclipse-workspace\\Cucumber\\RunnerAll\\failed.txt"})

public class RunnerAll {
	
	@AfterClass
	public static void report() {
		JVMReport.generateJVMReport("C:\\Users\\praveen\\eclipse-workspace\\Cucumber\\JVMReport");
	}
	

}


