package ma.test;

import ma.di.usingsetter.Employee;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*;  

public class TestUsingSetter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Resource r=new ClassPathResource("applicationContext-Setter.xml");  
		BeanFactory factory=new XmlBeanFactory(r);  

		Employee e=(Employee)factory.getBean("obj");  
		e.display(); 

	}

}
