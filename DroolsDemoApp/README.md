1. Here, you have to maintain the folder structure as created in this project. (META-INF, rules, kmodule.xml, pom.properties)
2. Inside kmodule.xml, we are creating the ksession object using '<ksession name="first-ksession-rule"/>', 
in which the 'first-ksession-rule' name we ill access from the DemoTest.java class.
3. Inside maven/pom.properties, wei'll use the groupId, artifactId, version details from pom.xml.

Note: Facts are nothing but Pojos; Data is nothing but the content that we're setting to our Pojo objects. 
Rules will be fired based on the data that we've set on the facts. 

=> WorkingMemory is equivalent to KieSession

Below is/are the dependencies that we need to add in pom.xml:

	<dependency>
		<groupId>org.drools</groupId>
		<artifactId>drools-compiler</artifactId>
		<version>6.0.1.Final</version>
	</dependency>