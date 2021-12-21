package day1214;

import java.util.Scanner;

public class Homework2 {
	public static Scanner sc = new Scanner(System.in);

	public static void main16(String[] args) {
		String str[] = { "����", "����", "��" };
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		while (true) {

			int n = (int) (Math.random() * 3);
			System.out.print("���� ���� ��! >> ");
			String user = sc.next();
			if(user.equals("�׸�")) {
				break;
			}
			if (user.equals(str[n])) {
				System.out.printf("����� = %s , ��ǻ�� = %s, �����ϴ�.\n", user, str[n]);
				continue;
			}

			String win = "";
			switch (user) {
			case "����":
				win = str[n].equals("����") ? "��ǻ��" : "�����";
				break;
			case "����":
				win = str[n].equals("��") ? "��ǻ��" : "�����";
				break;
			case "��":
				win = str[n].equals("����") ? "��ǻ��" : "�����";
				break;
			}
			System.out.printf("����� = %s , ��ǻ�� = %s, %s�� �̰���ϴ�.\n", user, str[n], win);
		}
		System.out.println("������ �����մϴ�..");
	}

	public static void main15(String[] args) {
		// �ٸ� Ŭ�������Ͽ� �ֽ��ϴ�.
	}

	public static void main14(String[] args) {
		String cource[] = { "Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�" };
		int score[] = { 95, 88, 76, 62, 55 };

		while (true) {
			System.out.print("���� �̸� >> ");

			String str = sc.next();
			if (str.equals("�׸�")) {
				break;
			}
			int i = 0;
			for (i = 0; i < cource.length; i++) {
				if (cource[i].equals(str))
					break;
			}
			if (i >= cource.length) {
				System.out.println("���� ���� �Դϴ�.");
			} else {
				System.out.printf("%s�� ������ %d\n", cource[i], score[i]);
			}

		}
	}

	public static void main13(String[] args) {
		int n = 1;
		while (n > 0 && n < 100) {
			if ((n % 10 == 3) || (n % 10 == 6) || (n % 10 == 9)) {
				if ((n / 10 == 3) || (n / 10 == 6) || (n / 10 == 9))
					System.out.printf("%2d �ڼ�¦¦ \n", n);
				else
					System.out.printf("%2d �ڼ�¦ \n", n);
			}
			n++;
		}
	}

	public static void main12(String[] args) {
		// �ٸ�Ŭ�������Ͽ� �ֽ��ϴ�.
	}

	public static void main11(String[] args) {
		// �ٸ�Ŭ�������Ͽ� �ֽ��ϴ�.
	}

	public static void main10(String[] args) {
		int[][] arr = new int[4][4];
		int count = 0;

		while (count < 10) {
			int n1 = (int) (Math.random() * 4);
			int n2 = (int) (Math.random() * 4);

			if (arr[n1][n2] == 0) {
				arr[n1][n2] = (int) (Math.random() * 10 + 1);
				count++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

	public static void main09(String[] args) {
		int[][] arr = new int[4][4];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * 10 + 1);
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void main08(String[] args) {
		int num = 0;
		System.out.print("���� �? ");
		num = sc.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100 + 1);
			System.out.printf("%3d ", arr[i]);
			if (i % 10 == 9)
				System.out.println();
		}

	}

	public static void main07(String[] args) {
		int[] num = new int[10];
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 10 + 1);
			System.out.print(num[i] + " ");
			sum += num[i];
		}
		System.out.println("\n����� " + (float) sum / num.length);

	}

	public static void main06(String[] args) {
		int money = 0;
		int[] unit = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };
		System.out.print("�ݾ��� �Է��Ͻÿ� >> ");
		money = sc.nextInt();

		for (int i = 0; i < unit.length; i++) {
			if (money >= unit[i]) {
				System.out.printf("%d��¥�� %d�� \n", unit[i], money / unit[i]);
				money %= unit[i];
			}
		}
	}

	public static void main05(String[] args) {
		int[] num = new int[10];

		System.out.print("���� ���� 10���� �Է��Ͻÿ� >> ");
		for (int i = 0; i < 10; i++) {
			num[i] = sc.nextInt();
		}
		System.out.print("3�� ����� ");
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 3 == 0) {
				System.out.print(num[i] + " ");
			}
		}

	}

	public static void main04(String[] args) {
		System.out.print("�ҹ��� �˹ٺ� �ϳ��� �Է��Ͻÿ� >> ");
		// �ѹ��� �Է¹ޱ�
		char c = sc.next().charAt(0);
		// �Է¹��� ���ĺ��� 'a'���� ���° ���� �˱����� 'a'�� ASCII Code 97�� c�� ASCII Code����
		// ���ְ� �׸�ŭ �ݺ���.
		for (int i = 0; i <= (int) c - 97; i++) {
			// 'a'���� �Է¹��� c���� ����ϰ� �ϳ��� �پ�鵵�� �ݺ� ������ �Ʒ�ó�� ����
			for (int j = 97; j <= (int) c - i; j++) {
				// int�� j�� ���ڷ� ����ϱ� ���� (char)�� ����ȯ
				System.out.print((char) j);
			}
			System.out.println();
		}

	}

	public static void main03(String[] args) {
		System.out.print("������ �Է��Ͻÿ� >> ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main02(String[] args) {
		int n[][] = { { 1 }, { 1, 2, 3 }, { 1 }, { 1, 2, 3, 4 }, { 1, 2 } };

		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				System.out.print(n[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main01(String[] args) {
//		(1) 0���� 100�̸����� ¦������ ����
//		(2) 
//		package homework_Ex.day12_14;
//
//		public class WhileTest {
//			public static void main(String[] args) {
//				int sum =0, i=0;
//				while(i<100) {
//					sum = sum+i;
//					i += 2;
//				}
//				System.out.println(sum);
//			}
//
//		}
//		(3) 
//		package homework_Ex.day12_14;
//
//		public class ForTest {
//			public static void main(String[] args) {
//				int sum = 0;
//				for(int i=0; i<100; i+=2) {
//					sum = sum+i;
//				}
//				System.out.println(sum);
//			}
//		}

//		(4)
//		package homework_Ex.day12_14;
//
//		public class DoWhileTest {
//			public static void main(String[] args) {
//				int sum = 0, i = 0;
//				do {
//					sum = sum+i;
//					i+=2;
//				}while(i<100);
//				
//				System.out.println(sum);
//			}
//		}

	}

}
