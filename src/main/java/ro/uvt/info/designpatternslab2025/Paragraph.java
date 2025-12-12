package ro.uvt.info.designpatternslab2025;

public class Paragraph extends Element {
    private String text;
    private AlignStrategy textAlignment;

    public Paragraph(String text) {
        this.text = text;
        this.textAlignment = new AlignLeft();
    }

    public Paragraph(String text, AlignStrategy textAlignment) {
        this.text = text;
        this.textAlignment = textAlignment;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public AlignStrategy getTextAlignment() {
        return textAlignment;
    }

    public void setTextAlignment(AlignStrategy textAlignment) {
        this.textAlignment = textAlignment;
    }

    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.textAlignment = alignStrategy;
    }

    @Override
    public void print() {
        if (textAlignment != null) {
            textAlignment.render(this, new Context());
        } else {
            System.out.println("Paragraph: " + text);
        }
    }
}
