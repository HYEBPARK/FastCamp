package D0122.ReportInterface;

import java.util.Scanner;

public class SchedulerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch = sc.next();
        Scheduler scheduler = null;
        if ( ch.equals("R") ||ch.equals("r")) {
            scheduler = new RoundRobin();
        }
        else if ( ch.equals("L") || ch.equals("l")) {
            scheduler = new LeastJob();
        }
        else if ( ch.equals("P") || ch.equals("p")) {
            scheduler = new PriorityAllocation();
        }
        else {
            System.out.println("지원되지 않는 기능입니다.");
            return;
        }

        scheduler.getNextCall();
        scheduler.sendCallToAgent();

    }
}
