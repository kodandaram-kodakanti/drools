1. Here, you have to maintain the folder structure as created in this project. (META-INF, rules, kmodule.xml, pom.properties)
2. Inside kmodule.xml, we are creating the ksession object using '<ksession name="first-ksession-rule"/>', 
in which the 'first-ksession-rule' name we ill access from the DemoTest.java class.
3. Inside /maven/pom.properties, wei'll use the groupId, artifactId, version details from pom.xml.

Note: Facts are nothing but Pojos; Data is nothing but the content that we're setting to our Pojo objects. 
Rules will be fired based on the data that we've set on the facts. 


=> WorkingMemory is equivalent to KieSession

==> In the DemoTest.java, we've set the values for paytm+xmas+firstTimeUser; And all the rules which satisfies the condition will get 
executed and hence the output of discount would be printed as '22'. Totally, it has executed 3 rules for the provided fact.

salience: It is the keyword inside .drl file from Drools, it represents the priority of rule execution. The higher integer value has
the first priority of rule execution based on the condition(when section) satisfaction.

Below are the dependencies that we need to add in pom.xml:
	<properties>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
		<drools.version>6.2.0.Final</drools.version>
	</properties>

	<dependencies>
		<dependency>
			<groupId>org.kie</groupId>
			<artifactId>kie-api</artifactId>
			<version>${drools.version}</version>
		</dependency>

		<dependency>
			<groupId>org.drools</groupId>
			<artifactId>drools-core</artifactId>
			<version>${drools.version}</version>
		</dependency>

		<dependency>
			<groupId>org.drools</groupId>
			<artifactId>drools-compiler</artifactId>
			<version>${drools.version}</version>
		</dependency>
	</dependencies>