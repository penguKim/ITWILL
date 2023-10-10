package access_modifier_p2;

import access_modifier_p1.ParentClass;

public class OtherPackageChildClass extends ParentClass {
	
	public void useMember() {
		// 다른 패키지의 상속 관계인 부모 클래스(ParentClass)의 멤버에 접근
		// => 슈퍼클래스의 멤버에 접근할 때는 참조변수 없이 접근해야 함
		//    (또는 레퍼런스 this 를 통해 접근)
		
		this.publicVar = 10; // public (O)
		this.protectedVar = 20; // protected (O) - 다른 패키지이지만, 상속 관계이므로 접근 가능
//		this.defaultVar = 30; // default (X) - 다른 패키지에서 접근 불가
//		this.privateVar = 40; // private (X) - 다른 클래스에서 접근 불가
		
		// ---------------------------------------------------------------
		// 서브클래스에서 슈퍼클래스의 인스턴스 생성 후 참조변수를 통해 접근 시
		// is-a 관계가 아닌 has-a 관계로 취급되므로 protected 도 접근 불가능
		ParentClass p = new ParentClass();
		p.publicVar = 10; // public (O)
//		p.protectedVar = 20; // protected (X) - 
							 // 패키지가 다르고, has-a 관계를 만들면 상속 관계가
							 // 아니게 되므로 접근 불가
	}
}
