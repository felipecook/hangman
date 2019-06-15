import java.util.Random;

public class Hangman {



  public String generateRandomString(int numberOfWords) {

    String randomWord = "";
    Random random = new Random();
    char[] chars = new char[random.nextInt(8) + 3];


    for (int i = 0; i < numberOfWords; i++) {

      for (int j = 0; j < chars.length; j++) {
        chars[j] = (char) random.nextInt('a' + 27);

      }

    }

    randomWord = String.copyValueOf(chars);
    return randomWord;
  }


}

