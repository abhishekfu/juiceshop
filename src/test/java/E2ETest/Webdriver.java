package E2ETest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Webdriver {
    private static Webdriver instance = null;

    public WebDriver driver;

    private Webdriver() {
        WebDriverManager.chromedriver().setup();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "chrome");

        try {
            driver = new RemoteWebDriver(new URL("http://hub.com:4444/wd/hub"),
                    capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver = new ChromeDriver();
    }

    public static Webdriver getInstance() {
        if (instance == null) {
            instance = new Webdriver();
        }

        return instance;
    }
}
