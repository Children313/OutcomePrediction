public class BasketballPlayer {
private String name;
private double speed;//运球跨场速度
private double height;
private String shooting_ability;//outstanding,excellent,good,normal
private String breakthrough_ability;
private String assisting_ability;
    public BasketballPlayer(){
        this.name="Nick";
        this.speed=6.0;
        this.height=190.0;
        this.shooting_ability="outstanding";
        this.breakthrough_ability="outstanding";
        this.assisting_ability="outstanding";

    }
    public BasketballPlayer(String name, Double speed, Double height, String shooting_ability, String breakthrough_ability, String assisting_ability) {
        this.name = name;
        this.speed = speed;
        this.height = height;
        this.shooting_ability = shooting_ability;
        this.breakthrough_ability = breakthrough_ability;
        this.assisting_ability = assisting_ability;
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
