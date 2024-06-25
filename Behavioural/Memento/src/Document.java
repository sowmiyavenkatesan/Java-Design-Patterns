public class Document {
    private String content;

    public Document(String content)
    {
        this.content = content;
    }

    public void writeContent(String content)
    {
        this.content += content;
    }

    public DocumentMemento createMemento()
    {
        return new DocumentMemento(this.content);
    }
}