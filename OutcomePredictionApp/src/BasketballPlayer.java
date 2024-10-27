
public class BasketballPlayer {
private String name="Nick";
private double speed=6.0;//运球跨场速度
private double height=190.0;
private String shooting_ability="outstanding";//outstanding,excellent,good,normal
private String breakthrough_ability="outstanding";
private String assisting_ability="outstanding";
private float score;

    public BasketballPlayer(String name, Double speed, Double height, String shooting_ability, String breakthrough_ability, String assisting_ability) {
        setName(name);
        setSpeed(speed);
        setHeight(height);
        setShooting_ability(shooting_ability);
        setBreakthrough_ability(breakthrough_ability);
        setAssisting_ability(assisting_ability);
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
}
