package parser;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by piatr on 31.07.18.
 */
public class SentenceParser implements Parser {

    @Override
    public String[] parse(String text) {
        return text.split(" ");
//        Pattern p = Pattern.compile(".+[^\\s]+");
//        Matcher m = p.matcher(text);
//        List<String> string = new ArrayList<>();
//        while (m.find()){
//            string.add(m.group());
//        }
//        String[] s = new  String[string.size()];
//        int i = 0;
//        for (String s1:string){
//            s[i] = s1;
//            i++;
//        }
//        return s;
    }

}
