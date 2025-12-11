package ro.uvt.info.designpatternslab2025;

public class Table extends Element {
    private String something;

    public Table(String something) {
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
        System.out.println("Table: " + something);
    }
}

