package core;

import org.springframework.context.support.GenericXmlApplicationContext;

import core.chap3.Hotel;
import core.chap3.Hotel2;

public class Main2 {

	public static void main(String[] args) {
		
		
		GenericXmlApplicationContext ct = new GenericXmlApplicationContext("classpath:auto-config.xml");
		
		Hotel hotel1 = ct.getBean("hotel1",Hotel.class);
		hotel1.inform();
		
		System.out.println("--------------------------------------------------------------------------");
		
		GenericXmlApplicationContext gt = new GenericXmlApplicationContext("classpath:auto-config.xml");
		Hotel2 hotel2 = gt.getBean("hotel2",Hotel2.class);
		hotel2.inform();

	}

}
