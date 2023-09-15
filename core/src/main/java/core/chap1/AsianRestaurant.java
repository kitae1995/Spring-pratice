package core.chap1;

public class AsianRestaurant implements Restaurant {
	
	//서양레스토랑은 프랑스셰프에 의존적
	private Chef chef = new AsianChef();
	
	//요리코스
	private Course course = new AsianCourse();
	
	//요리를 주문하는 기능 // 오버라이딩 됨
	public void order() {
		System.out.println("아시안 요리를 주문합니다.");
		course.combineMenu();
		chef.cook();
	}
	
}
