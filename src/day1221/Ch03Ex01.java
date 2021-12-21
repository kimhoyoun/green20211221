package day1221;

import java.util.Scanner;

public class Ch03Ex01 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int [] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		int month = 0, day=0;
		int total =0;
		int nextMonth = 0, nextDay = 0;
		
		System.out.print("�� �Է� >>");
		month = sc.nextInt();
		while(month<1||month>12) {
			System.out.println("�� �Է� ����: ������ ������ϴ�!");
			System.out.print("�� �ٽ� �Է�(1~12����) >>");
			month = sc.nextInt();
		}
		System.out.print("�� �Է� >>");
		day = sc.nextInt();
		while(day<1||day>days[month-1]) {
			System.out.println("�� �Է� ����: ������ ������ϴ�!");
			System.out.printf("�� �ٽ� �Է�(1~%d����) >>",days[month-1]);
			day = sc.nextInt();
		}
		
		System.out.printf("%d���� %d�ϱ��� �ִ�. \n",month, days[month-1]);
		System.out.printf("%d���� ���� ��¥�� %d���̴�.\n",month,days[month-1]-day);
		// 1�� 1�Ϻ��� �Է³�¥���� total�� ����
		total = day; 	
		for(int i =0; i<month-1; i++) {
			total+= days[i];
		}
		System.out.printf("1�� 1�Ϻ��� %d�� %d���� %d�� �������ϴ�.\n",month, day, total);
		
		
		// 1���� ���� ��¥ ���ϱ�
		total = days[month-1] -day;
		for(int i =month; i<days.length;i++) {
			total+= days[i];
		}
		System.out.printf("%d�� %d�� ���� 1���� ���� ��¥�� %d���Դϴ�.\n",month,day,total);
		
		// ���� ���� ���� ��¥�� total �ʱ�ȭ
		System.out.print("���� �� ��¥�� �˰� �ͳ���? >>> ");
		int dd = sc.nextInt();
		// ���� ���� ���� ���� ��¥���� ���� ���ڰ� ������ �׳� ������� day+dd�̴�. �߰��ϸ��
//		if(days[month-1]-day<dd) {
//			nextDay = day + dd;
//			total = nextDay;
//		}else {
//			total = dd-(days[month-1]-day); 
//		}
		
		total = dd-(days[month-1]-day); 
		// 12���̸� �������� 1���̹Ƿ�
		// �����ߴµ� 12���� ũ�� 12�� ������ 12���� ū ���̵��� �ʰ���(out of boundary exception ����)
		int i = month%12;
		for(; total>days[i];i++,i%=12) { 	
			total -= days[i];
		}
		nextMonth = i+1;
		nextDay = total;
		System.out.println(dd+"�� �Ĵ� "+nextMonth+"�� "+nextDay+"��");
	}

}
