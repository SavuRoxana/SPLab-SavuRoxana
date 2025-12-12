package ro.uvt.info.designpatternslab2025;

public class Section extends Element {
    private String title;

    public Section(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Section: " + title);
        for (Element child : children) {
            child.print();
        }
    }
}
