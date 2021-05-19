package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features", 
		glue = "stepDefinitions",
		tags = "@RegressionTest",
		plugin = {"pretty","summary","html:target/cucumber.html", "json:target/cucumber.json","junit:target/cukes.xml"}
		)
public class TestRunner {
	//Comentario1
	//Comentario2
	//Comentario3
	//ComentarioDevelop1
	//ComentarioDevelop2
	//ComentarioDevelop3
}
