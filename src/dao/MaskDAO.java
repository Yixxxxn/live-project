package dao;

import pojo.Reservation;

public interface MaskDAO {
	void add(Reservation user); //�����ݿ����ԤԼ����
    void update(int id,String status); //����ԤԼ��ź��н�״̬������ԤԼ������н����
    Reservation list(int id);  //����ԤԼ��ŷ���Ҫ��ѯ��ԤԼ���������
    boolean query(String id,int times);//�������֤�ź͵�ǰ�������ж��Ƿ��б���
    boolean queryTel(String tel,int times);//�����ֻ��ź͵�ǰ�������ж��Ƿ��б���
}
