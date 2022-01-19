package D0119.Abstract;

public class Desktop extends Computer{

    @Override
    public void display() {
        System.out.println("화면이 보입니다.");
    }

    @Override
    public void typing() {
        System.out.println("타이핑을 합니다.");
    }
}
