public class Main {
    public static void main(String[] args) {
        // Separation of Concerns. Sender and Receiver are being abstracted from each other
        // with the help of remote control
        TV tv = new TV();
        Stereo stereo = new Stereo();

        TurnOnCommand turnOnTVCommand = new TurnOnCommand(tv);
        TurnOnCommand turnOnStereoCommand = new TurnOnCommand(stereo);

        RemoteControl tvRemoteControl = new RemoteControl();
        tvRemoteControl.setRemoteControl(turnOnTVCommand);

        RemoteControl stereoRemoteControl = new RemoteControl();
        stereoRemoteControl.setRemoteControl(turnOnStereoCommand);

        tvRemoteControl.pressButton();
        stereoRemoteControl.pressButton();
        tv.changeChannel();
        stereo.adjustVolume();
    }
}