package com.djava.abstract_test;

public abstract class Phone { // 추상 클래스
	
	String modelName;
	String modelColor;
	
	public void turnOn() {
		System.out.println("전원 켜기");
	}
	public void turnOff() {
		System.out.println("전원 끄기");
	}
	public abstract void bell(String bellName); // 추상메소드는 내용이 있으면 아노디고 메소드의 이름만 선언해 놓음
	// 자식클래스 오류 -> 오버라이딩 필수
	
}
