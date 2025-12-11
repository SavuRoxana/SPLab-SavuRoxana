package ro.uvt.info.designpatternslab2025;

public class TableOfContents extends Element {
    private String something;

    public TableOfContents(String something) {
        this.something = something;
    }

    public String getSomething() {
        return something;
    }

    public void setSomething(String something) {
        this.something = something;
    }

    @Override
    public void print() {
        System.out.println("TableOfContents: " + something);
    }
}

