public class PhoneObserver implements Observer{

    @Override
    public void update(String message)
    {
        System.out.println("Notifying message over phone: " + message);
    }
}
