package UTILITY;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {
public static ExtentReports createReport() {
	
	ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extentReport.html");
	ExtentReports reports =new ExtentReports();
	reports.attachReporter(htmlReporter);//attach the HTML report to ExtentReports
	reports.setSystemInfo("Regression", "Zerodha");// sets information we need to provide
	reports.setSystemInfo("Browser", "Chrome");
	reports.setSystemInfo("Environment", "SIT");
	
	return reports;
}
}

