package homework;

public class Ex01 {

	public static void main01(String[] args) {
//		1. 4
	}

	public static void main02(String[] args) {
//		2. 4
	}

	public static void main03(String[] args) {
//		3. 3
	}

	public static void main04(String[] args) {
//		4. 2
	}

	public static void main05(String[] args) {
//		5. 1
	}

	public static void main06(String[] args) {
//		6. 
//		(1)
//		Class TV{
//			private int size;
//			private String manufacturer;
//			public TV() {
//				this(32,"LG");
//			}
//			public TV(String manufacturer) {
//				this(32,manufacturer);
//			}
//			public TV(int size, String manufacturer) {
//				this.size = size;
//				this.manufacturer = manufacturer;
//				System.out.println(size + "��ġ "+manufacturer);
//			}
//		}
//		(2)
//		new TV();  => 32��ġ LG
//		new TV("�Ｚ");  => 32��ġ �Ｚ
		
//		(3)
//		new TV(65,"�Ｚ");
		
//		(4)
//		�ڵ� ���� ����
	}

	public static void main07(String[] args) {
//		7. 
//		private int age�� setter�޼ҵ带 ���� age���� �Ű������� �Ͽ� ���� �����ϰ�
//		public void setAge(int age) {
//			this.age = age;
//		}
//		getter�޼ҵ带 ���� age�� ���� ��ȯ�޴´�.
//		public int getAge() {
//			return age;
//		}
	}

	public static void main08(String[] args) {
//		8.
//		(1)
//		Class Power{
//			public int kick;
//			public int punch;
//			
//			public Power() {
//				
//			}
//			
//			public Power(int kick, int punch) {
//				this.kick = kick;
//				this.punch = punch;
//			}
//		}
//		public class Example{
//			public static void main(String[] args) {
//				Power robot = new Power(10,20);
//			}
//		}
//		(2)
//		Class Power{
//			private int kick;
//			private int punch;
//			
//			public void setKick(int kick) {
//				this.kick = kick;
//			}
//			public int getKick() {
//				return kick;
//			}
//			
//			public void setPunch(int punch) {
//				this.punch = punch;
//			}
//			
//			public int getPunch() {
//				return punch;
//			}
//		}
//		public class Example{
//			public static void main(String[] args) {
//				Power robot = new Power();
//				robot.setKick(10);
//				robot.setPunch(20);
//			}
//		}
	}

	public static void main09(String[] args) {
//		9.
//		�Ҹ��ų��, ������, ���۷���, ������, �������÷���, System.gc()
	}

	public static void main10(String[] args) {
//		10.
//		(1) 
//		s�� ����Ű�� new String("Hello"+n);�� �ݺ������Ҽ��� ������ �߻�
//		(2)
//		������ �߻����� ����
	}

	public static void main11(String[] args) {
//		11. 4
		
	}

	public static void main12(String[] args) {
//		12. 1
	}

	public static void main13(String[] args) {
//		13. 
//		main�� static Ÿ���̹Ƿ� f()�Լ��� static Ÿ������ �ٲ��ش�.
//		class Test{
//			static public int f(int a, int b) {
//				return a+b;
//			}
//		}
//		public static void main(String[] args) {
//			int sum = f(2,4);
//		}
	}

	public static void main14(String[] args) {
//		14. 
//		1) x++ : final�� ���� ������ ������� ���Ѵ�.
//		2) extends Rect : final�� ���� Ŭ������ ��ӹ��� ���Ѵ�.
//		3) public void f() {
//			System.out.println(super.x);
//		}
//		final�� ���� �޼ҵ�� �������̵� ���� ���Ѵ�.
	}

	public static void main15(String[] args) {
//		15.
//		�������� new �����ڸ� �̿��Ͽ� �Ҵ�޾� ����ϴ� ���̻� ������� �ʴ� ��ü�� �迭�޸�
//		������ �÷���
//		���� : �������� �������� ���� �޸𸮰� �پ��� ���α׷� ���࿡ ������ �������� �������ִ�
//		������ �÷����� �ʿ��ϴ�.
//		���� 
//		- �������� �ٿ� ���� �޸��� ���� �ø� �� �ִ�.
//		����
//		- �������� ���ŵǴ� ���� ���α׷��� ���� ������ ������ �� �ִ�. 
	}

	public static void main16(String[] args) {
//					default		public		protected		private
//	���� ��Ű�� Ŭ����	   o		  o				o  			   x
//	�ٸ� ��Ű�� Ŭ����     x			  o 			x  			   x
	}
}
