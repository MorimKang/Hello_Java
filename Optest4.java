package basic;

//���. ����. ��. �����. ���� . ����ȯ

public class Optest4 { //�� ������ �� �ٲٱ�
	public static void main(String[] args) {
		int i = 7;
		int j = 4;
		int temp;
		
		System.out.println(i);
		System.out.println(j);
		
		temp = i;
		i = j;
		j = temp;
		System.out.println(i);
		System.out.println(j);
		
	//����: XOR�� �̿��ؼ� �ٲٴ� ���
		i = i ^ j;
		j = j ^ i;
		i = i ^ j;
		
		//i ^= j;
		//j ^= i;
		//i ^=j;
	}
}
