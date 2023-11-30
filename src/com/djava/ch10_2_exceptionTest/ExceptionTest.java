package com.djava.ch10_2_exceptionTest;

public class ExceptionTest {
	public static void main(String[] args) {
				
		int a = 10;
		int[] arr = {1,2,3};
		
		// 예외처리
		try {
			int result = a / 0;
		}
		catch(Exception e){
			System.out.println("모든 수는 0으로 나눌 수 없다.");
			System.out.println(e);
		}
		
		try {
			System.out.println(arr[7]);
			int result2 = a/0;
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); // 에러메세지 출력 print(e)랑 같은데 더 자세히
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("에러의 발생여부와 상관없이 반드시 실행");
		}
		
		ThrowsTest throwsTest = new ThrowsTest();
		//test 메소드에 throws 에러 떠넘기기가 선언되어 있으므로 test 메소드를 호출하는 측에서 예외처리를 진행해야함(또 넘기기도 가능하나 메인클래스에서는 밑에 방법을 하는듯)
		try {
			throwsTest.test(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   // 예외처리를 호출한쪽에 던졌기 때문에 호출한쪽에서 예외처리
	
	}
}
