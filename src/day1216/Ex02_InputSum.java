package day1216;

import java.util.Scanner;

public class Ex02_InputSum {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main01(String[] args) {
		// �������� ������ �Է��Ѵ�. �������� -1�� �Է��Ѵ�.
		// -1�� �ԷµǱ� ������ ���ڸ� ��� �Է� �޴� ���α׷�.
		// �Է� ���� ���� �� -1�� ������ ���ڵ��� ����� ����Ѵ�.
		// avg = ����/count �ʿ�
		
		int total=0;
		int count = 0;
		double avg =0.0;
		
		System.out.println("-1�� �Էµɶ����� ���������� ���� �Է� �ޱ�.");
		System.out.print("�Է� >> ");
		int number = sc.nextInt();
		
		// number�� -1�� �ƴҶ� count 1����, �Է¹��� �� ����
		while(number != -1) {
			count++;
			total += number;
			number = sc.nextInt();
		}
		System.out.println("�Է� ��");
		
		// ����� �Ҽ��� �ڸ����� ��Ÿ�������� double������ ����ȯ �� ���
		avg = (double)total/count;
		System.out.printf("������ ������ %d��, ����� %.1f\n",count, avg);
	}
	
	public static void main(String[] args) {
		// �ܾ �Է� �޴� ���α׷� ����.
		// "��"�̶�� �Է� �ɶ����� �ܾ ��� �Է� �޴´�.
		// �Է� �� �ܾ�� �߿��� ���� �� �ܾ ����� ���α׷��� while���� �̿��ؼ� �����϶�.
		
		String str = "";
		
		System.out.println("\"��\"�� �Էµɶ����� ���������� �ܾ� �Է� �ޱ�.");
		System.out.print("�Է� >> ");
		str = sc.next();
		// ���̰� �ִ��� ���ڿ��� �����ϱ� ���� String ��ü mlong ����
		String mlong ="";
		
		while(!str.equals("��")) {
			
			// �Է¹��� ���ڿ��� ���̿� ���� �ִ������ ���ڿ��� ���̸� ���Ͽ�
			// �Է¹��� ���ڿ��� ���̰� �� ��� mlong�� �Է¹��� ���ڿ��� ����
			if(str.length()>mlong.length()) {
				mlong = str;
			}
			str = sc.next();
			
		}
		System.out.println("�Է� ��");
		System.out.printf("���� �� �ܾ�� %d������ \"%s\" �Դϴ�.",mlong.length(), mlong);
	}

}
