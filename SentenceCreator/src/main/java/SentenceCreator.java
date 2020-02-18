import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class SentenceCreator {
    List<String> listOfWords = new ArrayList<>();

    public String createSentence(Article article1, Noun noun1, Verb verb, Preposition preposition, Article article2, Noun noun2) {
        listOfWords.add(article1.randomWord(article1.getArticles()));
        listOfWords.add(noun1.randomWord(noun1.getNouns()));
        listOfWords.add(verb.randomWord(verb.getVerbs()));
        listOfWords.add(preposition.randomWord(preposition.getPrepositions()));
        listOfWords.add(article2.randomWord(article2.getArticles()));
        listOfWords.add(noun2.randomWord(noun2.getNouns()));

        return StringUtils.capitalize(StringUtils.join(listOfWords, " "));
    }
}
