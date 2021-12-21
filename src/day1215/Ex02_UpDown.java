package day1215;

import java.io.IOException;
import java.util.Scanner;

public class Ex02_UpDown {
	
	static Scanner sc = new Scanner(System.in);
	
	static int getNum() {
		int num = 0;
		int ch = 0;
		try {
			while ((ch=System.in.read()) != '\n') {
				if(ch>='0'&& ch<='9') {
					num = num*10 +ch -'0';
				}
			}
		} catch (IOException e) {}
		return num;
	}
	
	// ���� a�� b�� ���ϴ� compare() �Լ�
	public static int compare(int a, int b) {
		if(a == b) {
			return 0;
		} else if (a<b) {
			return 1;
		} else {
			return -1;
		}
	}
	// game()�� ����Ǿ��� �� 
	// ����Ƚ��(cnt)���� Ȯ���� �ǰ����� ������ ������� �Ǵ��ϴ� status() �Լ�
	static void status(int cnt) {
		if(cnt == 0) {
			System.out.println("��ȸ�� ��� ���� �ߴ�. �ǰ� !");
		}
	}
	
	// �Է¹��� userNum�� ��ȿ�� üũ�ϴ� �Լ�
	static int getUserNum(int min, int max) {
		System.out.printf("����� �Է�(%d ~ %d����) >>> ",min, max);
		int userNum = getNum();
		
		// �Է¹��� userNum�� ��ȿ�� üũ
		while(userNum<min||userNum>max) {
			System.out.println("�Է� ������ ���� �����ϴ�.");
			System.out.printf("�ٽ� �Է�(%d ~ %d����) >>> ",min, max);
			userNum = getNum();
		}
		
		return userNum;
	}
	public static void game() {
		// ��ǻ�Ͱ� 1 ~ 100 ������ ������ ����(����) ���� 
		// ����ڰ� 5ȸ �ȿ� ���߱�
		int min =1, max = 100;
		int cnt = 5;
		int sysNum = (int)(min + Math.random()*100);
		System.out.println("�ý����� ������ ���� �߽��ϴ�.("+sysNum+")");
		
		// ����Ƚ��(cnt)�� ���������� while()�� ����
		while(cnt>0) {
			// ����ڰ� �Է� �޾Ƽ� ���ϱ�
			System.out.println("���� �õ� Ƚ�� "+cnt);
			
			// ����ڰ� �Է��� ���� ������ �´��� Ȯ���ϰ�
			// ��ȿ�� ���̸� �� ���� ��ȯ�ϴ� getUserNum()�� ����Ͽ� userNum �ʱ�ȭ
			int userNum = getUserNum(min, max);
			
			// ����ڰ� �Է��� ���� �������� ������ ���� ���Ͽ�
			// ����� ��� (������ 0, ������-1, ������ 1)
			int result = compare(sysNum,userNum);
			
			// result �������� ����ڰ� �Է��� ���� ��� �ܼ�â�� ���
			// �¾��� �� while�� ����, �ٸ��� ��Ȳ �˷��ְ� max, min �� ����
			if (result == 0) {
				System.out.println("����!");
				break;
			}
			else if(result == 1) {
				// �ʹ� ū ���� �Է� -> max�� ���� ����
				System.out.println("�ʹ� ū �����Դϴ�!");
				max = userNum-1;
			}else {
				// min ���� ����
				System.out.println("�ʹ� ���� �����Դϴ�!");
				min = userNum+1;
			}
			// while�� �ѹ� �ݺ� �� �� ���� �ݺ�Ƚ�� 1�� ����
			cnt--;
		} // end of while
		
		// ���߰� ���°ǰ�? cnt�� �ٵǾ ���°ǰ�?
		// cnt�� 0�̸� ���߰� ���°�, 0�� �ƴϸ� �׳� �ǰ�!
		status(cnt);
	}
	
	public static void main(String[] args) {
		// ���� ���� ���� (ī�� ���߱�)
		// ��ǻ�Ͱ� 1 ~ 100 ������ ������ ����(����) ����
		// ����ڰ� 5ȸ �ȿ� ���߱�
		// ��õ� �����ϰ� ����
		// --- �Է� �� ���ڰ� �³�? Ʋ����? �Ǻ�
		// --- ������ ����, Ʋ���� �۴�/ũ�ٸ� ���
		
		// res
		// 0 : ����
		// 1 : �ڰ� ŭ
		// 2 : �ڰ� ����
		
		while(true) {
			System.out.println("--- ���� ���� ---");
			game();
			
			// ���� ����� or ����
			System.out.print("��� �Ͻðڽ��ϴ�?(y/n) >> ");
			char isLoop = sc.next().charAt(0);			
			
			// ��ȿ�� ��
			while(!(isLoop == 'n'||isLoop =='y')) {
				System.out.println("y�Ǵ� n�� �Է��ϼ���!");
				System.out.print("��� �Ͻðڽ��ϴ�?(y/n) >> ");
				isLoop = sc.next().charAt(0);				
			}
			
			if(isLoop=='n') {
				break;
			}
		}
		System.out.println("�����߽��ϴ�!!!");
	}

}
