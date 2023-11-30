package com.djava.ch11_01_apiTest;

import com.djava.abstract_test.CameraPhone;
import com.djava.abstract_test.Phone;

public class ClassClassTest {

	public static void main(String[] args) {

		//클래스의 정보를 담고 있는 데이터 = 메타데이터
		
		Class clazz = String.class;
		
		Class phoneClass1 = Phone.class; // Phone 클래스의 정보를 가져와서 저장
		
		try {
			Class phoneClass2 = Class.forName("com.djava.abstract_test.Phone");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Phone phone = new CameraPhone();
		Class phoneClass3 = phone.getClass();
		
		System.out.println(clazz.getName());
		System.out.println(phoneClass1.getName());
		//System.out.println(phoneClass2.getName());
		System.out.println(phoneClass3.getName());

		
		String str = "홍길동";   // str은 변수가 아니고 객체이다.
		
		String str2 = new String("김유신");
		
		System.out.println(str);
		System.out.println(str2);
	}

}
