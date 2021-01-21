package org.comstudy21.ch03;

// 객체지향 : 있는걸 또 만들지 않기 위해!!
// class는 사용자 정의 타입
// 사용자가 임의로 만들어서 쓰는 데이터 타입
// class = 멤버필드 + 메소드
// 필드 : 속성(변수)
// 메소드 : 일(함수)
// call by value , call by reference 기억하기!!

class Point {
	int x;
	int y;
}

public class Ch03Ex02Refer {
	static void swap(Point p) {
		int temp = p.x;
		p.x = p.y;
		p.y = temp;
		
	}

	public static void main(String[] args) {
		Point p1/*참조값=참조변수=정수=4byte*/ = null;  //Point 타입의 참조변수 p1을 선언했다.
		p1 = new Point(); //연산자 new를 만듬.// 객체 생성
		
		p1.x = 100;
		p1.y = 200;
		
		swap(p1);
		
		System.out.println("p.x:" + p1.x + ", p1.y:" + p1.y);
	}
}
