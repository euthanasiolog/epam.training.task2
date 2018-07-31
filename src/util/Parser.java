package util;


import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by piatr on 31.07.18.
 */
public interface Parser {
    String[] parse (String text);
    static String[] goNext (String[] text, Parser parser) {
        String[] result = new String[0];
        for (String s:text){
            parser.parse(s);
            result = Stream.concat(Arrays.stream(result), Arrays.stream(parser.parse(s))).toArray(String[]::new);
        }
        return result;
    }
}
