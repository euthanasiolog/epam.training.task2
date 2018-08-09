package entity;

import java.io.BufferedWriter;
import java.io.IOException;

/**
 * Created by piatr on 31.07.18.
 */
public class Leaf implements Component {

    public Leaf(String leaf, int count) {
        this.leaf = leaf;
        this.count = count;
    }

    public Leaf() {
    }

    private String leaf;

    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getLeaf() {
        return leaf;
    }

    public void setLeaf(String leaf) {
        this.leaf = leaf;
    }

    @Override
    public String toString() {
        return leaf;
    }

    @Override
    public void print(BufferedWriter bufferedWriter) throws IOException {
        bufferedWriter.write(leaf);
        bufferedWriter.write(" ");
    }
}
