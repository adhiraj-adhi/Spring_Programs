package com.adhiraj.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adhiraj.beans.Student;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/adhiraj/resources/applicationContext.xml");
		
		Student std1 = (Student) context.getBean("stdObj1");
		std1.display();
	}
}


/*
-> If we provide autowire="null" i.e. 

	   <bean class="com.adhiraj.beans.Address" id="addrId1">
	    	<property name="houseNo" value="123" />
	    	<property name="city" value="Delhi" />
	    	<property name="pincode" value="12345" />
	    </bean>    
	
	    <bean class="com.adhiraj.beans.Student" id="stdObj1" autowire="no" >
	    	<property name="name" value="Adhiraj Adhi" />
	    	<property name="roll" value="19" />
	    </bean>
    
    
   Then O/P:
   Name: Adhiraj Adhi
   Roll: 19
   Address: null
   
-> If we provide autowire="byName" and value of id attribute of Address bean 
   as property name (i.e. "address") i.e.:-
   
	   <bean class="com.adhiraj.beans.Address" id="address">
	    	<property name="houseNo" value="123" />
	    	<property name="city" value="Delhi" />
	    	<property name="pincode" value="12345" />
	    </bean>    
	
	    <bean class="com.adhiraj.beans.Student" id="stdObj1" autowire="byName" >
	    	<property name="name" value="Adhiraj Adhi" />
	    	<property name="roll" value="19" />
	    </bean>
   
   Then O/P:
   Name: Adhiraj Adhi
   Roll: 19
   Address: #123, Delhi - 12345
   
   => In this case if there would have been n number of objects that we were to inject to
   Student than we could have provided id of that n objects as the property name and there
   would have been automatic Dependency Injection.
   (See program AutowiringUsingXML2)

-> If we provide autowire="byType" and value of id attribute of Address bean 
   as property name (i.e. "address") i.e.:-
   
   Then O/P:
*/