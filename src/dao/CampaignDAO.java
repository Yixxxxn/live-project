package dao;

import pojo.Campaign;

public interface CampaignDAO {
	void add(Campaign c);//
	Campaign get();//��ȡ�����ִκ�
	void update(Campaign c);//�޸��ܵĿ�����
	int getTimes(); //��ȡĿǰ������
}
