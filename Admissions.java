import java.util.Scanner;

public class Admissions{
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );

        double sat, class_rank, awards;
        String residence, last_name;

        System.out.println("Enter your SAT score: ");
        sat = scan.nextInt();
        System.out.println("Enter your Class Rank Percentile: ");
        class_rank= scan.nextInt();
        System.out.println("Enter the number of Awards you have recieved: ");
        awards = scan.nextInt();
        System.out.println("Is your residence Colorado, Anywhere Else, or Florida: ");
        residence = scan.next();
        System.out.println("What is your last name: ");
        last_name = scan.next();

        if(sat >= 1500 || class_rank == 95 || awards >= 10 || residence == "Colorado"){
             System.out.println("Student is at the elite level and should be accepted");
        } else if (sat >= 1400 && sat < 1499 && class_rank == 90 || sat >= 1400 && sat < 1499 && awards >= 7 && awards < 10) {
            System.out.println("Student is at the solid level and should be accepted");
         } else if(class_rank == 90 && awards >= 7 && awards < 10){ //I think this is 2 solid so if my program has two thats why
            System.out.println("Student is at the solid level and should be accepted");
         } else if(sat >= 1200 && sat < 1400 && class_rank == 85 || sat >= 1200 && sat < 1400 && awards >= 3 && awards < 7 || sat >= 1200 && sat < 1400 && residence == "Anywhere Else"){//I think this is 2 acceptables so if my program has two thats why
             System.out.println("Student is at the acccepted level and should be accepted");
         } else if(class_rank == 80 && awards >= 3 && awards < 7 || class_rank == 80 && residence == "Anywhere Else"){
            System.out.println("Student is at the accepted level and should be accepted");
         } else if(awards >= 3 && awards < 7 && residence == "Anywhere Else"){
           System.out.println("Student is at the accepted level and should be accepted");
         } else if(last_name == "Padjen"){
             System.out.println("Student has the last name Padjen and should be accepted");
         } else {
             System.out.println("Student has been denied");
         }
        }
    }