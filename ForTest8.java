package exam.control;

public class ForTest8 {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) { //��
			for(int j = 1; j <= 5; j++) { //��
				if(i <= j) System.out.print("��");
				else System.out.print("��");
			}//end of j
			 System.out.println("��");
		}//end of i
		System.out.println("����");
	}
}
//1�� 12345
//2�� 2345
//3�� 345
//4�� 45
//5�� 5