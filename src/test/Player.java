package test;

// ������   - �ذ�
// getWordFromuser - �ذ�
// checkSuccess - �ذ�
public class Player {
	private String name="";
	String word="";
	
	Player(String name){
		setName(name);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	// �÷��̾ ���� �ܾ ��ȯ�ϴ� �Լ� ����
	public String getWordFromuser() {
		return word;
	}
	
	public boolean checkSuccess(String prevword) {
		int lastIndex = prevword.length()-1;		// ������ ���ڿ� ���� �ε���
		char lastChar = prevword.charAt(lastIndex);		// ������ ����
		char firstChar = word.charAt(0);			// ù ��° ����
			
		if(lastChar == firstChar) {
			return true;
		}
		else {
			return false;
		}
		
	}
}
