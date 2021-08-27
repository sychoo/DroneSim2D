## Maven
- [Maven Quick-start](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html)
- [Maven Guide](https://maven.apache.org/guides/getting-started/index.html)
```bash
# build the maven project
mvn package

# -cp <class search path of directories and zip/jar files>
java -cp target/dronesim2d-1.0-SNAPSHOT.jar edu.cmu.dronesim2d.controller.MainController
```

## Troubleshoot
- Note that all fxml files must be added to the <resources> tag in pom.xml before use, <resources> tag should be added between the <build> tag