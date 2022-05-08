package factorymethod;

import simplefactory.XMLUtil;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			TV tv;	//�½�һ�������Ʒ
			TVFactory factory;   //�½�һ�����󹤳�
			factory=(TVFactory)factorymethod.XMLUtil.getBean();	//��ȡ���幤��
			tv=factory.produceTV();//��ȡ�����Ʒ
			tv.play();//���ò�Ʒ�ں���
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
