package exam.control;
import java.util.Scanner;

public class NumberGame {
	public static void main(String[] args) {
		int c1, c2, c3;
		int h1, h2, h3;
		int s, b;
		int count = 0;
		
		c1 = (int)(Math.random()*10);
		do {
			c2 = (int)(Math.random()*10);
		}while(c2 == c1);
		do {
			c3 = (int)(Math.random()*10);
		}while(c3 == c1 || c3 == c2);
		
		Scanner sc = new Scanner(System.in);
		
		do {
			//strike�� ball �ʱ�ȭ
			s = b = 0; 
			
			//��ĳ�ʷ� �Է¹ޱ�: ex) 1 2 3 (���� ���̿� �����̽� �ѹ�)
			System.out.println("0���� 9������ �ߺ����� ���� ���� 3�� �Է� ex) 1 2 3");
			
			h1 = sc.nextInt();
			h2 = sc.nextInt();
			h3 = sc.nextInt();
			
			//strike�� ball ���� ����
			if(h1 == c1) s++;
			else if(h1 == c2 || h1 == c3) b++;
			if(h2 == c2) s++;
			else if(h2 == c1 || h2 == c3) b++;
			if(h3 == c3) s++;
			else if(h3 == c1 || h3 == c2) b++;
			
			//strike�� ball ���� ���
			
			System.out.println("Strike: " + s);
			System.out.println("Ball: " + b);
		
			count++;
		}while(s != 3);//�Ǵ� (s < 3)
		
		System.out.println("�����մϴ�. " + count + "������ ���߼̽��ϴ�.");
	}
}
