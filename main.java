import java.util.Scanner;

public class main{
    public static void main(String args[]){
            Scanner obj = new Scanner(System.in);
            int myNumb = (int)(Math.random()*100);
            int userNumb;

            do{
                System.out.print("Guess the Number: ");
                userNumb = obj.nextInt();

                if(myNumb == userNumb){
                    System.out.println("WOOHOO...You've got it.");
                    break;
                }else if(userNumb > myNumb){
                    System.out.println("Your number is too large.");
                }else{
                    System.out.println("Your number is too small.");
                }
            }while(userNumb >= 0);

        System.out.println("You were supposed to guess: ");
        System.out.print(myNumb);
    }
}