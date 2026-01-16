package ro.uvt.info.designpatternslab2025;

public class Image extends Element {
    private String url;
    private ImageContent content;

    public Image(String url) {
        this.url = url;
        this.content = new ImageContent(); // Initialize with empty content
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ImageContent content() {
        return content;
    }

    public ImageContent getContent() {
        return content;
    }

    public void setContent(ImageContent content) {
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println("Image with name: " + url);
    }
}
