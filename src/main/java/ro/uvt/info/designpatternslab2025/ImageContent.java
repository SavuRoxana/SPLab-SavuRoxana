package ro.uvt.info.designpatternslab2025;

public class ImageContent {
    private byte[] data;
    private String format;

    public ImageContent(byte[] data, String format) {
        this.data = data;
        this.format = format;
    }

    public ImageContent() {
        this.data = new byte[0];
        this.format = "unknown";
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}

