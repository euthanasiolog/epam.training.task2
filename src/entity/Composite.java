package entity;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by piatr on 31.07.18.
 */
public class Composite implements Component {

    private List<Component> componentList = new ArrayList<>();

    public void addComponent (Component component) {
        componentList.add(component);
    }

    public void removeComponent (Component component) {
        componentList.remove(component);
    }

    @Override
    public void print(BufferedWriter bufferedWriter) throws IOException {
        for (Component c:componentList) {
            bufferedWriter.write(c.toString());
            bufferedWriter.write("\n");
        }
    }

    public List<Component> getComponentList() {
        return componentList;
    }

    @Override
    public String toString() {
        return null;
    }
}
