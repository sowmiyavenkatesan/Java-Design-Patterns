public interface Subject {

    void addListeners(Observer observer);

    void removeListeners(Observer observer);

    void notifyListeners();
}