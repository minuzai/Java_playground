package sec02_타입_변환과_다형성.exam02_자동_타입_변환_후의_멤버_접근;

public class Child extends Parent{
	@Override
	public void method2() {
		System.out.println("Child-method2()");
	}
	
	public void method3() {
		System.out.println("Child-method3()");
	}
}
