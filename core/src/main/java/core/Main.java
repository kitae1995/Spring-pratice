package core;

import org.springframework.context.support.GenericXmlApplicationContext;

import core.chap2.Hotel;

public class Main {	

	public static void main(String[] args) {
		
//		Hotel hotel = new Hotel();
//		hotel.inform();
		
		//자바빈 등록에 사용된 xml(스프링)의 설정을 가져오는 객체
		//classpath는 ? 경로를 말해주는 고유 명사 여기서 classpath는 src/main/resources랑 똑같음
		GenericXmlApplicationContext ct = new GenericXmlApplicationContext("classpath:hotel-config.xml");
		
		Hotel hotel1 = ct.getBean("hotel1",Hotel.class); // getBean(bean의 이름 , 리턴받고자 하는 bean의 속성)
		hotel1.inform();
		
		System.out.println("============================================================");
		
		Hotel hotel2 = ct.getBean("hotel2",Hotel.class);
		hotel2.inform();
		
	}

}
