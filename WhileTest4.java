package exam.control;

public class WhileTest4 {
	public static void main(String[] args) {
		//1���� 1000���� 3�� ����� �հ�
		int i = 1;
		int sum = 0;
		while(i <= 1000) {
			if(i%3==0)sum += i;
			i++;
		}
		System.out.println("�հ�: "+ sum);
	}
}
