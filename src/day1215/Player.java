package day1215;


public class Player {
	private String name = "";
	private String word = "";
	
	// �����ڿ� String name�� ���ڰ����� �Ͽ� setName�� ȣ���ؼ� �̸� �ʱ�ȭ
	public Player(String name) {
		setName(name);
	}
	
	// private name �� ������� getName()
	public String getName() {
		return name;
	}
	// private name�� �ʱ�ȭ�ϱ� ���� setName();
	public void setName(String name) {
		this.name = name;
	}

	
	// ����ڷκ��� �ܾ �Է¹޴� class
	public void setWord(String word) {
		this.word = word;
	}
	
	// private word ������ ������� getWordFromUser()
	public String getWordFromUser() {
		return word;
	}
	
	// �Է¹��� ���ڰ� �����Ǹ� ��� �������Ǹ� player �����ϴ�. ����
	public boolean checkSuccess(String prevword) {
		int lastIndex = prevword.length() -1;
		char lastChar = prevword.charAt(lastIndex);
		char firstChar = word.charAt(0);
		// ���� �ܾ��� �������� ����ڰ� �Է��� �ܾ��� ù��°�� 
		// ������ true, �ٸ��� false ��ȯ
		if(lastChar==firstChar) {
			return true;
		}else
			return false;
	}
	
	
	
}


