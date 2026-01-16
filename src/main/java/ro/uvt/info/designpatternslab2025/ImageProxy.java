package ro.uvt.info.designpatternslab2025;

public class ImageProxy extends Element {
    private String url;
    private Image realImg;

    public ImageProxy(String url) {
        this.url = url;
        this.realImg = null; // Lazy initialization
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    private Image loadImage() {
        if (realImg == null) {
            realImg = new Image(url);
        }
        return realImg;
    }

    public Image getRealImg() {
        return loadImage();
    }

    @Override
    public void print() {
        Image image = loadImage();
        image.print();
    }
}

