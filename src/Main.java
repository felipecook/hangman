import java.util.Scanner;

public class Main {

  private static Scanner scanner = new Scanner(System.in);

  private static Hangman hangman = new Hangman();

  public static void main(String[] args) {

    boolean quit = false;

    playGame();


    while (!quit) {
      System.out.println("\nEnter action: (Press 0 to redisplay available choices)");
      int choice = scanner.nextInt();
      scanner.nextLine();
      switch (choice) {
        case 0:
          printMenu();
          break;
        case 1:
          playGame();
          break;
        case 2:
          System.out.println("\nShutting down...");
          quit = true;
          break;
      }
    }




    int numberOfWords = Integer.parseInt(scanner.nextLine());

    String testString = hangman.generateRandomString(numberOfWords);
    System.out.println(testString);

  }

  private static void playGame() {
    System.out.println("Hello and welcome to the game of Hangman");
    System.out.println("Please enter the number of words you would like to guess:");
  }

  private static void printMenu() {
    System.out.println("Please select your choice: ");
    System.out.println("Press 0 to re-display the choices.");
    System.out.println("Press 1 to play the game");
    System.out.println("Press 2 to quit.");
  }

}
