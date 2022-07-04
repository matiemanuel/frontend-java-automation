package com.framework.driver;

import com.framework.config.ConfigLoader;
import com.framework.exceptions.InvalidBrowserException;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.framework.config.ConfigLoader.CONFIG;
import static java.time.Duration.of;
import static java.time.temporal.ChronoUnit.SECONDS;

public class Driver {
    private WebDriver webDriver;
    private WebDriverWait webDriverWait;

    public Driver() {
        super();
        try {
            setDriver();
        } catch (InvalidBrowserException e) {
            e.printStackTrace();
        }
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public WebDriverWait getWebDriverWait() {
        return webDriverWait;
    }

    private void setDriver() throws InvalidBrowserException {
        ConfigLoader.configLoaderMethod();
        String browser = CONFIG.getBrowser();
        switch (browser) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                options.addArguments("incognito");
                webDriver = new ChromeDriver(options);
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments("-private");
                webDriver = new FirefoxDriver(firefoxOptions);
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                webDriver = new EdgeDriver();
                break;
            default:
                throw new InvalidBrowserException();
        }
        if (webDriver != null) {
            webDriver.manage().timeouts().implicitlyWait(of(CONFIG.getImplicitWait(), SECONDS))
                    .pageLoadTimeout(of(CONFIG.getPageLoadTimeout(), SECONDS))
                    .scriptTimeout(of(CONFIG.getScriptTimeout(), SECONDS));
            webDriver.manage().window().maximize();
            webDriver.get(CONFIG.getBaseURL());
        }

        webDriverWait = new WebDriverWait(this.webDriver, of(CONFIG.getPageLoadTimeout(), SECONDS));
        webDriverWait.pollingEvery(of(CONFIG.getPollingEvery(), SECONDS))
                .ignoring(StaleElementReferenceException.class)
                .ignoring(NotFoundException.class);
    }
}
