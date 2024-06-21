public class AdjustStereoVolumeCommand implements Command{
    Stereo stereo;
    AdjustStereoVolumeCommand(Stereo stereo)
    {
        this.stereo = stereo;
    }
    @Override
    public void execute()
    {
        stereo.adjustVolume();
    }
}
