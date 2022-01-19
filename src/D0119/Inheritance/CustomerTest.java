package D0119.Inheritance;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<>();
        Customer customerLee = new Customer(10010L, "LEE");
        Customer vipCustomer = new VIPCustomer(20020L, "KIM");
        Customer goldCustomer = new GoldCustomer(30030L, "PARK");
        customers.add(customerLee);
        customers.add(vipCustomer);
        customers.add(goldCustomer);
        int price = 10000;

        for(Customer custom : customers) {
            System.out.println(custom.getCustomerName()+"님이 "+custom.calcPrice(price) +"원을 지불하셨습니다.");
            System.out.println(custom.getCustomerName()+"님의 bonus point는 "+ custom.bonusPoint+"입니다. ");
        }




        // vc의 타입은 Customer , 인스턴스 타입은 VIPCustomer
//        Customer vc = new VIPCustomer(12345L, "test");
//        System.out.println(  vc.calcPrice(10000));
        // 가상함수 방식 : 실제 인스턴스의 메소드가 호출된다.
        // 자바에서는 항상 인스턴스의 메소드가 호출된다.
        // 즉 실행시 9000이 출력된다.
    }
}
