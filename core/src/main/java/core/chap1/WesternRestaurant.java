package core.chap1;

public class WesternRestaurant implements Restaurant {
	
	//서양레스토랑은 프랑스셰프에 의존적
	private Chef chef = new FrenchChef();
	
	//요리코스
	private Course course = new FrenchCourse();
	
	//요리를 주문하는 기능 // 오버라이딩 됨
	public void order() {
		System.out.println("서양 요리를 주문합니다.");
		course.combineMenu();
		chef.cook();
	}
	
}
