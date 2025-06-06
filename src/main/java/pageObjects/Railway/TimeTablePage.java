package pageObjects.Railway;

import common.Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class TimeTablePage extends GeneralPage{
    private By getBookTicketLink(String depart, String arrive) {
        return By.xpath("//tr[td[text()='Huế'] and td[text()='Sài Gòn']]//a[@href='BookTicketPage.cshtml?id1=5&id2=1']");
    }
    public void clickBookTicketLink(String depart, String arrive) {
        WebElement bookTicketLink = Constant.WEBDRIVER.findElement(getBookTicketLink(depart,arrive));
        JavascriptExecutor js = (JavascriptExecutor) Constant.WEBDRIVER;
        js.executeScript("arguments[0].scrollIntoView(true);",bookTicketLink);
        bookTicketLink.click();
    }
}
