package exam.control;

public class ForTest7 {
	public static void main(String[] args) {
		
//		for(int i = 1; i <= 5; i++) { 	  //��
//			for(int j = 5; j >= i; j--) { //��
//				System.out.print("��");
//			}//end of j
//			System.out.println();
//		}//end of i
//		System.out.println("����");
		
		
		for(int i = 1; i <= 5; i++) { 	  //��
			for(int j = 1; j <= 6-i; j++) { //��
				System.out.print("��");
			}//end of j
			System.out.println();
		}//end of i
		System.out.println("����");
		
		
//		1�� 12345
//		2�� 2345
//		3�� 345
//		4�� 45
//		5�� 5
		
	}
}
