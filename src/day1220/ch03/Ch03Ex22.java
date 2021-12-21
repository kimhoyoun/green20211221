package day1220.ch03;

import java.util.Arrays;

public class Ch03Ex22 {

	public static void main00(String[] args) {
		String[] name = {"��¡��","�öѱ�","�뱸","����","�ź���"};
		int[] price = {9000, 3000, 5000, 6000, 20000};
		
		for(int i =0; i<name.length; i++) {
			System.out.printf("%s�� ������ %d���Դϴ�. \n",name[i],price[i]);
		}
	}
	
	public static void main01(String[] args) {
		int[] arr= {10,20,30,40,50};
		// Arrays�� �̿��ؼ� ������� ���
		System.out.println(Arrays.toString(arr));
		
		// �ݺ����� �̿��ؼ� arr�迭�� ��Ұ��� ��ġ�� reverse �Ѵ�.
		for(int i =0; i<arr.length/2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
	
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int [] arr = {7,3,2,8,1,6,9,4,5};
		System.out.println(Arrays.toString(arr));
		// �������� �����ؼ� ����Ͻÿ�.
		// ���� ����
		for(int i =0; i<arr.length-1; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("�������� arr1 : "+Arrays.toString(arr));	
		
		
		// ��������
		int [] arr2 = {7,3,2,8,1,6,9,4,5};
		for(int i =0; i<arr2.length-1; i++) {
			for(int j = 0; j<arr2.length-1-i; j++) {
				if(arr2[j] > arr2[j+1]) {
					int temp = arr2[j];
					arr2[j] = arr2[j+1];
					arr2[j+1] = temp;
				}
			}
		}
		System.out.println("�������� arr2 : "+Arrays.toString(arr2));	
		
		// ����
		// ��������
		int [] arr3= {7,3,2,8,1,6,9,4,5};
		for(int i =1; i<arr3.length; i++) {
			int key = arr3[i];
			for(int j = i-1; j>=0; j--) {
				if(arr3[j] > key) {
					arr3[j+1] = arr3[j];
					arr3[j] = key;
				}
			}
		}
		System.out.println("�������� arr3 : "+Arrays.toString(arr3));	
	}
	// �� �ڵ�
	public static void main03(String[] args) {
		final int SIZE = 6;
		int[] lotto1 = new int[SIZE];
	
		int num = (int)(1+Math.random()*45);
		lotto1[0] = num;
		
		for(int i=1; i<SIZE; i++) {
			num = (int)(1+Math.random()*45);
			int equal =0;
			
			for(int j =0; j<i; j++) {
				if(lotto1[j]==num) {
					equal++;
				}
			}
			
			if(equal == 0) {
				lotto1[i]=num;
			}else {
				i -=1;
			}
			
		}
		
		// �ζǹ�ȣ�� �ߺ� ���� �������� �����Ͻÿ�.
		System.out.println(Arrays.toString(lotto1));
		
		int[] lotto2 = new int[SIZE];
		
		for(int i =0; i<SIZE; i++) {
			num = (int)(1+Math.random()*45);
			for(int j =0; j<i; j++) {
				if(lotto2[j]==num) {
					num = (int)(1+Math.random()*45);
					j = -1;
				}
			}
			lotto2[i] = num;
		}
		System.out.println(Arrays.toString(lotto2));
		
		
		int[] lotto3 = new int[SIZE];
		num = (int)(1+Math.random()*45);
		int i = 0;
		
		while(i<SIZE) {
			num = (int)(1+Math.random()*45);
			for(int j =0; j<i; j++) {
				if(lotto3[j] == num) {
					num = (int)(1+Math.random()*45);
					j =-1;
				}
			}
			lotto3[i] = num;
			i++;
		}

		System.out.println(Arrays.toString(lotto3));
	}
	// ����� �ڵ� 1
	public static void main_lotto01(String[] args) {
		final int SIZE =6;
		int[] lotto = new int[SIZE];
		
		for(int i=0; i<SIZE; i++) {
			int num = (int)(1+Math.random()*45);
			// ���� ������ num�� ���� lotto�迭�� ����� ��Ҹ� ���Ѵ�.
			// num�� ���� ���� �̹� �ִٸ� �ٽ� num�� �����Ѵ�.
			// ���� ������ num�� lotto�� ��Ҹ� ���Ѵ�. (��� �ݺ�)
			for(int j =0; j<i; j++) {
				if(num == lotto[j]) {
					num = (int)(1+Math.random()*45);
					j = -1;
				}
			}
			
			lotto[i] = num;
		}
		
		System.out.println(Arrays.toString(lotto));
	}
	// ����� �ڵ� 2
	public static void main_lotto02(String[] args) {
		final int SIZE =6;
		int[] lotto = new int[SIZE];
		
		int cnt = 0;
		while(cnt<6) {
			lotto[cnt] = (int)(1+Math.random()*6);
			// cnt���� ���� �Ұ��ΰ� �����ΰ��� ���� ������ �Ǵ��� flag ����
			// �������� ������ false, �׷��� ������ true
			boolean flag = true;
			for(int i =0; i<cnt; i++) {
				// �ߺ��Ǹ� for�� Ż���ϰ� flag false
				if(lotto[cnt] == lotto[i]) {
					flag = false;
					break;
				}
			}
			// flag�� true�� ���� cnt ����
			if(flag) {
				cnt++;
				
			}
		}
		System.out.println(Arrays.toString(lotto));
	}
	
	public static void main_lotto3(String[] args) {
		// 1 ~ 45 ���� ����Ǿ� �ִ� �迭�� ���� (���� �ִٰ� ����)
		final int MAX = 6;
		int [] lotto = new int[6];
		int[] balls = new int[45];
		// 1 ~ 45���� ���� �� ����
		for(int i =1; i<=45; i++) {
			balls[i-1] = i;
		}
		System.out.println("1~45������ ���� �غ�Ǿ���.");
		// 1. balls�� index�� �����ϰ� �����Ѵ�.
		// 2. �� index ��ġ�� ��ȣ�� 0�� �ƴϸ� lotto �迭�� ����.
		// 3. �̾ƿ� index ��ġ�� ���� 0���� ����.
		// 4. index��ġ�� ���� 0�̸� �ٸ� ������ index ����.
		
		// ����� �ڵ�
		for(int i=0; i<lotto.length;) {
			int index = (int)(Math.random()*45); // 0 ~ 44������ ���� �߻�
			if(balls[index]!=0) {
				lotto[i] = balls[index];
				balls[index]=0;
				i++;
			}
		}
		System.out.println(Arrays.toString(lotto));
		
		// �� �ڵ�
//		for(int i =0; i<6; i++) {
//			// ��ġ�� �����ϰ� �̾Ƽ� �� ��ġ�� ���� ����
//			int num = (int)(Math.random()*45);
//			// balls�� ���� 0�̸� num �ٽ� �̰� i 1���ҽ�Ű�� �ݺ�
//			if(balls[num] == 0) {
//				num = (int)(Math.random()*45);
//				i--;
//			// balls ���� 0�� �ƴϸ� �ش� �� lotto�� �����ϰ� balls[num]�� 0���� �ٲ�.
//			}else {
//				lotto[i] = balls[num];
//				balls[num] = 0;
//			}
//		
//		}
//		System.out.println(Arrays.toString(balls));
//		System.out.println(Arrays.toString(lotto));
		

		
	}
}
