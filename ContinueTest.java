package exam.control;

public class ContinueTest {
	public static void main(String[] args) {
		//Continue ����
			int sum = 0;
			for(int i = 1; i <= 1000; i++) {
				if(i%4 != 0) continue;
				sum += i;
			}
			System.out.println("�հ�: "+ sum);
			System.out.println("����");
		
	}
}
