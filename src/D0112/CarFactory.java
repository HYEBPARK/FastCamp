package D0112;

public class CarFactory {
    private static CarFactory instance = new CarFactory();

    private CarFactory(){
        // 생성자는 외부에서 호출하지 못하게 private로 지정
    }

    public static CarFactory getInstance() {
        if(instance == null) instance = new CarFactory();
        return instance;
    }

    public Car createCar(){
        Car car = new Car();
        return car;

    }
}
