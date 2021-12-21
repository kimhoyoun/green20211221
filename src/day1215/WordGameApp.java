package day1215;

import java.io.IOException;
import java.util.Scanner;

public class WordGameApp {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// �����ձ� ���� ����
		run();
	}

	// �÷��̾� ���� �Է¹޾� ��ü ������ �ʱ�ȭ�Ͽ� ��ü�迭 player�� ��ȯ�ϴ� �Լ�
	static Player[] player(int num) {
		Player[] player = new Player[num];

		// �� ��ü �迭�� ������ �̸��� ���� ��ü�� �ʱ�ȭ
		for (int i = 0; i < player.length; i++) {
			System.out.print("�������� �̸��� �Է��ϼ��� >> ");
			player[i] = new Player(sc.next());
		}
		return player;
	}
	
	// ���ڸ� �Է¹ޱ����� getNum();
	static int getNum() {
		int num = 0;
		int ch = 0;
		try {
			while ((ch = System.in.read()) != '\n') {
				if (ch >= '0' && ch <= '9') {
					num = num * 10 + ch - '0';
				}
			}
		} catch (IOException e) {
		}
		// player �� ��ȿ�� üũ
		while (num <= 1) {
			System.out.println("1���� ū���� �Է��� �ּ��� ");
			System.out.print("���ӿ� �����ϴ� �ο��� ����Դϱ� >>");
			num = getNum();
		}
		
		return num;
	}
	
	static boolean reGame() {
		System.out.print("��� �Ͻðڽ��ϴ�?(y/n) >> ");
		char isLoop = sc.next().charAt(0);
		
		// isLoop���� 'n' or 'y' ���� �ޱ� ���� ��ȿ�� �˻�
		while (!(isLoop == 'n' || isLoop == 'y')) {
			System.out.println("y�Ǵ� n�� �Է��ϼ���!");
			System.out.print("��� �Ͻðڽ��ϴ�?(y/n) >> ");
			isLoop = sc.next().charAt(0);
		}
		
		// �����('y) true, ����('n') false
		if (isLoop == 'n') {
			return false;
		} else {
			return true;
		}
	}

	static void run() {
		while (true) {
			System.out.println("�����ձ� ������ �����մϴ�...");
			System.out.print("���ӿ� �����ϴ� �ο��� ����Դϱ� >>");
			int num = getNum();

			// player ��ü �����ϰ� �ʱ�ȭ�ϴ� player()�Լ� ���
			Player[] player = player(num);

			// ���� ���þ� �ʱ�ȭ
			String prevword = "�ƹ���";
			System.out.printf("�����ϴ� �ܾ�� %s �Դϴ�. \n", prevword);
			// player �迭�� �ε����� ��Ÿ�� ���� i ����
			int i = 0;

			while (true) {
				// getName() �޼��带 ����Ͽ� player name ��ȯ
				System.out.printf("%s >> ", player[i].getName());
				// �Է¹��� ���ڸ� player[i]��° ��ü�� word ������ ����
				player[i].setWord(sc.next());

				// boolean ���� result�� �����Ͽ� player[i]�� �Է��� �ܾ
				// ����� �ԷµǾ����� �Ǵ��ϴ� checkSuccess()�޼����� ��ȯ���� ����.
				// ���� �Է� : true, �߸��Է� : false
				boolean result = player[i].checkSuccess(prevword);

				// result == false �̸� �߸��Է����� player�� ���ٴ� �޼����� ���� ����
				if (!result) {
					System.out.printf("%s�� �����ϴ�.\n", player[i].getName());
					break;
				}
				// ���� player�� �ܾ �Է��ϱ� ���� ���� ���þ�� ����
				prevword = player[i].getWordFromUser();

				// player �迭 ��ü�� ������ ������� ������ �÷��̾��̹Ƿ� �ٽ� 0��°
				// player�� ���ư����� ���׿����� ����Ͽ� i��(index��) �ʱ�ȭ
				i = (i == player.length - 1) ? 0 : i + 1;
			}

			// ������ �ٽ� �������� �������� ���ϴ� reGame() �Լ�
			if (!reGame()) {
				break;
			}
		}
		System.out.println("���� ����");
	}
}
