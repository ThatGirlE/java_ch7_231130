package com.djava.interface_Test;

public interface Car { // 인터페이스 선언 -> 인터페이스는 생성자 불가
	String carName= "소나타";  // 인터페이스 안에서는 변수는 초기화가 되어있어야 한다(상수취급).
	
	public void excelPedal(); // 인터페이스 안에서는 메소드의 이름만 선언이 가능(매개변수 선언은 가능)
	public void breakPedal();
	public void handle();
	
	
}
