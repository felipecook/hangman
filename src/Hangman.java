import java.util.Random;

public class Hangman {

  private String randomWord = "";

  String generateRandomString(int numberOfWords) {


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

  boolean guessRandomLetter(String charAsString) {

    char c = charAsString.charAt(0);

    for (int i = 0; i < randomWord.length(); i++) {
      if (randomWord.charAt(i) == c) {
        return true;
      }
    }

    return false;
  }

}

