package day1217;

import java.util.Scanner;

public class Ex03_MoveStar {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
//		-1 �Է��ϸ� ���� �׿ܿ��� ���
//		ũ�� >> 5
//		*****
//		**  *
//		* * *
//		*  **
//		*****
//		
//		*****
//		** **  
//		*   * 
//		** **  
//		*****

//		ũ�� >> 7
//		*******
//		**    *
//		* *   *
//		*  *  *
//		*   * *
//		*    **
//		*******
//		
//		*******
//		* * * * 
//		**   **      
//		*     *
//		**   **
//		* * * *
//		*******

//		*********
//		*  * *  *    3 5
//		* *   * *   2   6
//		**     **   
//		*       *   2   6
//		**     **    3 5
//		* *   * *
//		*  * *  *
//		*********

		// �迭�� �ݺ��� �����ϴ� �ָ� ����

		int size = inNum();
		boolean game = true;
		while(game) {
			stair(size);
			diamond(size);
			
			if(!start()) {
				break;
			}
			size = inNum();
		}
		System.out.println("���α׷� ����");
	}
	static boolean start() {
		int regame;
		while(true) {
		try {
			System.out.print("�����Ϸ��� -1�� �Է��ϼ���. �׿� ����� ");
			regame = sc.nextInt();
			break;
		} catch (Exception e) {
			System.out.print("���ڸ� �Է� �ϼ���!\n");
			sc.next();
			continue;
			}
		}
		
		if(regame == -1) {
			return false;
		}
		return true;
	}
	static int inNum() {
		int size;
		while (true) {
			// ���ڰ��ƴ� �̻��Ѱ��� ������ �ٽ� �Է¹޵��� ����ó��
			try {
				System.out.print("ũ�� �Է�(Ȧ����) >> ");
				size = sc.nextInt();
				break;
			} catch (Exception e) {
				System.out.print("���ڸ� �Է� �ϼ���!\n");
				sc.next();
				continue;
			}
		}
		// ��ȿ�� �˻� : 5���� ũ�� 15���ٴ� ���� ���� ���, Ȧ���� �Է� ���� ��.
		while (!((size % 2 == 1) && (size >= 5) && (size <= 15))) {
			try {
				// ���� �ʰ� �϶�
				if (!((size >= 5) && (size <= 15))) {
					System.out.println("5�̻� 15���� ���� �Է�");
					System.out.print("ũ�� �Է�(Ȧ����) >> ");
					size = sc.nextInt();
					continue;
				}
				// ¦�� �Էµ��� ��
				System.out.println("Ȧ���� �Է� �ϼ���!");
				System.out.print("ũ�� �Է�(Ȧ����) >> ");
				size = sc.nextInt();
				// ���ڰ��ƴ� �̻��Ѱ��� ������ �ٽ� �Է¹޵��� ����ó��
			} catch (Exception e) {
				System.out.print("���ڸ� �Է� �ϼ���!\n");
				sc.next();
				continue;
			}
		}
		return size;
	}

	static void stair(int size) {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i == 0) {
					System.out.print("*");
				} else if (i == size-1) {
					System.out.print("*");
				} else {
					System.out.print((j==0)||(j==size-1)||(j==i)?"*":" ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	static void diamond(int size) {

		int em = 0;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i == 0) {
					System.out.print("*");
				} else if (i == size-1){
					System.out.print("*");
				} else {
					System.out.print((j==0)||(j==size-1)||(j==size/2-em)||(j==size/2+em)?"*":" ");
				}
			}
			System.out.println();
			em = i<size/2? em + 1 : em - 1;
		}
		System.out.println();
	}
}
