package day1216;

import java.util.Scanner;

public class Ex03_BreakContinue {
	static Scanner sc = new Scanner(System.in);

	public static void main00(String[] args) {
		// beak label

		aa: for (int i = 1; i <= 10; i++) {
				for (int j = 1; j <= 10; j++) {
					// label�� ������ �ݺ����� break�Ͽ� �ٱ� for���� break �Ѵ�.
					if (j % 3 == 0)
						break aa; // label aa�� �ݺ��� break
					System.out.print(i * j + " ");
				}
				System.out.println();
			}
	}

	// break, continue ����
	public static void main(String[] args) {
		int age = 0;

		// �߸��Է¹޾��� ��� �ٽ��Է��ϵ��� try ~ catch�� ���
		while (true) {
			try {
				System.out.print("���� �Է� : ");
				age = sc.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("�ٽ��Է�");
				// ��ĳ���� ���ۿ� ���� ���� �����ϱ� ���� ���
				sc.nextLine();
				continue;
			}
		}

		if (age < 20) {
			System.out.println("�̼����ڿ��Դ� ���� ���� �ʽ��ϴ�.");
		} else {
			System.out.println("���ְ� �弼��");
		}
	}

}
