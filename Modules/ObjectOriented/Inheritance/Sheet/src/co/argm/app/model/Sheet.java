package co.argm.app.model;

public abstract class Sheet {
    protected String content;

    protected Sheet(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return content;
    }
}
