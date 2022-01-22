package D0122.ReportAbstract;

public class SuperLevel extends PlayerLevel{
    @Override
    void run() {
        System.out.println("아주 빨리 슝 달려요");
    }

    @Override
    void jump() {
        System.out.println("완전 높이 피융 jump 해요");
    }

    @Override
    void turn() {
        System.out.println("획 turn 해요");
    }

    @Override
    void showLevelMessage() {
        System.out.println("***** 고급자 레벨입니다. *****");
    }
}
