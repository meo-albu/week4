import java.util.Random;

public class Word implements Randomizer {

    @Override
    public String randomWord(String[] arrayOfWords) {
        Random rand = new Random();
        return arrayOfWords[rand.nextInt(arrayOfWords.length)];
    }
}
