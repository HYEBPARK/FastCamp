package D0122.ReportAbstract;

public class BeginnerLevel extends PlayerLevel{
    @Override
    void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    void jump() {
        System.out.println("jump 못합니다.");
    }

    @Override
    void turn() {
        System.out.println("turn 못합니다.");
    }

    @Override
    void showLevelMessage() {
        System.out.println("***** 초급자 레벨입니다. *****");
    }

}
