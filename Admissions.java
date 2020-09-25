import java.util.Scanner;

public class Admissions{
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );

        double sat, class_rank, awards;
        String residence;

        System.out.println("Enter your SAT score: ");
        sat = scan.nextInt();
        System.out.println("Enter your Class Rank: ");
        class_rank= scan.nextInt();
        System.out.println("Enter the number of Awards you have recieved: ");
        awards = scan.nextInt();
        System.out.println("Is your residence Colorado, Anywhere Else, or Florida: ");
        residence = scan.next();

        if(sat >= 1500){
            sat = elite;
        }

      }
}