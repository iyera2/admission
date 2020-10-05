import java.util.Random; 
import java.util.Scanner; 

//calculate average rolls
//calculate average score
//percent of player that have more than four rolls
public class SnakeEyes{
    

    public static void main(String[] args) {
        
    
        Scanner scanner = new Scanner(System.in); 
        Random random = new Random(); 
        
        boolean snakeEyes = false; 
        int i = 0, die1, die2;
        int time;
        int turns = 0;
        int score = 0;
        System.out.println("How many times do you want to run the simulation: ");
        time = scanner.nextInt(); 

        
        while(i < time){
            
            if(snakeEyes == false){ 
                die1 = random.nextInt(6);
                die2 = random.nextInt(6);
                // int die3 = (die1 + die2)/2; don't really know how to do the average thing for me I tried a few things and it doesn't
                if (die1 == die2){
                    snakeEyes = true; 
                } else{
                    turns +=1; 
                    score = die1 + die2; 
                    System.out.println("Your score is" + score);
                    // System.out.println(die3 * time);
                }
                // if(i < 3){
                //     System.out.println("You have more than 4 rolls");
                // }
            }
            i += 1;
            
        }
    }


}
