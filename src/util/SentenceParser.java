package util;

/**
 * Created by piatr on 31.07.18.
 */
public class SentenceParser implements Parser {

    @Override
    public String[] parse(String text) {
        return text.split(" ");
    }

}
