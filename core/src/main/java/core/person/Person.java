package core.person;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter				//lombok으로 자바빈(생성자,게터세터,생성자 등의 필수요소)를 간편하게 생성함
@Setter
@ToString
@NoArgsConstructor //기본 생성자
@AllArgsConstructor // 모든 파라미터 생성자
@EqualsAndHashCode

//위의 모든 기능을 @Data로 한번에 추가할수 있지만 , 실무에서는 잘 안씀 ( 필요없는 기능을 제거할수 없어서 )

public class Person {
	
	private String nickname;
	private String address;
	private int age;
	
	
	
}
