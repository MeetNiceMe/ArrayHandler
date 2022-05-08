package abstractfactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			EFactory factory;	//�½����󹤳�
			Television tv;	//�½������Ʒ����
			AirConditioner ac;	//�½������Ʒ�յ�
			factory=(EFactory)XMLUtil.getBean(); //ȷ�����幤��
			tv=factory.produceTelevision(); //�½�����
			tv.play();	//���ŵ���
			ac=factory.produceAirConditioner();//�½��յ�
			ac.changeTemperature();//���ÿյ��ں���
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
