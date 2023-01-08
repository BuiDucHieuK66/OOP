package bridgeex;

public class WindowsOS implements OperatingSystem {
    @Override
    public void startup() {
        System.out.println("WindowsOS start up!");
    }

    @Override
    public void loadUrl(String url) {
        System.out.println("load " + url + " from Microsoft Edge");
    }
}
