public class DocumentMemento {

    private String content;

    public DocumentMemento(String content)
    {
        this.content = content;
    }

    public String getFromMemento()
    {
        return this.content;
    }
}