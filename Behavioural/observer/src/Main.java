public class Main {
    public static void main(String[] args) {

        PhoneObserver phoneobserver = new PhoneObserver();
        TVObserver tvObserver = new TVObserver();

        SubjectObserver subjectObserver = new SubjectObserver();

        // Subscribing TV and Mobile Listener
        subjectObserver.addListeners(phoneobserver);
        subjectObserver.addListeners(tvObserver);

        // Notify the Listeners
        System.out.println("**********************");
        subjectObserver.setWeather("Feels like 21°C");

        // Removing TV Listener
        subjectObserver.removeListeners(tvObserver);

        // Notify the Listeners (Phone is the only subscriber now)
        System.out.println("**********************");
        subjectObserver.setWeather("Feels like 38°C");
    }
}