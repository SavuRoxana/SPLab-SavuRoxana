package ro.uvt.info.designpatternslab2025;

public class Context {
    private int lineWidth;

    public Context() {
        this.lineWidth = 80;
    }

    public Context(int lineWidth) {
        this.lineWidth = lineWidth;
    }

    public int getLineWidth() {
        return lineWidth;
    }

    public void setLineWidth(int lineWidth) {
        this.lineWidth = lineWidth;
    }
}

