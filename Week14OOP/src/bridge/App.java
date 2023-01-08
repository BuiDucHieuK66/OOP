package bridge;

public class App {
    public static void main(String[] args) {
        Tv LG = new Tv();
        AdvanceRemoteControl RemoteLG = new AdvanceRemoteControl(LG);

        RemoteLG.mute();
        System.out.println(LG.getChannel());
        RemoteLG.channelDown();
        System.out.println(LG.getChannel());
        RemoteLG.channelDown();
        System.out.println(LG.isEnabled());
    }
}
