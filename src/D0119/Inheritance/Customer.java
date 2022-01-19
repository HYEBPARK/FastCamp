package D0119.Inheritance;

// 고객들의 멤버십 관리
// 일반고객과 VIPcustomer 의 서로 다른 서비스를 제공
// 물품 구매시 적용되는 할인율과 적립되는 포인트의 비율이 다름
// protected는 하위클래스에서는 접근가능, 하지만 외부클래스에서는 접근 불가
public class Customer {
    protected Long customerID;
    protected String customerName;
    protected String customerGrade;

    int bonusPoint;
    double pointRatio;

    public Customer(Long customerID, String customerName){
        this.customerID = customerID;
        this.customerName = customerName;

        customerGrade = "SIVER";
        pointRatio = 0.01;
    }

    public int calcPrice(int price){
        bonusPoint += price * pointRatio;
        return price;
    }

    public String showCustomerInfo(){
        return customerName +"님의 등급은 "+customerGrade+"이며, 보너스 포인트는 " + bonusPoint + "입니다.";
    }

    public Long getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Long customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

}
