package day1216;

import java.util.Scanner;

public class Ex04_Gugudan {

	public static void main01(String[] args) {
		// ������ ��� ���α׷�.
		// 2�� ~ 9�ܱ��� ��� ���α׷� ����.
		for (int dan = 2; dan < 10; dan++) {
			System.out.printf("***%d��***\n", dan);
			for (int cnt = 1; cnt < 10; cnt++) {
				System.out.printf("%d * %d = %2d\n", dan, cnt, dan * cnt);
			}
			System.out.println();
		}
	}

	public static void main02(String[] args) {
		// 2�� for�� ���� ���� ������ ���ٷ� ��� �ǵ��� �Ѵ�.
		for (int title = 2; title < 10; title++) {
			System.out.printf("***%d***\t", title);
		}
		System.out.println();
		// 4*1=4	5*1=5	6*1=6  ������ ������ ����� ���η� ǥ���ϱ� ���� �ڵ�
		// 4*2=8	5*2=10	6*2=12	
		for (int cnt = 1; cnt < 10; cnt++) {
			for (int dan = 2; dan < 10; dan++) {
				System.out.printf("%d*%d=%2d\t", dan, cnt, dan * cnt);
			}
			System.out.println();
		}
	}

	static Scanner sc = new Scanner(System.in);

	// static�� ������ �̹� Ŭ������ ������� �� ���� ��������� ������ �׳� �� �� ����
	// �Ⱥ��̸� ��ü�� �����ؾ� ����� �� �ִ�. (�ν��Ͻ�)
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

	public static void main03(String[] args) {
		// 2�� for�� ���� ���� ������ ���ٷ� ��� �ǵ��� �Ѵ�.
		int startDan = 2;
		int endDan = 9;
		// ���۴��� ����� ���� ū ���ڿ��� ���� ��� �ǵ��� �ϼ��Ͻÿ�.

		startDan = getDan("���۴� �Է�>> ");
		endDan = getDan("���� �Է�>> ");

		// ���۴��� ���ܺ��� Ŭ �� �� �� ġȯ
		if (endDan < startDan) {
			int temp = startDan;
			startDan = endDan;
			endDan = temp;
		}

		for (int title = startDan; title <= endDan; title++) {
			System.out.printf("***%d***\t", title);
		}
		System.out.println();
		for (int cnt = 1; cnt < 10; cnt++) {
			for (int dan = startDan; dan <= endDan; dan++) {
				System.out.printf("%d*%d=%2d\t", dan, cnt, dan * cnt);
			}
			System.out.println();
		}

	}

	public static void main04(String[] args) {
		// ����1 : 3�� 3���� ������ ���
		// ����2 : ���۴�, ����� ��ɰ� �Բ��ϼ���.
		
		// Ÿ��Ʋ�� 3�� 3���� ����ϱ����� �� ���� ù��° ���� ���� 2, 5, 8�� 3�� �����ϱ⶧����
		// dan�� �������� 3���� ����.
		for (int dan = 2; dan <= 9; dan += 3) {
			for (int i = 0; i < 3; i++) {
				// 9�ܱ����� ����ϰ� 10���� ������� �ʾƾ��ϹǷ� dan+i�� 10�� �ƴҶ��� ���
				if (dan + i != 10) {
					System.out.printf("***%d***\t", dan + i);
				}
			}
			System.out.println();
		}
	}

	public static void main05(String[] args) {
		// ����1 : 3�� 3���� ������ ���
		
		// 3���� �����ܰ��� ����ϰ� �� �������� ���� �࿡ ���
		for (int dan = 2; dan <= 9; dan += 3) {
			// ������� ���
			for (int i = 0; i < 3; i++) {
				if (dan + i != 10) {
					System.out.printf("***%d***\t", dan + i);
				}
			}
			System.out.println();
			// ���� �ش��ϴ� ���� 9���� ���ϰ� �� ���� ���
			for (int cnt = 1; cnt <= 9; cnt++) {
				for (int i = 0; i < 3; i++) {
					if (dan + i != 10) {
						System.out.printf("%d*%d=%d\t", dan + i, cnt, (dan + i) * cnt);
					}
				}
				// 3�� �� ����ϰ� ���� ���
				System.out.println();
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// ����2 : ���۴�, ����� ��ɰ� �Բ��ϼ���.
		int startDan = 2;
		int endDan = 9;
		
		// ������ ������ getDan()���
		startDan = getDan("���۴� �Է�>> ");
		endDan = getDan("���� �Է�>> ");

		// ���۴��� ���ܺ��� Ŭ �� �� �� ġȯ
		if (endDan < startDan) {
			int temp = startDan;
			startDan = endDan;
			endDan = temp;
		}
		
		// �������� ���۰��� ������ �Է¹��� ������ �Ͽ� �ݺ�.
		for (int dan = startDan; dan <= endDan; dan += 3) {
			// ������� ���� ����ϱ� ���� Ÿ��Ʋ�� ����ϴ� for���� �������� ����ϴ� for������ ���� �ۼ�
			for (int i = 0; i < 3; i++) {
				// �������� ���ܺ��� ū ���� ������� �ʵ��� ���ǽ� ����
				if (dan + i < endDan + 1) {
					System.out.printf("***%d***\t", dan + i);
				}
			}
			System.out.println();
			// �� ���� 9���� ���Ѱ��� ����ϰ� dan�� ���� �ٲ�� dan�ǰ����� ����Ǵ� for�� �ȿ� �ۼ�
			for (int cnt = 1; cnt <= 9; cnt++) {
				// ����� ���� ���� i�� ���� �ٲ��ָ鼭 ���ٿ� dan��, (dan+1)��, (dan+2)�� *cnt �� ���
				for (int i = 0; i < 3; i++) {
					// �������� ���ܺ��� ū ���� ������� �ʵ��� ���ǽ� ����
					if (dan + i < endDan + 1) {
						System.out.printf("%d*%d=%d\t", dan + i, cnt, (dan + i) * cnt);
					}
				}
				// 3���� �� ����ϰ� �ٹٲ�
				System.out.println();
			}
			// �������ϵ��� ���� �� �����
			System.out.println();
		}

	}
}
