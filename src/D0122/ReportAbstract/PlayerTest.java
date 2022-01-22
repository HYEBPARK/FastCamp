package D0122.ReportAbstract;

public class PlayerTest {
    public static void main(String[] args) {
        Player player = new Player();
        player.play(3);

        AdvancedLevel ALevel = new AdvancedLevel();
        player.upgradeLevel(ALevel);
        player.play(2);

        SuperLevel SLevel = new SuperLevel();
        player.upgradeLevel(SLevel);
        player.play(1);
    }
}
