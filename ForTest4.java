package exam.control;

public class ForTest4 {
	public static void main(String[] args) {
		// 1���� 1000���� 3�� ����� �հ�
		int sum = 0;

		//���1
		for(int i=1; i <= 1000; i++) { 
			if(i%3 == 0) sum += i; }
		

		// ���2
		for (int i = 3; i <= 1000; i += 3) {
			sum += i;
		}

		System.out.println("3�� ����� �հ�: " + sum);
	}
}
