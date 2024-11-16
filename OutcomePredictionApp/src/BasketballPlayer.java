import java.util.concurrent.TimeUnit;

public class BasketballPlayer {
private String name="Nick";
private double speed=6.0;//运球跨场速度
private double height=190.0;
private String shooting_ability="outstanding";//outstanding,excellent,good,normal
private String breakthrough_ability="outstanding";
private String assisting_ability="outstanding";
private float score;
private float[] team1PlayerScore;
private float[] team2PlayerScore;
private float[] totalPlayerScore;
private float team1totalscore;
private float team2totalscore;


    public BasketballPlayer(String name, Double speed, Double height, String shooting_ability, String breakthrough_ability, String assisting_ability) {
        setName(name);
        setSpeed(speed);
        setHeight(height);
        setShooting_ability(shooting_ability);
        setBreakthrough_ability(breakthrough_ability);
        setAssisting_ability(assisting_ability);
    }
    public BasketballPlayer(){

    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public BasketballPlayer(float score){
        this.score=score;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {

        this.speed = speed;



    }
    public float[] getTeam1PlayerScore() {
        return team1PlayerScore;
    }

    public void setTeam1PlayerScore(float[] team1PlayerScore) {
        this.team1PlayerScore = team1PlayerScore;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {

        this.height = height;

    }

    public String getShooting_ability() {
        return shooting_ability;
    }

    public void setShooting_ability(String shooting_ability) {
        this.shooting_ability = shooting_ability;
    }

    public String getBreakthrough_ability() {
        return breakthrough_ability;
    }

    public void setBreakthrough_ability(String breakthrough_ability) {
        this.breakthrough_ability = breakthrough_ability;
    }

    public String getAssisting_ability() {
        return assisting_ability;
    }

    public void setAssisting_ability(String assisting_ability) {
        this.assisting_ability = assisting_ability;
    }
    public float[] getTeam2PlayerScore() {
        return team2PlayerScore;
    }

    public void setTeam2PlayerScore(float[] team2PlayerScore) {
        this.team2PlayerScore = team2PlayerScore;
    }
    public float getTeam1totalscore() {
        return team1totalscore;
    }

    public void setTeam1totalscore(float team1totalscore) {
        this.team1totalscore = team1totalscore;
    }

    public float getTeam2totalscore() {
        return team2totalscore;
    }

    public void setTeam2totalscore(float team2totalscore) {
        this.team2totalscore = team2totalscore;
    }
    public float[] getTotalPlayerScore() {
        return totalPlayerScore;
    }

    public void setTotalPlayerScore(float[] totalPlayerScore) {
        this.totalPlayerScore = totalPlayerScore;
    }





    @Override
    public String toString() {
        return "BasketballPlayer{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", height=" + height +
                ", shooting_ability='" + shooting_ability + '\'' +
                ", breakthrough_ability='" + breakthrough_ability + '\'' +
                ", assisting_ability='" + assisting_ability + '\'' +
                '}';
    }
    public static void setup() {
        System.out.println("///////////////////////////////////////");
        System.out.println("\033[43mOutcome Analysis\033[0m");
        System.out.println("///////////////////////////////////////");
        System.out.println();
        System.out.println();
        System.out.print("Please wait while the system loads...");
        try {
            System.out.print("...");
            TimeUnit.SECONDS.sleep(1);
            System.out.print("...");
            TimeUnit.SECONDS.sleep(1);
            System.out.print("...");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("...");
            System.out.println();
        }
        catch(Exception e) {}
    }
}
