import java.util.Scanner;
public class Choice {
        BasketballPlayer player;
        Scanner input = new Scanner(System.in);

        public static void main(String[] args) {
            System.out.println("Player evaluation");
            Choice player = new Choice();
            player.addInformation();
            player.printInformation();
            //driver.checkBestVehicle();
        } // End of Main

        public void addInformation() {
            System.out.print("Enter Name : ");
            String playerName = input.nextLine();
            System.out.print("Enter Speed(dribbling across the court)m/s : ");
            Double playerSpeed= input.nextDouble();
            System.out.print("Enter Height(cm) : ");
            Double playerHeight=input.nextDouble();
            System.out.print("Enter Shooting_ability(outstanding,excellent,good,normal) : ");
            String playerShooting_ability=input.next();
            System.out.print("Enter Breakthrough_ability(outstanding,excellent,good,normal) :");
            String playerBreakthrough_ability=input.next();
            System.out.print("Enter Assisting_ability(outstanding,excellent,good,normal) :");
            String playerAssisting_ability=input.next();

            player = new BasketballPlayer(playerName,playerSpeed,playerHeight,playerShooting_ability,playerBreakthrough_ability,playerAssisting_ability) ;

        }

       public void printInformation() {
            System.out.println(player);
        }

        //public void checkBestVehicle() {
            //System.out.print("Enter Number of Passengers : ");
            //int numPassengers = input.nextInt();
            //System.out.println("Passengers Entered : " + numPassengers);

            //if(numPassengers >= 1 && numPassengers <= 2)
                //System.out.println("EBike is Best");
            //else if(numPassengers >= 3 && numPassengers <= 5)
               // System.out.println("Car is Best : ");
            //else if(numPassengers >= 6 && numPassengers <= 20)
                //System.out.println("Bus is Best : ");
            //else
                //System.out.println("Sorry, no Vehicle Available");
       // } // End of checkBestVehicle method


}
