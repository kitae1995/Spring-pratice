package core.chap3;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor // 기본생성자 lombok으로
@AllArgsConstructor //생성자 lombok으로
public class WesternRestaurant implements Restaurant {
	
	//서양레스토랑은 프랑스셰프에 의존적
	private Chef chef;
	
	//요리코스
	private Course course;
	
	//요리를 주문하는 기능 // 오버라이딩 됨
	public void order() {
		System.out.println("서양 요리를 주문합니다.");
		course.combineMenu();
		chef.cook();
	}
	
}
