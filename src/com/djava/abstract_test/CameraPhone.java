package com.djava.abstract_test;

public class CameraPhone extends Phone{
	
	String camera;
	
	public void photo() {
		System.out.println("사진 촬영");
	}

	@Override
	public void bell(String bellName) {
		System.out.println("8비트 벨소리");
	}
	
	
	
}
