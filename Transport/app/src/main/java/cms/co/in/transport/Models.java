package cms.co.in.transport;

public class Models {
    private String text;
    int image;

    public String getText() {
        return text;
    }

    public int getImage() {
        return image;
    }

    public Models(String text, int image) {

        this.text = text;
        this.image = image;
    }
}
