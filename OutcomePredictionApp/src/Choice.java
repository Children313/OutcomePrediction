import java.util.Scanner;



public class Choice {
        static BasketballPlayer player;
        static BasketballPlayer mark;
        Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        assessment();
    }

        public  static void assessment() {
            System.out.println("Player evaluation");
            float arr[]=new float[3];
            for(int a=0;a<3;a++){
            Choice player = new Choice();
            player.addInformation();
            player.printInformation();
            arr[a]=mark.getScore();}
            float totalscore=arr[0]+arr[1]+arr[2];
                System.out.println("The team's totalscore is "+totalscore);



        }


        public void addInformation() {
            System.out.print("Enter Name : ");
            String playerName = input.nextLine();
            System.out.print("Enter Speed(dribbling across the court)m/s : ");
            Double playerSpeed= input.nextDouble();
            if (playerSpeed>10||playerSpeed<0){
                System.out.println("Please enter reasonable speed again which should be between 0 and 10 m/s");
                playerSpeed = input.nextDouble();
            }
            System.out.print("Enter Height(cm) : ");
            Double playerHeight=input.nextDouble();
            if(playerHeight>300||playerHeight<100){
                System.out.println("Please enter reasonable height again which should be between 100 and 300 cm");
                playerHeight= input.nextDouble();
            }
            System.out.print("Enter Shooting_ability(outstanding,excellent,good,normal) : ");
            String playerShooting_ability=input.next();
            System.out.print("Enter Breakthrough_ability(outstanding,excellent,good,normal) :");
            String playerBreakthrough_ability=input.next();
            System.out.print("Enter Assisting_ability(outstanding,excellent,good,normal) :");
            String playerAssisting_ability=input.next();

            player = new BasketballPlayer(playerName,playerSpeed,playerHeight,playerShooting_ability,playerBreakthrough_ability,playerAssisting_ability) ;
            float playerscore = assignment(player.getShooting_ability(), player.getBreakthrough_ability(), player.getAssisting_ability()   );
            System.out.println("The score of the player is "+playerscore);
            mark=new BasketballPlayer(playerscore);
        }

       public void printInformation() {
            System.out.println(player);

        }
       public float assignment(String shootingAbility,String breakthroughAbility,String assistingAbility){
            String[]abilities=new String[3];
            abilities[0]=shootingAbility;
            abilities[1]=breakthroughAbility;
            abilities[2]=assistingAbility;
            int[]score=new int[3];
           for (int i = 0; i < abilities.length; i++) {
               if (abilities[i].equals("outstanding") ) {
                   score[i] = 100;
               } else if (abilities[i] .equals("excellent")) {
                   score[i] = 75;
               } else if (abilities[i] .equals("good")) {
                   score[i] = 50;
               } else if (abilities[i] .equals("normal")) {
                   score[i] = 25;
               }

            }
            return (score[0]+score[1]+score[2])/3;
       }




}
