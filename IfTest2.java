package exam.control;

import java.util.Scanner;

public class IfTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ȧ¦ �Ǻ�-���ڸ� �Է��ϼ���: ");
		int number = sc.nextInt();
		
		if(number%2 == 0) {
			System.out.println("¦��");
		}else {
			System.out.println("Ȧ��");
		}
	}
}
