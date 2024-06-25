import java.util.ArrayList;
import java.util.List;

public class History {
    List<DocumentMemento> documentMementos = new ArrayList<>();

    public void addToHistory(DocumentMemento documentMemento)
    {
        documentMementos.add(documentMemento);
    }

    public DocumentMemento getDocumentMemento(int index)
    {
        return documentMementos.get(index);
    }
}