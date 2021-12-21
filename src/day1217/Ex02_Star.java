package day1217;

import java.util.Scanner;

public class Ex02_Star {

	public static void main01(String[] args) {
		// *
		// ***
		// *****
		// *******
		// *********

		for (int i = 0; i < 5; i++) {
			// �������
			// (j<4-1) ���鰹�� (2*i+1) ������
			// �� ���� ���� �����������ϰ� ���� ����ϵ��� ��.
			for (int j = 0; j < 4 - i + 2 * i + 1; j++) {
				System.out.print((j < 4 - i) ? " " : "*");
			}
			System.out.println();
		}
	}

	public static void main02(String[] args) {
		// *********
		// *******
		// *****
		// ***
		// *

		for (int i = 0; i < 5; i++) {
			// �������
			// (i) ���鰹�� (9-2*i) ������
			// �� ���� ���� �����������ϰ� ���� ����ϵ��� ��.
			for (int j = 0; j < 9 - i; j++) {
				System.out.print((j < i) ? " " : "*");
			}

			System.out.println();
		}
	}

	// �� �ڵ�
	public static void main03(String[] args) {
		// *
		// ***
		// *****
		// *******
		// *********
		// *******
		// *****
		// ***
		// *

		for (int i = 0; i < 9; i++) {
			if (i < 5) {
				for (int j = 0; j < 5 - i; j++) {
					System.out.print((j < 4 - i) ? " " : "*");
				}
				System.out.println();
			} else {
				for (int j = 0; j < 9 - (i - 4); j++) {
					System.out.print((j < i - 4) ? " " : "*");
				}
				System.out.println();
			}
		}
	}

	// ����� �ڵ� 1
	// 1. ���� 1 2 3 4 5 4 3 2 1 �� ���ϴ� end ���� ����
	// 2. ������ ���� ���
	// 3. ����� �ڵ带 «.
	public static void main04(String[] args) {
		// 1. ���� 1 2 3 4 5 4 3 2 1 �� ���ϴ� end ���� ����
		int end = 1;
		for (int i = 0; i < 9; i++) {
			// 2. ������ ���� ���
			// 5-end��ŭ �ݺ��ؼ� ������ �����
			for (int j = 0; j < 5 - end; j++) {
				System.out.print(" ");
			}
			// 3. ����� �ڵ�
			// ���� ������ŭ �ݺ�
			for (int j = 0; j < end * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
			// 1. ���� 1 2 3 4 5 4 3 2 1 �� ���ϴ� end ���� ����
			end = i < 4 ? end + 1 : end - 1;
		}
	}

	// ����� �ڵ� 2
	// 1. �ϴ� 9�� 9���� ���� ��´�.
	// 2. ����(end)�� ������ �� ����
	// 3. ������ ������ �� ��� �������
	public static void main05(String[] args) {
		int end = 4;
		// �������ϴ� end�� ���ϰ� 4���� ũ�� ������ �ø���
		// 4���� ũ�� �� ���� ���̱�
		for (int i = 0; i < 9; i++) {
			// 9-end�� �ݺ�Ƚ�� �ٿ��� ������ �������
			for (int j = 0; j < 9 - end; j++) {
				// j�� end���� ������ ���� ����ؼ� ��� �����
				System.out.println(j < end ? " " : "*");
			}
		}
	}

	// ���1
	public static void main06(String[] args) {
//		*********
//		 *******
//		  *****
//		   ***
//		    *
//		   ***
//		  *****
//		 *******
//		*********
		// ������ ������ ������ end ����
		int end = 0;
		for (int i = 0; i < 9; i++) {
			// ��ü 9������ ������ ���� ���鸸ŭ ����(�ݺ�Ƚ�� ����)�ϱ�����
			// 9���� end�� ���� �ݺ�Ƚ�� ����
			for (int j = 0; j < 9 - end; j++) {
				// j�� end ���� ������ ������� �׿� �� ���
				System.out.print(j < end ? " " : "*");
			}
			System.out.println();
			// i�� ���� ������ ������ ��ȭ ��Ŵ
			end = i < 4 ? end + 1 : end - 1;
		}
	}

	// ���2
	public static void main07(String[] args) {
		// 4�� �������� ������ �����ֱ����� �ʱⰪ 4�� ���� end ����
		int end = 4;
		for (int i = 0; i < 9; i++) {
			// �������
			// ���� ����(4)���� end��ŭ ���ظ�ŭ �ݺ��Ͽ� ���� ���
			for (int j = 0; j < 4 - end; j++) {
				System.out.print(" ");
			}
			// �� ���
			// ���� ������ŭ (9���� 1, 1���� 9����) �ݺ��Ͽ� �� ���
			for (int j = 0; j < 2 * end + 1; j++) {
				System.out.print("*");
			}

			System.out.println();
			// i���� 4(�ټ���° ��)�϶��� �������� end ���� 4���� �����ϰų� �����ϵ���
			// ���׿����� ���
			end = (i < 4) ? end - 1 : end + 1;
		}
	}

	// �� �ڵ�
	public static void main08(String[] args) {
//		*********  0  0 9      0
//		**** ****  1  1 8  -1  5
//		***   ***  2  3 6  -2  4-6
//		**     **  3  5 4  -2  3-7 
//		*       *  4  7 2  -2  2-8 
//		**     **  5  5 4  +2  3-7
//		***   ***  6  3 6  +2  4-6
//		**** ****  7  1 8  +2  5
//		*********  8  0 9  +2  0
		
		// ���(4��)�� �������� 1�����ϰ� ������ em������ �ʱⰪ 0���� ���� 
		int em = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				// 4���� �������� em��ŭ ������ ������ &&�������� �����Ͽ�
				// �� ������ŭ ������ ����ϰ� �׿ܿ��� ���� ���
				System.out.print((j > (4 - em)) && (j < (4 + em)) ? " " : "*");
			}
			System.out.println();
			// i�� ���� ������ em�� 0���� 1�� �����ϰ� 4�ʰ��϶� 1�� �����ϵ��� ����
			em = i < 4 ? em + 1 : em - 1;
		}
	}

	// ����� �ڵ�
	public static void main09(String[] args) {
		int end = 5;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				// �������� ���
//				System.out.print((j<end||j>8-end)?"*":" ");

				// ���� ������ ���
				System.out.print((j >= end && j < 9 - end) ? " " : "*");
			}
			System.out.println();
			end = i < 4 ? end - 1 : end + 1;
		}
	}

	static Scanner sc = new Scanner(System.in);

	// �������Է� �� ��ȿ���˻�
	public static void main(String[] args) {

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
		int end = size / 2 + 1;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print((j >= end && j < size - end) ? " " : "*");
			}
			System.out.println();
			end = i < (size / 2) ? end - 1 : end + 1;
		}
	}

}
