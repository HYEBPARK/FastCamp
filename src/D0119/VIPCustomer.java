package D0119;

// vip 등급
// 포인트 적립 비율 10%
public class VIPCustomer extends Customer{

    private String agentID;
    double salesRatio;

    public VIPCustomer(Long customerID, String customerName){
        super(customerID, customerName);

        pointRatio = 0.05;
        customerGrade = "VIP";
        salesRatio = 0.1;
    }

    // overriding : 상위 클래스에 정의된 메서드의 구현 내용이 하위 클래스에서 구현할 내용과
    // 맞지 않는 경우 하위 클래스에서 동일한 이름의 메서드를 재정의 할 수 있음
    // 정의 부분이 똑같아야한다.
    @Override
    public int calcPrice(int price) {
        bonusPoint += price * pointRatio;
        price -= (int) (price * salesRatio);
        return super.calcPrice(price);
    }

    public String getAgentID() {
        return agentID;
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }
}
