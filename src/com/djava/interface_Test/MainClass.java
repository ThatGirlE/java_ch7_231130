package com.djava.interface_Test;

public class MainClass {

	public static void main(String[] args) {
		
		//Car car = new Car(); // 인터페이스는 생성자로 객체를 선언할 수 없다.
		
		
		// 인터페이스는 생성자로 객체를 선언할 수 없지만 인터페이스를 구현하고 있는 (자식)클래스 객체를 대입받아 객체를 생성할 수 있다.
		Car car = new Bus();
		Truck truck = new Truck();
		Car car2 = truck;
		
		Car car3;
		Bus bus2 = new Bus();
		car3 = bus2;
		//car3.test() // 실행 불가 -> 인터페이스 내에 선언된 추상메소드만 호출 가능
		
		car3 = truck; // 왜 오류?
		
		bus2 = (Bus)car3;  // 강제 형변환
		
		
		BusSub busSub = new BusSub();
		car3 = busSub;
		
		car3.breakPedal();
		
		
	}

}
