package RunnerPack;


import org.junit.BeforeClass;
	import org.junit.runner.RunWith;

import BasePack.BaseClass;
import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(features="src\\test\\java\\FeaturePack\\Demo.feature",glue="StepPack")

	public class RunnerClass extends BaseClass{

		
		}
	




