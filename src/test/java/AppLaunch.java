import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class AppLaunch {
    public static AndroidDriver driver;
    public static AppLaunch instance;

    private AppLaunch() throws MalformedURLException, InterruptedException {
        setUp();
    }

    public static AppLaunch getInstance() throws IOException, InterruptedException {
        if (instance == null) {
            instance = new AppLaunch();
        }
        return instance;
    }
    private void setUp() throws MalformedURLException, InterruptedException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "My Phone");
        cap.setCapability("platformName", "Android");
        cap.setCapability("appPackage", "com.chaldal.poached");
        cap.setCapability("appActivity", "com.chaldal.poached.MainActivity");
        cap.setCapability("autoGrantPermissions", true);
        //File file = new File(getClass().getResource("/chaldal.apk").getFile());
        //cap.setCapability(MobileCapabilityType.APP, file.getAbsolutePath() );
        URL url=new URL("http://127.0.0.1:4723/wd/hub");
        driver=new AndroidDriver(url,cap);
        Thread.sleep(3000);
    }
}

