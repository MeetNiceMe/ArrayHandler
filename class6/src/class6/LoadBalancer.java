package class6;

import java.util.*;
//���ؾ������࣬�䵱������ɫ
public class LoadBalancer {
	/*˽�о�̬��Ա����������Ψһʵ��,volatile��ָֹ����������
	 * ��֤�����߳̿������������һ�µ�
	 */
	private volatile static LoadBalancer instance=null;
	//����������
	private List serverList=null;
	//˽�й��캯��
	private LoadBalancer() {
		serverList = new ArrayList();
	}
	//���о�̬��Ա����������Ψһʵ��
	public static LoadBalancer getLoadBalancer() {
		/*Ϊʲô�ڽ���ͬ�������ʱ��Ҫ���н����пգ��������߳�A���߳�B��
		 * ��ʱ�߳�A���ж�instanceΪnull��������������ͬ������飬
		 * �����˶���Ȼ���߳�B�ٽ���ʱ�����Ͳ����ٽ���ͬ��������ˣ�
		 * ����ֱ�ӷ��أ�Ҳ��ʵҲ���������أ����Լӿ�ִ���ٶȡ�*/
		if(instance ==null) {
			synchronized(LoadBalancer.class) {
				/*
				 * Ϊʲô��ͬ��������л�Ҫ�ٽ���һ���ж��أ��������߳�A���߳�B��
				 * ����A�ȵ��÷�����B�����ŵ��ã���ʱA��B�ڷ���2�����пն��ǿգ�����A����ͬ������飬
				 * B���еȴ�����A����ͬ��������д����˶����A�߳��ͷ���������ʱB�ٽ��룬
				 * �����ʱ���ӷ���3���пգ�B�ֻᴴ��һ��ʵ���������Բ����Ϲ�ء�
				 */
				if(instance ==null) {
					instance =new LoadBalancer();
				}
			}
		}
		return instance;
	}
	//���ӷ�����
	public void addServer(String server) {
		serverList.add(server);
	}
	//ɾ��������
	public void removeServer(String server) {
		serverList.remove(server);
	}
	//ʹ��Random�������ȡ������
	public String getServer() {
		Random random =new Random();
		int i =random.nextInt(serverList.size());
		return (String)serverList.get(i);
	}
}
