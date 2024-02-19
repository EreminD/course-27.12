package ru.inno.course.patterns;

import com.sun.jdi.ObjectReference;

public class WebDriverFactory {

//    public WebDriver createBrowser()
    public Object createBrowser(BrowserNames browserName){
        if (browserName == BrowserNames.CHROME){
            return null; // new ChromeDriver()
        }

        if (browserName == BrowserNames.FIREFOX){
            return null;// new FirefoxDriver()
        }
        return null;
    }

    public void test(){
        createBrowser(BrowserNames.CHROME);
    }
}
