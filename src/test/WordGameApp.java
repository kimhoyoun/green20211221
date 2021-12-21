package test;

import java.util.Scanner;

// 1.ó���� �÷��̾� Ŭ���������
// 2.�÷��̾� Ŭ���� ��� ���� �� �޼��� �����ϱ�
// 3.�̸� �Է� - �ݺ������ 
// 4.���� �����ϰ� �ܾ� �Է� - ���ѷ���(while) Ż�����ǻ����ؼ� break;
//   - while ���ȿ��� �ؾ��Ұ�
//		�ܾ�� - �޼��� ���
//		�����ܾ� �ֽ�ȭ
// 		�迭 �ε����� �ʰ��Ǹ� �����ϱ� �ٽ� 0���� �÷��̾��-1�̸� �ٽ� 0 ó���� ��? ��������? => ��������. 
//

public class WordGameApp {
	static Scanner sc = new Scanner(System.in);
	
	public static void run() {
		
		System.out.println("�����ձ� ������ �����մϴ�....");
		System.out.print("���ӿ� �����ϴ� �ο��� ����Դϱ�?? >> ");
		int num = sc.nextInt();
		Player[] player = new Player[num];
		
		
		for(int i=0; i< num; i++) {
			System.out.print("�������� �̸��� �Է��ϼ��� >> ");
			player[i] = new Player(sc.next());
		}
		
		String prevword = "�ƹ���";
		
		System.out.printf("�����ϴ� �ܾ�� %s�Դϴ�\n",prevword);
		int i =0;
		while(true) {
			System.out.printf("%s >>",player[i].getName());
			player[i].word = sc.next();
						
			if(!player[i].checkSuccess(prevword)) {
				System.out.printf("%s�� �����ϴ�.\n",player[i].getName());
				break;
			}
				
			prevword = player[i].word;
			
			// �������ŭ ���ƾߵż� i�� ����
			if(i>=player.length-1) {
				i = 0;
			}else {
				i++;				
			}
			
		}
		System.out.println("��������!");
	}

	
	public static void main(String[] args) {
		run();
	}
}
