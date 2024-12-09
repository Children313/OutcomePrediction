import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class OutcomeAnalysis {
        static BasketballPlayer player;
        static BasketballPlayer mark;
        static BasketballPlayer team1PersonalScore;
        static BasketballPlayer team2PersonalScore;
        Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        File file=new File("C:\\Users\\鹿鸣\\Documents\\GitHub\\OutcomePrediction\\OutcomePredictionApp\\src\\Introduction of the whole OutcomeAnalysis team project");
        System.out.println(file.getName());
        System.out.println("You can see it here " + file.getAbsolutePath());
        new OutcomeAnalysis(1);

    }
    public OutcomeAnalysis(int a){
        displayTime();
        assessment();
        runMenu();
    }
    public OutcomeAnalysis(){

    }
        private int mainMenu(){
            System.out.println("""
                    OutcomeAnalysis Menu
                    --------------------
                    1)Team win probability prediction
                    2)Dislay all the players' scores from low to high
                    3)Find the highest score of all the players
                    4)Tell the number of players who got the score above 60
                    0)Exit
                    ==>>""");
            int option=input.nextInt();
            return option;
        }
        private void runMenu(){
              int option=mainMenu();
              while(option!=0){
                  switch(option){
                      case 1->prediction();
                      case 2->displayPersonalScore();
                      case 3->findHighestScore();
                      case 4-> tellNumbers();
                      default-> System.out.println("Invalid option entered:"+option);
                  }
                  System.out.println("\nPress enter key to continue...");
                  input.nextLine();
                  input.nextLine();
                  option=mainMenu();
              }
            System.out.println("Exiting...bye");
            System.exit(0);
        }

        public  static void assessment() {
            player.setup();
            System.out.println("\033[36mThe first team's player evaluation\033[0m");
            team1PersonalScore= new BasketballPlayer();
            float arr1[]=new float[3];
            for(int a=0;a<3;a++){
            OutcomeAnalysis player = new OutcomeAnalysis();
            player.addInformation();
            player.printInformation();
            arr1[a]=mark.getScore();
            }
            team1PersonalScore.setTeam1PlayerScore(arr1);
            float totalscore1=arr1[0]+arr1[1]+arr1[2];
            player.setTeam1totalscore(totalscore1);
            System.out.println("\033[31mThe first team's totalscore is \033[0m"+totalscore1);
            System.out.println("\033[36mThe second team's player evaluation\033[0m");
            team2PersonalScore =new BasketballPlayer();
            float arr2[]=new float[3];
            for(int a=0;a<3;a++){
                OutcomeAnalysis player = new OutcomeAnalysis();
                player.addInformation();
                player.printInformation();
                arr2[a]=mark.getScore();}
            team2PersonalScore.setTeam2PlayerScore(arr2);
            float totalscore2=arr2[0]+arr2[1]+arr2[2];
            player.setTeam2totalscore(totalscore2);
            float arr3[]=new float[]{arr1[0],arr1[1],arr1[2],arr2[0],arr2[1],arr2[2]};
            player.setTotalPlayerScore(arr3);
            System.out.println("\033[36mThe second team's totalscore is\033[0m "+totalscore2);


        }
        public void prediction(){
            if (player.getTeam1totalscore()<player.getTeam2totalscore()){
                System.out.println("\033[41mThe first team is more likely to win\033[0m");
            }
            else if(player.getTeam1totalscore()==player.getTeam2totalscore()){
                System.out.println("\033[41mThe two teams are equally likely to win\033[0m");
            }
            else{
                System.out.println("\033[41mThe second team is more likely to win\033[0m");
            }
        }

        public void displayPersonalScore(){
        float arr4[]=player.getTotalPlayerScore();
        for (int i=0;i<arr4.length;i++){
            for(int j=i+1;j<arr4.length;j++){
                if(arr4[i]>arr4[j]){
                    float t =arr4[i];
                    arr4[i]=arr4[j];
                    arr4[j]=t;
                }
            }
        }
         for (int k=0;k<arr4.length;k++){
            System.out.println(arr4[k]);}
        }

        public float highestScore(){
        float[] allScore=player.getTotalPlayerScore();
        float highestScore = allScore[0];
        for (int i=1;i<=5;i++){
            if(allScore[i]>highestScore)
                highestScore=allScore[i];
        }
        return highestScore;
    }
        public void findHighestScore(){
            float highestscore = highestScore();
            System.out.println("\033[42mThe highest score of all the player is\033[0m "+ highestscore);
        }

        public void addInformation() {
            player=new BasketballPlayer();
            System.out.print("Enter Name : ");
            String playerName = input.nextLine();
            player.setName(playerName);
            System.out.print("Enter Speed(dribbling across the court)m/s : ");
            Double playerSpeed= input.nextDouble();
            judgeSpeed(playerSpeed);
            System.out.print("Enter Height(cm) : ");
            Double playerHeight=input.nextDouble();
            judgeHeight(playerHeight);
            System.out.print("Enter Shooting_ability(outstanding,excellent,good,normal) : ");
            String playerShooting_ability=input.next();
            judgeShootingAbility(playerShooting_ability);
            System.out.print("Enter Breakthrough_ability(outstanding,excellent,good,normal) :");
            String playerBreakthrough_ability=input.next();
            judgeBreakthroughAbility(playerBreakthrough_ability);
            System.out.print("Enter Assisting_ability(outstanding,excellent,good,normal) :");
            String playerAssisting_ability=input.next();
            judgeAssistingAbility(playerAssisting_ability);
            float playerscore = assignment(player.getShooting_ability(), player.getBreakthrough_ability(), player.getAssisting_ability()   );
            System.out.println("\033[33mThe score of the player is\033[0m "+playerscore);
            mark=new BasketballPlayer(playerscore);
        }

    private void judgeSpeed(Double playerSpeed){
        if (playerSpeed>10||playerSpeed<0){
            System.out.println("Please enter reasonable speed again which should be between 0 and 10 m/s");
            playerSpeed = input.nextDouble();
            judgeSpeed(playerSpeed);
        }
        else{
            System.out.println("Add successfully");
            player.setSpeed(playerSpeed);
        }
    }

    private void judgeHeight(Double playerHeight){
        if(playerHeight>300||playerHeight<100){
            System.out.println("Please enter reasonable height again which should be between 100 and 300 cm");
            playerHeight= input.nextDouble();
            judgeHeight(playerHeight);
        }
        else{
            System.out.println("Add successfully");
            player.setHeight(playerHeight);
        }
    }

    private void judgeShootingAbility(String playerShooting_ability) {
        if (!playerShooting_ability.equals("outstanding")&&!playerShooting_ability.equals("excellent")&&!playerShooting_ability.equals("good")&&!playerShooting_ability.equals("normal")){
            System.out.println("Please type reasonable words");
            playerShooting_ability = input.next();
            judgeShootingAbility(playerShooting_ability);
        }
        else{
            System.out.println("Add successfully");
            player.setShooting_ability(playerShooting_ability);
        }
    }


    private void judgeBreakthroughAbility(String playerBreakthrough_ability) {
        if (!playerBreakthrough_ability.equals("outstanding")&&!playerBreakthrough_ability.equals("excellent")&&!playerBreakthrough_ability.equals("good")&&!playerBreakthrough_ability.equals("normal")){
            System.out.println("Please type reasonable words");
            playerBreakthrough_ability = input.next();
            judgeShootingAbility(playerBreakthrough_ability);
        }
        else{
            System.out.println("Add successfully");
            player.setBreakthrough_ability(playerBreakthrough_ability);
        }
    }
    private void judgeAssistingAbility(String playerAssisting_ability) {
        if (!playerAssisting_ability.equals("outstanding")&&!playerAssisting_ability.equals("excellent")&&!playerAssisting_ability.equals("good")&&!playerAssisting_ability.equals("normal")){
            System.out.println("Please type reasonable words");
            playerAssisting_ability = input.next();
            judgeShootingAbility(playerAssisting_ability);
        }
        else{
            System.out.println("Add successfully");
            player.setAssisting_ability(playerAssisting_ability);
        }
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

        public void tellNumbers(){
        float[] allScore=player.getTotalPlayerScore();
        int a=0;
        for (int i=1;i<allScore.length;i++){
            if(allScore[i]>60){
                a++;
            }
        }
        System.out.println("\033[43mThe number of players who got the score above 60 is \033[0m"+a);

    }

    public void displayTime(){
        LocalDateTime now=LocalDateTime.now();
        DateTimeFormatter dtf =DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String nowStr=dtf.format(now);
        System.out.println(nowStr);
    }

    }


