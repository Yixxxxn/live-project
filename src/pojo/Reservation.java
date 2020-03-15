package pojo;

public class Reservation {
    private String reserveNum; // ԤԼ�ִα��
    private String name; // ��ʵ����
    private String ID; // ���֤��
    private String tel; // �ֻ���
    private String number; // ԤԼ����
    private String status; // δ����0 or δ�н�1 or�н�2
    private String winningNum; // �н�����

    //���в��������Ĺ���
    public Reservation(String reserveNum,String name,String ID,String tel,String number,String status,String winningNum) {
        this.reserveNum=reserveNum;
        this.name=name;
        this.ID=ID;
        this.tel=tel;
        this.number=number;
        this.status=status;
        this.winningNum=winningNum;
    }
    
    //Ĭ��status="0"��winningNum=""
    public Reservation(String reserveNum, String name, String ID, String tel, String number) {
        this.reserveNum = reserveNum;
        this.name = name;
        this.ID = ID;
        this.tel = tel;
        this.number = number;
        status="0";
        winningNum="";
    }

    public void setResereNum(String reserveNum) {
        this.reserveNum=reserveNum;
    }
    
    public void setName(String name) {
        this.name=name;
    }
    
    public void setID(String ID) {
        this.ID=ID;
    }
    
    public void setTel(String tel) {
        this.tel=tel;
    }
    
    public void setNumber(String number) {
        this.number=number;
    }
    
    public void setStatus(String status) {
        this.status=status;
    }
    
    public void setWinnningNum(String winningNum) {
        this.winningNum=winningNum;
    }

    public String getReserveNum() {
        return reserveNum;
    }

    public void setReserveNum(String reserveNum) {
        this.reserveNum = reserveNum;
    }

    public String getWinningNum() {
        return winningNum;
    }

    public void setWinningNum(String winningNum) {
        this.winningNum = winningNum;
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public String getTel() {
        return tel;
    }

    public String getNumber() {
        return number;
    }

    public String getStatus() {
        return status;
    }
}
