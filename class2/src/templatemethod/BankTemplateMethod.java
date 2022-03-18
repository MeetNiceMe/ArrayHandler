package templatemethod;

public abstract class BankTemplateMethod {
	public void takeNumber() {
		System.out.println("ȡ���Ŷӣ�");
	}
	public abstract void transact();
	public boolean WantsInvest() {
		return true;
	}
	public void evaluate() {
		System.out.println("�������֣�");
	}
	public void invest() {
		System.out.println("��ѯ���");
	}
	public void process() {
		this.takeNumber();
		this.transact();
		this.evaluate();
		if(WantsInvest()) {
			invest();
		}
	}
}
