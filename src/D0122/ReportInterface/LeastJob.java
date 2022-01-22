package D0122.ReportInterface;

public class LeastJob implements Scheduler{
    @Override
    public void getNextCall() {
        System.out.println("상담 전화를 대기가 적은 상담원 우선으로 불러옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("대기가 적은 상담원에게 배분합니다. ");
    }
}
