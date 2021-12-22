package day1221.org.miniproj;

import static java.lang.System.out;

import java.io.IOException;
import java.util.Scanner;


class Student {
	public int no;
	public String name;
	public int kor, eng, mat;
	public int sum;
	public double avg;
	public String grade;
	public int rank;

	public Student() {
		// ����Ʈ ������ - ���ڰ� ����. �ƹ��ϵ� ���� �ʴ´�.
	}

	public Student(int no, String name, int kor, int eng, int mat) {
		this.no = no;
		this.name = name; 
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;

		sum = kor + eng + mat;
		avg = sum / 3.0;
		grade = abc(avg);
	}
	// ����, ���, ������ ����� �ش�.
	
	// ��ü�� ����ϸ� toString()�� �ڵ� ȣ�� �ȴ�.
	@Override
	public String toString() {
		return no + "\t" + name + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + sum + "\t" + String.format("%.2f",avg) + "\t" + grade + "\t"
				+ rank;
	}
	
	// ���� ��� �Լ� (�Է� avg(���))
	// 100��,90����: A  80����: B  70���� : C  60���� : D  60�� �̸� : F
	public String abc(double avg) {
		String grade = "F";
		switch ((int) avg / 10) {
		case 10:
		case 9:	grade = "A";break;
		case 8:	grade = "B";break;
		case 7:	grade = "C";break;
		case 6:	grade = "D";break;
		default:grade = "F";break;
		}
		return grade;
	}

}

public class MainCls {
	static Scanner sc = new Scanner(System.in);
	public static final int MAX = 100;
	static Student[] sArr = new Student[MAX];
	static int top = 0; // ���� �ڷᱸ��ó��.
	static int sequence = 1;
	static String[] title = {"��ȣ", "�̸�", "����","����","����","����","���","����","���"};
	
	// static �ʱ�ȭ ��
	static {
		sArr[top++] = new Student(sequence++, "KIM", 60, 60, 75);
		sArr[top++] = new Student(sequence++, "PARK", 90, 100, 95);
		sArr[top++] = new Student(sequence++, "LEE", 90, 80, 80);
		
		// �ʱ�ȭ�� ������� ��� ���
		rank(sArr);
	}
	
	static void math(Student s) {
		
		s.sum = s.kor + s.eng + s.mat;
		s.avg = s.sum/3.0;
		s.grade = s.abc(s.avg);
	}
	
	static void rank(Student[] s) {
		int[] score = new int[top];
		for(int i = 0; i<top; i++) {
			score[i] = s[i].sum;
		}
		
		for(int i =0; i<top; i++) {
			int r = top;
			for(int j =0; j<top; j++) {
				if(score[i] >score[j]) {
					r--;				
				}
				// ������ ���ٸ� no(��ȣ)�� ���� ����� ����� �� ����
				if((score[i] == score[j])&&(s[i].no<s[j].no)) {
					r--;
				}
			}
			s[i].rank = r;
		}
	}
	
	// ���ڸ� �Է¹޴� getNum
	static int getNum() {
		int num;
		while(true) {
			try{
				num = sc.nextInt();
				break;
			}catch(Exception e ) {
				out.print("���ڸ� �Է��ϼ���! >> ");
				sc.next();
				continue;
			}
		}
		return num;
	}
	
	public static int menu() {
		int no = 0;	
		out.println("1.�Է� 2.��� 3.�˻� 4.���� 5.���� 6.����");
		out.print("���� >> ");
		no = getNum();
		
		// ����ó�� �� ��ȿ�� üũ
		while (no < 1 || no > 6) {
			System.out.println("�߸��Է��߽��ϴ�! 1~6�� ����ּ���!");
			out.println("1.�Է� 2.��� 3.�˻� 4.���� 5.���� 6.����");
			out.print("���� >> ");
			no = getNum();
		}
		return no;
	}

	public static void run() {
		switch (menu()) {
		case 1:	input();break;
		case 2:	output();break;
		case 3:	search();break;
		case 4:	modify();break;
		case 5:	delete();break;
		case 6:	end();break;
		default: out.print("--- �ش���� �����ϴ�! ---");
		}
		rank(sArr);
		System.out.println("--------------------------------------");
	}
	
	
	// ���� ��ȿ�� ��
	static int getScore(String s) {
		int score =0;
		out.printf("%s���� >> ",s);
		score = getNum();
		while(score<0||score>100) {
			System.out.println("������ �ʰ��߽��ϴ�.");
			out.printf("%s����(0~100��) >> ",s);
			score = getNum();
		}
		return score;
	}

	// Ÿ��Ʋ ����ϴ� �Լ�
	static void title() {
		for(String t : title) {
			out.printf("%s\t",t);
		}
		out.println();
	}
	
	// �Է��� ���� �̸��� �л��� �ִٸ� �� �л��� index�� return�ϴ� stdIndex()
		// �̸��� ��ġ�ϴ� �л��� ���ٸ� -1 ��ȯ
	static int stdIndex(String name) {
		int index=-1;
		for(int i=0; i<top; i++) {
			if(name.equals(sArr[i].name)) {
				index = i;
			}
		}
		return index;
	}
	// ��ȣ�� �л����� ���
	static void numOut() {
		for (Student std : sArr) {
			if (std == null)
				break;
			out.println(std);
		}
	}
	// ����� �л����� ���
	static void rankOut() {
		// ��� ������� ���� ������ sArr_r ��ü�迭�� �л� ����ŭ�� ũ��� ���� 
		Student[] sArr_r = new Student[top];
		for(int i = 1; i<top+1; i++) {
			for(int j = 0; j<top; j++) {
				// 1����� sArr_r[] 0�� index���� ������� ����
				if(sArr[j].rank == i) {
					sArr_r[i-1] = sArr[j];
				}
			}
		}
		
		for(Student std : sArr_r) {
			if(std== null)
				break;
			out.println(std);
		}
	}
	private static void input() {
		out.println("::::: INPUT :::::");
		// ����, ����, ����, ������ �Է� �迭�� �Է� �޴´�.
		// �Է� ���� ������ ������ ������ ���, ����� ����,
		// �Է� �� �л��� ����� ���õǾ� ����.
		String name = "";
		// �̸��� �ߺ��� ������� �ʰ� �ߺ��ȴٸ� �ٽ� �Է¹޵��� ��.
		while(true) {
			out.print("�̸� >> ");
			name = sc.next();
			if(stdIndex(name) != -1) {
				out.printf("%s �л� ������ �̹� �ֽ��ϴ�.\n�ٽ� �Է��� �ּ���!(���Ḧ ���Ͻø� \"����\" �Է�)\n",name);
			}else if(name.equals("����")){
				out.println("INPUT ����");
				return;
			}else {
				break;
			}
		}
		
		int kor =getScore("����");
		int eng =getScore("����");
		int mat =getScore("����");
		
		sArr[top++] = new Student(sequence++,name,kor,eng,mat);	
		System.out.printf("%s�л��� ������ �ԷµǾ����ϴ�. \n",name);
	}
	
	private static void output() {
		out.println("::::: OUTPUT :::::");
		// �迭�� ��� ���
		// ��ȣ, ����, ����, ����, ����, ����, ���, ����, ���, ����(��� or ��ȣ)
		out.println("���� ����� ������ �ּ���");
		out.print("1. ��ȣ 2. ��� >> ");
		int num = getNum();
		while(num<0||num>2) {
			out.println("������ ������ϴ�!");
			out.print("1. ��ȣ 2. ��� >> ");
			num = getNum();
		}
		
		switch(num) {
		case 1: 
			title();
			numOut();
			break;
		case 2: 
			title();
			rankOut();
			break;
		}
	}
	private static void search() {
		out.println("::::: SEARCH :::::");
		// �̸����� �˻�
		out.print("�˻��� �л��� �̸��� �˷��ּ��� >> ");
		String name = sc.next();
		int index = stdIndex(name);
		if(index == -1) {
			out.printf("%s �л��� �����Ͱ� �����ϴ�! \n",name);							
		}else {
			System.out.printf("%s�л��� ������ �˻��Ǿ����ϴ�. \n",name);
			title();
			System.out.println(sArr[index]);
		}
	}
	
	private static void modify() {
		out.println("::::: MODIFY :::::");
		out.print("������ �л��� �̸��� �˷��ּ��� >> ");
		String name = sc.next();
		int index = stdIndex(name);
		// �̸����� �˻� �� ����
		if(index != -1 ){
		out.println("1.�̸� 2.�������� 3.�������� 4.��������");
		out.print("������ ������ ������ �ּ��� >> ");
		int num = getNum();
		
		while(num<0||num>4) {
			out.println("������ ������ϴ�! ");
			out.println("1.�̸� 2.�������� 3.�������� 4.��������");
			out.print("������ ������ �ٽ� ������ �ּ��� >> ");
			num = getNum();
		}
		
			switch(num) {
			case 1 : 
				out.print("�̸��� �ٽ� �Է��� �ּ��� >> ");
				String newName = sc.next();
				sArr[index].name = newName;
				break;
			case 2:
				out.println("���� ������ �ٽ� �Է��� �ּ��� ");
				int newKor = getScore("����");
				sArr[index].kor = newKor;
				math(sArr[index]);
				break;
			case 3:
				out.println("���� ������ �ٽ� �Է��� �ּ��� ");
				int newEng = getScore("����");
				sArr[index].eng = newEng;
				math(sArr[index]);
				break;
			case 4:
				out.println("���� ������ �ٽ� �Է��� �ּ��� ");
				int newMat = getScore("����");
				sArr[index].mat = newMat;
				math(sArr[index]);
				break;
				}
			System.out.printf("%s�л��� ������ �����Ǿ����ϴ�. \n",name);
		}else {
			out.printf("%s �л��� �����Ͱ� �����ϴ�! \n",name);
		}
		
	}

	private static void delete() {
		out.println("::::: DELETE :::::");
		// �̸����� �˻� �� ����
		out.print("������ �л��� �̸��� �˷��ּ��� >> ");
		String name = sc.next();
		int index = stdIndex(name);
		
		if(index == -1) {
			out.printf("%s �л��� �����Ͱ� �����ϴ�! \n",name);
		}
		else {
			// �л������� �������� �ѹ� �� �����.
			char yes = 'n';
			out.printf("%s�л��� ������ �����Ͻðڽ��ϱ�? (y/n) >> ",name);
			yes = sc.next().charAt(0);
			while(!(yes=='y'||yes=='n')) {
				out.println("y�� n �߿� ������ �ּ���! ");
				out.printf("%s�л��� ������ �����Ͻðڽ��ϱ�? (y/n) >> ",name);
				yes = sc.next().charAt(0);
			}
			
			if(yes == 'y') {
				sArr[index] = null;
				if(index != top) {
					for(int i = index+1; i<top; i++) {
						sArr[i].no--;
						sArr[i-1] = sArr[i];
					}
					// �л��� 1����
					top--;
					// �������̿��� �л��� ����Ǿ��ִ� �� null ó��
					sArr[top] = null;
				}
				System.out.printf("%s�л��� ������ �����Ǿ����ϴ�. \n",name);
			}else {
				out.printf("%s�л��� ������ �������� �ʰ� �����߽��ϴ�.\n",name);
			}
		}
	}

	private static void end() {
		out.println("::::: END :::::");
		System.out.println("���α׷� ����!");
		System.out.println("�����ϼ̽��ϴ�!");
		System.exit(0);
	}

	public static void main(String[] args) {
		out.println("::::: ���� ��� ���α׷� :::::");
		while (true) {
			run();
		}
	}
}
