package util;


import entity.Leaf;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.*;

/**
 * Created by piatr on 31.07.18.
 */
public class WordSorter {

    public static void sort (String[] words, char required, BufferedWriter bufferedWriter) {

        Set<Leaf> word = new HashSet<>();
        for (String s:words) {
            char[] chars = s.toCharArray();
            int i = 0;
            for (char c:chars){
                if (c==required) i++;
            }
            word.add(new Leaf(s, i));
        }
        word.stream().sorted(Comparator.comparingInt(Leaf::getCount)).forEach(leaf -> {
            try {
                leaf.print(bufferedWriter);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
