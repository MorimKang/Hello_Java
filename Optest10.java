package basic;

import java.util.Scanner;

public class Optest10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է����ּ���: ");
		int n = sc.nextInt();
		
		System.out.println((n%2) == 0 ? "¦��" : "Ȧ��");
	}
}
