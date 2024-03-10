package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import stepDefinition.BaseClass;

@CucumberOptions(features="src/test/java/features/Login.feature",
glue="stepDefinition",
monochrome= true,
publish=true,
//tags="@smoke"
//tags="@smoke or @sanity"
//tags="@smoke and @sanity"
//tags="not @smoke"
//tags="@sanity and @regression or @smoke"
tags="@sanity and @smoke or @regression")




public class LoginPage extends BaseClass{

	

}
