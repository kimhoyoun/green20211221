package day1217;

import java.util.Scanner;

public class Ex01_Gugu {

	public static void main01(String[] args) {
		// 12.17 ���� Ǯ��
		// ����1 : 3�� 3���� ������ ���
		

		// Ÿ��Ʋ�� 3�� 3���� ����ϱ����� �� ���� ù��° ���� ���� 2, 5, 8�� 3�� �����ϱ⶧����
		// dan�� �������� 3���� ����.
		for (int dan = 2; dan <= 9; dan += 3) {
			for (int i = 0; i < 3; i++) {
				// 9�ܱ����� ����ϰ� 10���� ������� �ʾƾ��ϹǷ� dan+i�� 10�� �ƴҶ��� ���
				if (dan + i != 10) 
					System.out.printf("***%d***\t", dan + i);
			}
			System.out.println();
			for(int cnt=1; cnt<=9; cnt++) {
				for(int i=0; i<3; i++) {
					if(dan+i !=10) System.out.printf("%d*%d=%d\t",dan+i,cnt,(dan+i)*cnt);
				}
				System.out.println();
			}
		}
	}
	static Scanner sc = new Scanner(System.in);

	static int getDan(String message) {
		System.out.print(message);
		int dan = sc.nextInt();

		// ��ȿ�� üũ
		while (dan < 2 || dan > 9) {
			System.out.println("�Է¹����� �ʰ��߽��ϴ�!");
			System.out.print(message);
			dan = sc.nextInt();
		}
		return dan;
	}
	// ����2 : ���۴�, ����� ��ɰ� �Բ��ϼ���.
	public static void main(String[] args) {
		int startDan = 2;
		int endDan = 9;
		startDan = getDan("���۴� �Է�>> ");
		endDan = getDan("���� �Է�>> ");

		// ���۴��� ���ܺ��� Ŭ �� �� �� ġȯ
		if (endDan < startDan) {
			int temp = startDan;
			startDan = endDan;
			endDan = temp;
		}
		
		for (int dan = startDan; dan <= endDan; dan += 3) {
			for (int i = 0; i < 3&&dan+i<=endDan; i++) {
				System.out.printf("***%d***\t", dan + i);
//				if (dan + i <= endDan) 
			}
			System.out.println();
			for(int cnt=1; cnt<=9; cnt++) {
				for(int i=0; i<3&&dan+i<=endDan; i++) {
					 System.out.printf("%d*%d=%d\t",dan+i,cnt,(dan+i)*cnt);
//					 if(dan+i <=endDan)
				}
				System.out.println();
			}
		}
	}
}
