package util;


/**
 * Created by piatr on 31.07.18.
 */
public class TextParser implements Parser {

    @Override
    public String[] parse(String text) {
        return text.split("\n");
    }

}
