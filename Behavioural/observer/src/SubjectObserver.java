import java.util.ArrayList;
import java.util.List;

public class SubjectObserver implements Subject{

    List<Observer> observers = new ArrayList<>();
    String weather = "";
    @Override
    public void addListeners(Observer observer)
    {
        observers.add(observer);
    }

    @Override
    public void removeListeners(Observer observer)
    {
        observers.remove(observer);
    }

    @Override
    public void notifyListeners()
    {
        this.observers.forEach(observer -> {
            observer.update(this.weather);
        });
    }

    public void setWeather(String weather)
    {
        this.weather = weather;
        notifyListeners();
    }
}