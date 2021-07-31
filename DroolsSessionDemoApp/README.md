1. Here, you have to maintain the folder structure as created in this project. (META-INF, rules, kmodule.xml, pom.properties)
2. Inside kmodule.xml, we are creating the ksession object using '<ksession name="first-ksession-rule"/>', 
in which the 'first-ksession-rule' name we ill access from the DemoTest.java class.
3. Inside maven/pom.properties, wei'll use the groupId, artifactId, version details from pom.xml.

Note: Facts are nothing but Pojos; Data is nothing but the content that we're setting to our Pojo objects. 
Rules will be fired based on the data that we've set on the facts. 

=> WorkingMemory is equivalent to KieSession
Note: 
1. Here we've declared variables of PaymentCounter.java are as 'public'.

2. accumulate in counter.drl: Using accumulate, you can define the steps for initialization, processings (note the plural!) and returning 
an arbitrary function. Some functions permit the reverse operation so that removing a fact that has been used for computing 
the function result can be handled: e.g., 'sum'. (But compare 'max'.)
Example: accumulate (PaymentCounter(); $occurance : count())

3. $temp & $occurance in counter.drl: These are the variables for PaymentCounter.java class.
4. count() in counter.drl: It is a predefined method from Drools.

Note: If you see the output of DemoTest.java, there you can see the accumulate value as '3' since PaymentCounter object is inserted
'3' times into KieSession object and since it is stateful session then the previous count is being incremented
by 1 every time when we insert a new PaymentCounter object into KieSession.

Below are the dependencies that we need to add in pom.xml:
<dependency>
			<groupId>org.kie</groupId>
			<artifactId>kie-api</artifactId>
			<version>6.2.0.Final</version>
		</dependency>

		<dependency>
			<groupId>org.drools</groupId>
			<artifactId>drools-core</artifactId>
			<version>6.2.0.Final</version>
		</dependency>

		<dependency>
			<groupId>org.drools</groupId>
			<artifactId>drools-compiler</artifactId>
			<version>6.2.0.Final</version>
		</dependency>
