package sec02_타입_변환과_다형성.exam02_자동_타입_변환_후의_멤버_접근;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child; // Type Promotion
		
		parent.method1();
		parent.method2(); // Override Method
//		parent.method3(); // 호출 불가능 
	}

}
