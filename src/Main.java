import java.util.Scanner;

public class Main {



  public static void main(String[] args) {
    Hangman hangman = new Hangman();


    Scanner scanner = new Scanner(System.in);



    System.out.println("Hello and welcome to the game of Hangman");
    System.out.println("Please enter the number of words you would like to guess:");
    int numberOfWords = Integer.parseInt(scanner.nextLine());

    String testString = hangman.generateRandomString(numberOfWords);
    System.out.println(testString);

  }

}
