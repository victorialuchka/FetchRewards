## Fetch Rewards Game Automation Framework

This framework includes UI tests for Fake Gold Bar game

REMARK: Test requirements are fulfilled and the project runs and generates report with IDE(screenshot attached below),
but build failures when running through terminal. I tried my best to debug but due to my lack of time I couldn't solve
the last piece.

#### Prerequisites You must have java and maven installed on your machine

#### How to run the tests

In order to run regression test you need to run the following maven command

`
mvn clean install
`

#### Breakdown of the framework mechanism

When mvn clean install is run maven triggers maven surefire plugin below

           <plugin>
               <groupId>org.apache.maven.plugins</groupId>
               <artifactId>maven-surefire-plugin</artifactId>
               <version>2.21.0</version>
               <configuration>
                   <includes>
                       <include>**/RegressionRunnerTest.java</include>
                   </includes>
                   <testFailureIgnore>true</testFailureIgnore>
               </configuration>
           </plugin>

The surefire plugin triggers the Cucumber runner class below

```
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features"},
        glue = {"step_defs"},
        tags = {"@regression"},
        plugin = {"pretty",
                "html:target/default-cucumber-reports",
                "json:target/cucumber.json" 
        }
)
public class RegressionRunnerTest {

    @AfterClass
    public static void afterRegression() {
        Driver.closeDriver();
    }

}
```

The Regression runner class scans all feature files under features folder and executes all scenarios with @regression
tag on

And lastly once the tests are done executing the framework generates cucumber reports thanks to the cucumber reports
plugin

````
<plugin>
          <!-- pie chart nice cucumber report -->
          <groupId>net.masterthought</groupId>
          <artifactId>maven-cucumber-reporting</artifactId>
          <version>2.8.0</version>
          <executions>
            <execution>
              <id>regression</id>
              <phase>verify</phase>
              <goals>
                <goal>generate</goal>
              </goals>
              <configuration>
                <projectName>Fake Gold Bar ${project.version}</projectName>
                <outputDirectory>${project.build.directory}/fetchRewardsGameReport</outputDirectory>
                <cucumberOutput>${project.build.directory}/cucumber.json</cucumberOutput>
              </configuration>
            </execution>
          </executions>
        </plugin>
````

The cucumber report is generated in the target folder of the maven project

![Report](/Users/vikacherepiuk/Desktop/Report.png)