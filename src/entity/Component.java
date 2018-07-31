package entity;

import java.io.BufferedWriter;
import java.io.IOException;

/**
 * Created by piatr on 31.07.18.
 */
public interface Component {
    public void print(BufferedWriter bufferedWriter) throws IOException;
}
