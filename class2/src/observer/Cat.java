package observer;

public class Cat extends MySubject{
	public void cry() {
		System.out.println("è��");
		System.out.println("-------------------------");
		//�����й۲��߷���֪ͨ
		for(Object obs:observers) {
			((MyObserver)obs).response();
		}
	}
}
