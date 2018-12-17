import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        boolean user_right = true;
        while (user_right) {
            System.out.println("Raad kop (k) of munt (m)!");

            Scanner user_input = new Scanner(System.in);
            String user_guess = user_input.next();

            System.out.println("Je hebt geraden: " + user_guess);

            Random coin = new Random();
            int toss = coin.nextInt(2);
            if (toss == 1) {
                System.out.println("De munt is op kop geland");
            }
            if (toss == 0) {
                System.out.println("De munt is op munt geland");
            }

            int guess_number = 0;
            if (user_guess.equals("k")) {
                guess_number = 1;
            }
            if (user_guess.equals("m")) {
                guess_number = 0;
            }

            if (toss == guess_number) {
                System.out.println("Je hebt juist geraden!");
            }
            if (toss != guess_number) {
                System.out.println("Je hebt verkeerd geraden! Game over!");
                user_right = false;
            }
        }
    }
}