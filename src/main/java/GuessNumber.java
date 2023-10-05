import java.util.*;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner k =  new Scanner(System.in);
        Random rand = new Random();

        int upperbound = 25;
        int int_random = rand.nextInt(upperbound);

        System.out.printf("Guess a number between 1 and 25: ");
        int user_guess = 0;

        while(user_guess != int_random){
            while(!k.hasNextInt()){
                System.out.printf("Isn't a number retry: ");
                k.next();
            }
            user_guess = k.nextInt();
            if (user_guess < int_random){
                System.out.printf("To small. Retry: ");
            }
            else if (user_guess > int_random){
                System.out.printf("To big. Retry: ");
            }
            else{
                System.out.println("You win ! Congratulation !");
                System.exit(0);
            }
        }
    }
}
