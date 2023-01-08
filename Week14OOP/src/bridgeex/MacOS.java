package bridgeex;

public class MacOS implements OperatingSystem{
    @Override
    public void startup() {
        System.out.println("MacOS start up!");
    }

    @Override
    public void loadUrl(String url) {
        System.out.println("load " + url + " from Safari");
    }
}
