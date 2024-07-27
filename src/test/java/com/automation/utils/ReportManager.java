package com.automation.utils;

import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ReportManager {
    static Scenario scenario;

    public static void initReporter(Scenario scenario){
        ReportManager.scenario = scenario;
    }

    public static void attachScreenshot(){
        scenario.attach(takeScreenshot(),"image/png","Screenshot");
    }

    public static byte[] takeScreenshot(){
        TakesScreenshot ts = (TakesScreenshot) DriverManager.getDriver();
        return ts.getScreenshotAs(OutputType.BYTES);
    }
}
