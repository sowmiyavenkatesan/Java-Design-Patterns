public class RemoteControl {

    Command command;

    public void setRemoteControl(Command command)
    {
        this.command = command;
    }

    public void pressButton()
    {
        command.execute();
    }
}