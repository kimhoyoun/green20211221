package day1220.ch03;

import java.util.Arrays;
import java.util.Scanner;

public class Ch03Ex23 {
	static Scanner scan = new Scanner(System.in);
	public static void main01(String[] args) {
		int[] score = {95,70,85,90,100,45,35,85,70,75};
		
		// 65�� �Է� �޾Ƽ� 65�� ������ true�� �ƴϸ� false�� ���.
		// �˻��� ���� >> 65
		// ��� 65�� �迭�� �����ϴ�.
		// 1. ������ �Է� �޴´�.
		// 2. �Է¹��� ������ �迭�� �ִ°�? �˻�
		// 3. �ִٸ� count�Ѵ�.
		
		
		System.out.print("�˻��� ���� >> ");
		int num = scan.nextInt();
		int count =0;
		for(int i =0; i<score.length; i++) {
			if(num == score[i]) {
				count++;
			}
		}
		
		if(count==0) {
			System.out.printf("��� : %d�� �迭�� �����ϴ�.",num);
		}else {
			System.out.printf("��� : %d�� �迭�� %d�� �ֽ��ϴ�.",num,count);
		}
	}
	public static void main02(String[] args) {
		// �迭�� ������ �Է� �޾Ƽ� ���� ū ������ ���� ���� ������ ���
		int[] score = new int[5];
		int max = 0, min=100;
		
		
		// score �迭 �ʱ�ȭ
		for(int i =0; i<score.length; i++) {
			System.out.print("���� �Է� "+i+">> ");
			score[i] = scan.nextInt();
		}
		
		// min max ����
		for(int i =0; i<score.length; i++) {
			if(max<score[i]) {
				max = score[i];
			}
			
			if(min>score[i]) {
				min = score[i];
			}
		}
		System.out.printf("max = %d, min = %d\n",max, min);
	}
	public static void main03(String[] args) {
		int[]score = {65,100,75,80,35,90};
		int[] rank = new int[score.length];
		
		  // ��� : [5, 1, 4, 3, 6, 2]
	      // 0. socre ����� ������ŭ �ݺ��ϸ鼭 ...
	      // 1. rank[i]��°�� 1�� �����Ѵ�.
	      // 2. score[i]��°���� ū ���� ��Ұ� �ִٸ� lank[i]�� �����Ѵ�.
	      //    (���� �迭�� ��ҳ��� ���ϱ�)
	      // �غ��⳪ �߾�? - ���ֿ�
		int size = score.length;
		for(int i=0; i<size; i++) {
			int r = 6; 
			for(int j=0; j<size; j++) {
				if(score[i]>score[j]) {
					r--;
				}
			}
			rank[i] = r;
		}
		
		System.out.println(Arrays.toString(score));
		System.out.println(Arrays.toString(rank));
		
	}
	 public static void main(String[] args) {
	      int[] score = {95,70,85,90,100,45,35,85,70,75};
	      
	      // ���� �˻� : 70
	      // ��� : 70�� 1��° 8��°�� �ֽ��ϴ�.
	      
	      // 1. �˻��� �Է� �ޱ�
	      // 2. score�� ��Ҹ�ŭ �ݺ�
	      // 3. �˻���� ���� ���� �ִٸ� ��ġ ���
	      
	      System.out.print("���� �˻� : ");
	      int keyWord = scan.nextInt();
	      System.out.printf("��� : %d��", keyWord);
	      boolean flag = false;
	      for(int i=0; i<score.length; i++) {
	         if(keyWord == score[i]) {
	            System.out.print(" " + i+"��°");
	            flag = true;
	         }
	      }
	      if(flag) {
	         System.out.println("�� �ֽ��ϴ�.");
	      } else {
	         System.out.println(" �����ϴ�.");
	      }
	   }

}
