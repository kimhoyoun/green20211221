package day1215;

public class Ex03_Sum {

	public static void main01(String[] args) {
		// 1+2+3+4+5+6+7+8+9+10 = 55
		// while ������ ����
		final int MAX = 10;
		// �����ϴ� ������ 0���� �ʱ�ȭ
		int sum = 0; // 1���� 10���� ����
		int num = 1; // 1���� 10���� �ϳ��� ���� �뵵
		while (num <= MAX) {
			sum += num;
			System.out.print(num);
			System.out.print(num != MAX ? "+" : "=");
			num++;
		}
		System.out.println(sum);
	}

	// ���� § �ڵ�
	public static void main02(String[] args) {
		// 1+2-3+4-5+6-7+8-9+10 = 7
		final int MAX = 10;
		// �����ϴ� ������ 0���� �ʱ�ȭ
		int sum = 0; // 1���� 10���� ����
		int num = 1; // 1���� 10���� �ϳ��� ���� �뵵
		while (num <= MAX) {

			sum = ((num % 2 != 0) && (num != 1)) ? sum - num : sum + num;

			if (num == 1) {
				System.out.print(num);
			} else if (num % 2 == 0) {
				System.out.print("+");
				System.out.print(num);
			} else {
				System.out.print("-");
				System.out.print(num);
			}
			num++;
		}
		System.out.println(" = " + sum);
	}

	// ����� �ڵ�
	public static void main03(String[] args) {
		// 1+2-3+4-5+6-7+8-9+10 = 7
		final int MAX = 10;
		final int MIN = 1;
		// �����ϴ� ������ 0���� �ʱ�ȭ
		int sum = 0; // 1���� 10���� ����
		int num = MIN; // 1���� 10���� �ϳ��� ���� �뵵

		// 1. 1~10 ���� ��� (num�� �����ϸ鼭 ���)

		while (num <= MAX) {
			System.out.print(num);
			// num�� Ȧ���̸�
			if (num % 2 != 0) {
				// ���׿����ڸ� ����� �ڵ� ����ȭ
				// sum�� num�� Ȧ���̰� 1�϶� num�� ����,
				// 1�� �ƴҶ� sum���� num��ŭ ����
				sum = (num == MIN) ? num : sum - num;
				System.out.print("+");
				// num �� ¦���϶�
			} else {
				sum += num;
				// ¦���϶� ������ ����(10)�϶� "="���
				// �׿ܿ��� "-" ���
				System.out.print(num == MAX ? "=" : "-");
			}
			num++;
		}
		System.out.println(sum);
	}

	public static void main04(String[] args) {
		// �Ǻ���ġ ���� ����
		// 1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 = 54
		final int MAX = 21;

		int prev = 0; // ����
		int curr = 1; // ����
		int next = 0; // ����
		int sum = 0;
//		while��

		// curr ���� MAX(21)���� �۰ų� ������ while�� ����
		while (curr <= MAX) {

			sum += curr;

			System.out.print(curr);
			// curr ���� MAX�� �����ϸ� "="�� ���
			// �׿ܿ��� "+" ���
			System.out.print(curr == MAX ? "=" : "+");

			// ġȯ�ؼ� ��������
			// �������� ������ + ������
			next = curr + prev;
			// �������� ���������� ġȯ
			prev = curr;
			// �������� ���������� ��ȯ(���ο� ������)
			curr = next;

		}

//		// for�� ����
//		for(int p=0 ,c=1, n=0; c<=MAX; n=p+c, p=c, c=n) {
//			sum += c;
//			System.out.print(c);
//			System.out.print(c==MAX ? "=":"+");
//		}
//		
		System.out.println(sum);
	}
	
	// �� �ڵ�
	public static void main05(String[] args) {
		// �Ǻ���ġ ����
		// 1 + 1 - 2 + 3 - 5 + 8 - 13 + 21 = 14
		final int MAX = 21;
		int prev = 0; // ����
		int curr = 1; // ����
		int next = 0; // ����
		int sum = 0;
		// �ݺ��Ǵ� Ƚ���� ��Ÿ���� ������ count ���� �����ϰ� 1�� �ʱ�ȭ
		int count = 1;
		// curr�� MAX���� �۰ų� ������ while�� ����
		while (curr <= MAX) {

			System.out.print(curr);
			// while�� loop�� Ȧ����°�� ������ ��
			if ((count % 2 != 0)) {
				// ù��° �����̸� sum�� curr�� ���ϰ�
				// �׿ܿ��� curr �� ����
				sum = (count == 1) ? sum + curr : sum - curr;
				// Ȧ����° �ݺ��� �� "+" ���
				System.out.print(" + ");

				// while�� loop�� ¦����°�� ����� ��
			} else {
				sum += curr;
				// curr ���� MAX�� �����ϸ� "=" ���
				// �׿ܿ��� "-"���
				System.out.print((curr == MAX) ? " = " : " - ");
			}

			// �������� ������ + ������
			next = curr + prev;
			// �������� ���������� ġȯ
			prev = curr;
			// �������� ���������� ��ȯ(���ο� ������)
			curr = next;
			
			// ������ ������ 1����
			count++;
		}
		System.out.println(sum);
	}
	
	// ����� �ڵ�
	public static void main(String[] args) {
		// �Ǻ���ġ ����
		// 1 + 1 - 2 + 3 - 5 + 8 - 13 + 21 = 14
		
		final int MAX = 21;
		int prev = 0; // ����
		int curr = 1; // ����
		int next = 0; // ����
		int sum = 0;
		
		// flag �˰���
		boolean flag = true;
		
		while(curr<=MAX) {
			System.out.print(curr);
			
			
			if(flag) {
				sum = curr ==1? curr : sum - curr;
				System.out.print(" + ");
				flag = false;
			}else {
				sum += curr;
				System.out.print((curr == MAX) ? " = " : " - ");
				flag = true;
			}
			
			next = curr + prev;
			prev = curr;
			curr = next;
			
		}
		System.out.println(sum);
	}
}
