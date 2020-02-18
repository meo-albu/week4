
public class Sentence {

    private Article article1 = new Article();
    private Noun noun1 = new Noun();
    private Verb verb = new Verb();
    private Preposition preposition = new Preposition();
    private Article article2 = new Article();
    private Noun noun2 = new Noun();
    private SentenceCreator sentenceCreator = new SentenceCreator();

    public String returnSentence() {
        return sentenceCreator.createSentence(article1, noun1, verb, preposition, article2, noun2);
    }
}
