public class TVObserver implements Observer{
    @Override
    public void update(String message)
    {
        System.out.println("Notifying message over TV: " + message);
    }
}
