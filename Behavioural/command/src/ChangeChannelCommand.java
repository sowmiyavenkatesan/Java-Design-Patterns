public class ChangeChannelCommand implements Command{
    TV tv;
    ChangeChannelCommand(TV tv)
    {
       this.tv = tv;
    }
    @Override
    public void execute()
    {
        tv.changeChannel();
    }
}
