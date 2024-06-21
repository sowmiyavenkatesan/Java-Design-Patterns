public class Stereo implements Device{

    @Override
    public void turnOn()
    {
        System.out.println("Stereo turned on");
    }

    @Override
    public void turnOff()
    {
        System.out.println("Stereo turned off");
    }

    public void adjustVolume()
    {
        System.out.println("Stereo volume adjusted");
    }
}
