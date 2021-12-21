package day1217;

import java.util.Arrays;
import java.util.Scanner;

public class Ex06_Array {

	public static void main_note(String[] args) {
		// 1���� �迭
		// �迭�̶�?

		// �ڹ��� �迭���� �߰�ȣ {} ���.
		// �迭�� Ÿ���� �迭 Ÿ��.
		// �迭 ������Ʈ�̴�.
		// �迭�� ���޸𸮿� ���������.

		// ��Ʈ�� �迭 Ÿ�� - Ư��Ÿ�Կ� ���Ĺ���� ���̸� �迭 Ÿ�Եȴ�.
		String[] a;
		// ��Ʈ �迭 Ÿ��
		int[] b;
		// char 2����Ʈ������ ��� �迭�� ���������� ������ �����ϴ� 4����Ʈ�̴�.
		// �������� ��� �����̴�.
		// �迭�� ������Ʈ�̹Ƿ� ������ ���������� �ȴ�.
		char[] c;
	}

	public static void main00(String[] args) {
		// �迭 ����� ���ÿ� �ʱ�ȭ �ϱ�
		// �迭�� ���ͷ�
		int[] arr = { 10, 20, 30, 40 };

		// �迭 ���
		System.out.println(Arrays.toString(arr));

		// �ݺ����� �̿��ؼ� �迭 ���
		// �迭�� ù��° ����� ÷�ڴ� 0�̰� �迭�� ������ ����� ÷�ڴ� �迭ũ��-1�̴�.
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("arr[arr.length-1] ===> " + arr[arr.length - 1]);
	}

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// �Լ��� ���ڷ� �迭�� ������ ���ÿ� �����ϰ��� �Ҷ� ���.
		// main00(new String[]{"aa","bb","ccc"});

		// ��¥ �������� �ƴ� �迭 ������ ����
		int[] days;
		// �迭 ���� �Ŀ� �迭�� �����ϱ� - new �����ڸ� ����ؾ� �Ѵ�.
		days = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		System.out.printf("1���� %d�����Դϴ�.\n", days.length);

		System.out.print("�� �Է� >> ");
		int month = sc.nextInt();

		System.out.printf("%d���� %d�ϱ��� �ֽ��ϴ�.\n", month, days[month - 1]);

		// 1���� 365���Դϴ�.
		int total = 0;
		for (int i = 0; i < days.length; i++) {
			total += days[i];
		}
		System.out.printf("1���� %d���Դϴ�.\n", total);

		// ��¥�Է�
		// ��ȿ�� üũ
		System.out.print("�� �Է�>> ");
		int day = sc.nextInt();
		// ���� 1 : ��¥�Է� ��ȿ�� üũ ����.
		while (!((day >= 1) && (day <= days[month-1]))) {
			System.out.printf("�߸��Է��߽��ϴ�.(%d���� 1~%d�ϱ��� �ֽ��ϴ�)",month,days[month-1]);
			System.out.print("�� �Է� >> ");
			month = sc.nextInt();
		}

		// 1�� 1�Ϻ��� �Է¹��� ��/�ϱ��� ������ �������ϴ�.
		total = day;
		for(int i =0; i<month-1; i++) {
			total+= days[i];
		}
		System.out.printf("1�� 1�� ���� %d�� %d�ϱ��� %d���� �������ϴ� \n",month,day,total);
		
		// ���� 2 : 0�� 0�Ϻ��� 1���� ���� ��¥�� 00���Դϴ�.
		// ���� 3 : �Է¿� ���� 100�� �� ��¥ ���.
		// ���� 4 : Ȯ���غ��� - Ư�� ��¥(�Է�)�� ��¥ ���
	}
}
