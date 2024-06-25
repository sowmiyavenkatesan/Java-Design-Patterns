public class Main {
    public static void main(String[] args) {
        // This pattern is used to store every single state of an object as
        // snapshots and return any state at any point.

        Document document = new Document("Content 1..initial snapshot 1\n");
        History history = new History();
        history.addToHistory(document.createMemento());
        document.writeContent("Content 2..snapshot 2\n");
        history.addToHistory(document.createMemento());
        document.writeContent("Content 3..snapshot 3\n");
        history.addToHistory(document.createMemento());
        DocumentMemento documentMemento = history.getDocumentMemento(1);
        System.out.println(documentMemento.getFromMemento());
    }
}