package D0122.ReportAbstract;

public abstract class PlayerLevel {
    abstract void run();
    abstract void jump();
    abstract void turn();
    abstract void showLevelMessage();
    public void go(int num){
        run();
        for(int i = 0 ; i<num; i++) jump();
        turn();
    }
}
