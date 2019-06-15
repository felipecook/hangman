public class Main {



  public static void main(String[] args) {
    Hangman hangman = new Hangman();
    String testString = hangman.generateRandomString(3);
    System.out.println(testString);
  }

}
