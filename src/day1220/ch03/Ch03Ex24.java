package day1220.ch03;

import java.util.Arrays;
import java.util.Scanner;

public class Ch03Ex24 {
static Scanner sc = new Scanner(System.in);
	public static void main01(String[] args) {
		String[] names = new String[3];
		
		// �̸� 3���� ���������� �Է��ؼ� ����ϱ�
		for(int i=0; i<names.length; i++) {
			System.out.printf("%d��° �̸� �Է� >> ",i);
			names[i] = sc.next();
		}
		
		System.out.println(Arrays.toString(names));
		//�˻��� �Է�
		System.out.print("�˻��� �Է� >> ");
		String keyWord = sc.next();
		for(int i =0; i<names.length; i++) {
			if(names[i].indexOf(keyWord)!=-1) {
				System.out.println(names[i]);
			}
		}
	}
	public static void main(String[] args) {
		String[] names = {"ȫ�浿","�̼���","������"};
		int[][] score = {{95,100},{100,95},{80,85}};
		
		// ����	����	����	����
		// ȫ�浿	95	100	195
		// �̼���	100	95	195
		// ������	80	85	165
		String[] title = {"����","����","����","����"};
		
		for(int i =0; i<title.length; i++) {
			System.out.printf("%s\t",title[i]);
		}
		System.out.println();
		
		for(int i =0; i<names.length; i++) {
			int sum =0;
			System.out.printf("%s\t",names[i]);
			for(int j = 0; j<score[i].length; j++) {
				sum += score[i][j];
				System.out.printf("%d\t",score[i][j]);
			}
			System.out.printf("%d\n",sum);
		}
	}
}
