package exam.control;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է����ּ���: ");
		int n = sc.nextInt();
		
		if(n == 1){
			System.out.println("����");
		}else if(n == 2){
			System.out.println("����");
		}else {
			System.out.println("����");
		}
		
		System.out.println("����");
	}
}
