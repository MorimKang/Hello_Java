package exam.control;

import java.util.Scanner;

public class SwitchTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���> ");
		int num = sc.nextInt();
		
		switch(num){
			case 1:
			case 3:
				System.out.println("����");
				break;
			case 2:
			case 4:
				System.out.println("����");
				break;
			default:
				System.out.println("����");
				break;
		}
	}
}
