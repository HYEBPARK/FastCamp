package D0119.Inheritance;

public class GoldCustomer extends Customer{

    double saleRatio;

    public GoldCustomer(Long customerID, String customerName) {
        super(customerID, customerName);
        saleRatio = 0.1;
        pointRatio = 0.02;
        customerGrade = "GOLD";
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * pointRatio;
        return price - (int)(price * saleRatio);
    }
}
