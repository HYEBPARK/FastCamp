package D0119.Polymorphism;

class Eagle extends Animal {

    @Override
    public void move() {
        System.out.println("독수리가 날아갑니다");
    }

    public void flying() {
        System.out.println("독수리가 날개를 파닥파닥합니다");
    }
}
