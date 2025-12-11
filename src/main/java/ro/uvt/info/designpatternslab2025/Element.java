package ro.uvt.info.designpatternslab2025;

import java.util.ArrayList;
import java.util.List;

public abstract class Element {
    protected List<Element> children = new ArrayList<>();

    public abstract void print();

    public void add(Element element) {
        children.add(element);
    }

    public void remove(Element element) {
        children.remove(element);
    }

    public Element get(int index) {
        if (index >= 0 && index < children.size()) {
            return children.get(index);
        }
        return null;
    }

    public List<Element> getChildren() {
        return children;
    }
}

