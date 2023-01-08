package bridge;

public class AdvanceRemoteControl extends RemoteControl {
    public AdvanceRemoteControl(Device device) {
        super(device);
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
