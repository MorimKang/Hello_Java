package basic;

public class Optest11 {//����ȯ
	public static void main(String[] args) {
		int i = 10;
		long ii = i; //�ڵ� ����ȯ(����������ȯ)
		double iii = i; //�ڵ� ����ȯ
		
		System.out.println(i);
		System.out.println(ii);
		System.out.println(iii);
		
		//i = 3.14; ������ ���� �������� ������ ����!
		i = (int) 3.14; // ���� ����ȯ(���������ȯ) --> �Ҽ��� ���ϸ� ����
		System.out.println(i); 
	}
}
