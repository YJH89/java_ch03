package org.comstudy21.ch03;

// ��ü���� : �ִ°� �� ������ �ʱ� ����!!
// class�� ����� ���� Ÿ��
// ����ڰ� ���Ƿ� ���� ���� ������ Ÿ��
// class = ����ʵ� + �޼ҵ�
// �ʵ� : �Ӽ�(����)
// �޼ҵ� : ��(�Լ�)
// call by value , call by reference ����ϱ�!!

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
		Point p1/*������=��������=����=4byte*/ = null;  //Point Ÿ���� �������� p1�� �����ߴ�.
		p1 = new Point(); //������ new�� ����.// ��ü ����
		
		p1.x = 100;
		p1.y = 200;
		
		swap(p1);
		
		System.out.println("p.x:" + p1.x + ", p1.y:" + p1.y);
	}
}
