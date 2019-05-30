import java.util.Random;

public class Hangman {

  private String randomWord;

  public String generateRandomWords(int numberOfWords) {

    Random random = new Random();
    char[] chars = new char[random.nextInt(8) + 3];


    for (int i = 0; i < numberOfWords; i++) {

      for (int j = 0; j < chars.length; j++) {
        chars[j] = (char) random.nextInt('a' + 27);
      }


    }

    return randomWord = chars.toString();
  }




}
