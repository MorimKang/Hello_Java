package exam.control;

public class DoWhileTest3 {
	public static void main(String[] args) {
		//1~1000���� ���� �� 4�� ����� �հ�
		int sum = 0;
		int i = 1;
		do {
			if(i%4==0)sum += i;
			i++;
		}while(i <= 1000);
		System.out.println("�հ�: "+ sum);
		System.out.println("����");
	}
}
