package day1215;

import java.io.IOException;

public class Ex01_MinMax {
	
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
	
	static int input(String s) {
		System.out.print(s);
		return getNum();
	}
	
	public static void main(String[] args) {
		// ���� 3���� �Է� �޾Ƽ� ū��, �߰�, �������� �߷��ϴ� ���α׷��� �����.
		int a, b, c;
		int max = 0, mid =0, min=0;
		
		a = input("����a �Է� >> ");
		b = input("����b �Է� >> ");
		c = input("����c �Է� >> ");
		
		System.out.printf("%d %d %d\n",a, b, c);
		
		// �ǻ��ڵ�
		// ������ ���� ������ �� �ֵ��� �ۼ��� ��
		// 1. �ΰ��� ���ڸ� ���ؼ� ū���� max, �������� min �Է�
		// 2. ������ �Ѱ��� ���ڸ� max�� ���ؼ� max���� ũ�� maxġȯ (�� max�� mid�� ġȯ)
		// 3. ���� max���� �۴ٸ� �װ��� min�� ���ؼ� min���� �۴ٸ� minġȯ (�� min�� mid�� ġȯ)
		// 4. ������ max ���� ũ�� �ʰ� min���ٵ� ���� �ʴٸ� �װ��� mid
		
		if(a>b) {
			max = a;
			min = b;
		}else {
			max = b;
			min = a;
		}
		
		if(c > max) {
			mid = max;
			max = c;
		}else if(c<min){
			mid = min;
			min = c;
		}else {
			mid = c;
		}
		
		System.out.printf("%d, %d, %d \n",max,mid,min);
	}

}
