package com.djava.ch11_01_apiTest;

public class StringTest {

	public static void main(String[] args) {
		
		String str = "Korea";
		char strChar = str.charAt(3);
		
		System.out.println(strChar);
		
		String ssn = "881201-1234567";
		
		char ssnGender = ssn.charAt(7);  //한글자반환
		
		//String ssnGender2 = ssn.charAt(7); // char로 반환해야됨
		
		
		if(ssnGender == '1') { // char 한글자라서 ''작은 따음표
			System.out.println("남자");
			
		}else {
			System.out.println("여자");
		}
		
		int re1 = ssn.indexOf("88");// 해당 문자열이 존재하면 그 문자열이 시작되는 인덱스 번호를 반환
		//int re1 = ssn.indexOf("321"); // 해당 문자열이 조재 하지 않으면 -1 반환
		
		System.out.println(re1);
		
		
		
		String str00 = "김길동 김길수";
		
		String str11 = str00.replace("김", "홍");
		
		System.out.println(str11);
		
		
		System.out.println(ssn.substring(0,6));  //파이썬 슬라이싱, 인덱스 0~5까지 슬라이싱(6포함x)
		System.out.println(ssn.substring(6)); // 인덱스 6부터 끝까지 슬라이싱
		
		
		String strnum = "1000000";
		
		int totalMoney = Integer.parseInt(strnum); // wrapper class, 문자열 -> 정수로
		double totalMoney2 = Double.parseDouble(strnum); // 문자열 -> 실수로
		
		Integer int1 = new Integer(strnum); // 옛날 방식. 클래스이다.
		
		double mok = totalMoney / 5;
		
		System.out.println(mok);
		
		
		//0.0 <= Math.random() < 1.0
		
		System.out.println(Math.random()); // 랜덤수 반환 -> 범위 0.0~1.0 사이의 수 중 랜덤수 반환
		
		System.out.println((int)(Math.random() * 10)+1);  // 1~10사이의 정수 중 한개가 반환, 0과 1이 나오지 않기 때문에 +1을 해주면 1과 10이 나온다.	
		
		System.out.println((int)(Math.random() * 20)+1); //1~20사이
		
		System.out.println((int)(Math.random() * 45)+1); // 1~45사이
		
		System.out.println((int)(Math.random() * 11)); // 0~10사이
		
		
		
		
	}

}
