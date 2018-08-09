package parser;


/**
 * Created by piatr on 31.07.18.
 */
public class WordParser implements Parser {

    @Override
    public String[] parse(String text) {
        char[] chars = text.toCharArray();
        String[] strings = new String[chars.length];
        for (int i=0;i<chars.length;i++) {
            strings[i] = String.valueOf(chars[i]);
        }
        return strings;
    }

}
