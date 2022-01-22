package D0122.ReportInterface;

public class PriorityAllocation implements Scheduler{
    @Override
    public void getNextCall() {
        System.out.println("우선순위가 높은 고객 우선 방식입니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("담당 상담원을 배치합니다.");
    }
}
