package exam.control;

import java.util.Scanner;

public class IfTest4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ 1, ������ 2, ���� 3�� �Է�>");
		int you = sc.nextInt();
		
//	 if(you == 1)System.out.println("you: ����"); 
//	 else if(you ==2)System.out.println("you: ����"); 
//	 else System.out.println("you: ��");
		 
		switch(you) {
		case 1: System.out.println("you: ����"); break;
		case 2: System.out.println("you: ����"); break;
		case 3: System.out.println("you: ��"); break;
		default: break;
		}
		
		int com = (int)(Math.random()*3+1);
		
//		if(com == 1)System.out.println("com: ����");
//		else if(com == 2)System.out.println("com: ����");
//		else System.out.println("com: ��");
		
		switch(com) {
		case 1: System.out.println("com: ����"); break;
		case 2: System.out.println("com: ����"); break;
		case 3: System.out.println("com: ��"); break;
		default: break;
		}
		
//		
//		if(you == 1) {
//			if(com == 1)System.out.println("���º��Դϴ�.");
//			else if(com == 2)System.out.println("����� �¸��Դϴ�.");
//			else if(com == 3)System.out.println("����� �й��Դϴ�.");
//		}
//		else if(you == 2) {
//			if(com == 2)System.out.println("���º��Դϴ�.");
//			else if(com == 1)System.out.println("����� �¸��Դϴ�.");
//			else if(com == 3)System.out.println("����� �й��Դϴ�.");
//		}
//		else if(you == 3) {
//			if(com == 3)System.out.println("���º��Դϴ�.");
//			else if(com == 1)System.out.println("����� �й��Դϴ�.");
//			else if(com == 2)System.out.println("����� �¸��Դϴ�.");
		
//		if((you ==1 && com == 3)||
//			(you ==2 && com == 1)||
//			(you ==3 && com == 1))System.out.println("����� �¸�");
//		else if (you ==com ) System.out.println("���º�"); 
//		else System.out.println("����� �й�");
		
		switch(you) {
		case 1:
			switch(com){
				case 1: System.out.println("���º��Դϴ�."); break;
				case 2: System.out.println("����� �й��Դϴ�.");break;
				case 3: System.out.println("����� �¸��Դϴ�.");break;
			}
//			if(com == 1)System.out.println("���º��Դϴ�.");
//			else if(com == 2)System.out.println("����� �й��Դϴ�.");
//			else if(com == 3)System.out.println("����� �¸��Դϴ�.");
			break;
		case 2:
			switch(com){
				case 1: System.out.println("����� �й��Դϴ�."); break;
				case 2: System.out.println("���º��Դϴ�.");break;
				case 3: System.out.println("����� �¸��Դϴ�.");break;
		}
//			if(com == 2)System.out.println("���º��Դϴ�.");
//			else if(com == 1)System.out.println("����� �¸��Դϴ�.");
//			else if(com == 3)System.out.println("����� �й��Դϴ�.");
			break;
		case 3:
			switch(com){
				case 1: System.out.println("����� �й��Դϴ�."); break;
				case 2: System.out.println("����� �¸��Դϴ�."); break;
				case 3: System.out.println("���º��Դϴ�."); break;
		}
//			if(com == 3)System.out.println("���º��Դϴ�.");
//			else if(com == 1)System.out.println("����� �й��Դϴ�.");
//			else if(com == 2)System.out.println("����� �¸��Դϴ�.");
		default: break;
		}
		
		//����ؼ� �����ϰ� ���̽� ������
		//(you - com + 3 )% 3
		//case 0:
		//case 1:
		//case 2:
		
		
	}
}
