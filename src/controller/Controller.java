package controller;

import parser.*;
import java.io.*;

/**
 * Created by piatr on 31.07.18.
 */
public class Controller {
    private static String text;

    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/resources/text.txt"))) {
            StringBuilder stringBuilder = new StringBuilder();
            String s;
            while ((s = bufferedReader.readLine())!= null) {
                stringBuilder.append(s);
                stringBuilder.append("\n");
            }
            text = stringBuilder.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        parseText(text);
        rebuiltText();
    }

    private static void parseText (String text) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/resources/dest_text.txt"))) {
            TextParser textParser = new TextParser();
            String[] paragraph = textParser.parse(text);
            printText(paragraph, bufferedWriter, "\n");
            bufferedWriter.write("*");
            String[] sentence = Parser.goNext(paragraph, new ParagraphParser());
            printText(sentence, bufferedWriter, "\n");
            String[] word = Parser.goNext(sentence, new SentenceParser());
            sort(word, 'a');
            printText(word, bufferedWriter, "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printText (String[] text, BufferedWriter bufferedWriter, String separator) throws IOException {
        for (String s:text) {
            bufferedWriter.write(s);
            bufferedWriter.write(separator);
        }
    }

    private static void rebuiltText () {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/resources/dest_text.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/resources/rebuilt_text.txt"))) {
            StringBuilder stringBuilder = new StringBuilder();
            String s;
            while ((s = bufferedReader.readLine())!= null) {
                stringBuilder.append(s);
                stringBuilder.append("\n");
            }
            text = stringBuilder.toString();
            String[] rebuilt = text.split("\\*");
            bufferedWriter.write(rebuilt[0]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void sort (String [] words, char required) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/resources/sorted_text.txt"))){
            WordSorter.sort(words, required, bufferedWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
