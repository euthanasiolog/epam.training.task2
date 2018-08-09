package parser;


import entity.Leaf;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by piatr on 31.07.18.
 */
public class ListingParser {

    public Leaf[] parse (String text) {
        Pattern p = Pattern.compile("Listing\\s.+\\n[}]");
        Matcher m = p.matcher(text);
        List<String> string = new ArrayList<>();
        while (m.find()){
            string.add(m.group());
        }
        Leaf[] res = new Leaf[string.size()];
        int i = 0;
        for (String s1:string){
            res[i].setLeaf(s1);
            i++;
        }
        return res;
    }

}
