# Spring-Boot-Project
Spring boot applications with application yml file -- which handles multiple environments with single file

Application.YML file for configuration declaration
•	As we know Java developers relies on properties file or xml files for specifying application configurations. 
•	In an enterprise application peoples have creating separate files for each environment like Development, Staging and Production to define the properties for respective environment.
•	But spring boot gives us an option to configure all profiles within a single “yml” file.
What is YAML?
•	YAML is a superset of JSON, and as such is a very convenient format for specifying hierarchical configuration data.
•	It provides friendly data serialization standard for all programming languages.
•	YAML is more readable and it is good for the developers for read/write configuration files.
Main Goals of YAML:
1.	YAML is easily readable by humans. 
2.	YAML data is portable between programming languages. 
3.	YAML matches the native data structures of agile languages. 
4.	YAML has a consistent model to support generic tools. 
5.	YAML is expressive and extensible. 
6.	YAML is easy to implement and use. 
Example:
environment:
    Profiles: dev
    name: Developer App 
    url: http://dev.abc.com
    
    profiles: qa
    name: QA App 
    url: http://qa.abc.com
There are following YAML parsers available for Java,
1.	SnakeYAML
2.	JYaml
3.	YamlBeans
4.	JvYaml
Spring Boot uses SnakeYAML library for yaml support.
If Snakeyaml library is included in your classpath, then SpringApplication class will automatically supports the YAML as an alternative to properties file.
if we you use starter pom then spring-boot-starter automaticaly loads yml file (application.yml)
