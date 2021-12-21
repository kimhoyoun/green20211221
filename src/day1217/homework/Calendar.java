package day1217.homework;

import java.util.Scanner;

public class Calendar {
	// �� �Է�
	
	static int getNum() {
		int num;
		while(true) {
			try {
				num =sc.nextInt();
				break;
			}catch(Exception e) {
				System.out.println("���ڸ� �Է��ϼ���!\n");
				sc.next();
				continue;
			}
		}
		return num;
	}
	static int getMonth() {
		 System.out.print("�� �Է� >> ");
		 int month = getNum();
		// ���� 1 : ��¥�Է� ��ȿ�� üũ ����.
		while (!((month >= 1) && (month <= 12))) {
			try {
				System.out.printf("�߸��Է��߽��ϴ�.(1 ~ 12 ���̰� �Է�)\n");
				System.out.print("�� �Է� >> ");
				month = sc.nextInt();
			} catch (Exception e) {
				System.out.print("���ڸ� �Է� �ϼ���!\n");
				sc.next();
				continue;
			}
		}
		return month;
	}
	
	static int getDay(int month,int[]days) {
		System.out.print("�� �Է� >> ");
		int day = getNum();

		// ���� 1 : ��¥�Է� ��ȿ�� üũ ����.
		while (!((day >= 1) && (day <= days[month-1]))) {
			try {
				System.out.println("���� 1");
				System.out.printf("�߸��Է��߽��ϴ�.(%d���� %d�ϱ��� �ֽ��ϴ�)\n",month,days[month-1]);
				System.out.print("�� �Է� >> ");
				day = sc.nextInt();
			} catch (Exception e) {
				System.out.print("���ڸ� �Է� �ϼ���!\n");
				sc.next();
				continue;
			}
		}
		
		return day;
	}
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int []days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int month = getMonth();
		int day = getDay(month, days);
		
		int total = days[month-1]-day;
		
		// ���� 2 : 0�� 0�Ϻ��� 1���� ���� ��¥�� 00���Դϴ�.
		for(int i = month; i<days.length; i++) {
			total += days[i];
		}
		System.out.println("���� 2");
		System.out.printf("%d�� %d�Ϻ��� 1���� ���� ��¥�� %d�Դϴ�. \n",month,day,total);
		
		// ���� 3 : �Է¿� ���� 100�� �� ��¥ ���.
		int nDay  = day;
		int nMonth = month;

		for(int i = 0; i<100; i++) {
			nDay += 1;
			if(nDay > days[nMonth-1]){
				nDay = 1;
				nMonth++;
				if(nMonth>12) {
					nMonth =1;
				}
			}
		}
		System.out.println("���� 3");
		System.out.printf("%d�� %d�Ϻ��� 100�� �Ĵ� %d�� %d�� �Դϴ�.\n",month, day, nMonth, nDay);
		
		// ���� 4 : Ȯ���غ��� - Ư�� ��¥(�Է�)�� ��¥ ���
		System.out.println("���� 4");
		System.out.print("���� �� ��¥�� �˰�ͳ���?(�����Է�)>> ");
		int next = getNum();
		nDay  = day;
		nMonth = month;

		for(int i = 0; i<next; i++) {
			nDay += 1;
			if(nDay > days[nMonth-1]){
				nDay = 1;
				nMonth++;
				if(nMonth>12) {
					nMonth =1;
				}
			}
		}
		System.out.printf("%d�� %d�Ϻ��� %d�� �Ĵ� %d�� %d�� �Դϴ�.\n",month, day, next, nMonth, nDay);
		
	}

}
