package exam.control;

public class ForTest9 {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) { //��
			for(int j = 1; j <= 5; j++) { //��
				if(j >= 6-i) System.out.print("��");
				else System.out.print("��");
			}//end of j
			 System.out.println();
		}//end of i
		System.out.println("����");
	}
}
//1�� 5��
//2�� 45��
//3�� 345��
//4�� 2345��
//5�� 12345�� 
//    *
//   **
//  ***
// ****
//***** 
